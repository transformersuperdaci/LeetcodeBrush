package com.dreamltd.practice.utils;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.HashSet;
import java.util.Set;
/**
*@author:feng
*@date: 2022/4/1
*@description:  汉语短语生成拼音，能识别多音字
**/

public class Phrase2PinyinUtils {
    /**
     * 获取一段文字的所有拼音组合情况,以Set<String>形式返回
     */
    public static Set<String> getHardPinyins(String s){
        if(StringUtils.isBlank(s)){
            // null时处理，后边处理时报错
            s = "";
        }
        // 存放整个字符串的各个字符所有可能的拼音情况，如果非汉字则是它本身
        String[][] allPinyins = new String[s.length()][];
        //把这段文字转成字符数组
        char[] words = s.toCharArray();
        for(int i = 0; i < words.length; i++){
            // 每个字符的所有拼音情况
            allPinyins[i] = getAllPinyins(words[i]);
        }
        // 用递归，求出这个2维数组每行取一个数据组合起来的所有情况
        String[] resultArray = recursionArrays(allPinyins, allPinyins.length,0);
        Set<String> resultSet = new HashSet<>();
        for (String string : resultArray) {
            resultSet.add(string);
        }
        // 返回set
        return resultSet;
    }

    /**
     * 获取包含一个字符的拼音（多音字则以数组形式返回多个）,非汉字则返回字符本身
     */
    public static String[] getAllPinyins(char word){
        // 创建拼音输入格式类
        HanyuPinyinOutputFormat pinyinFormat = new HanyuPinyinOutputFormat();
        // 指定格式中的大小写属性为小写
        pinyinFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        // 指定音标格式无音标
        pinyinFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        // 指定用v表示ü
        pinyinFormat.setVCharType(HanyuPinyinVCharType.WITH_V);
        String[] formatPinyin = new String[]{};
        try {
            // 获取对应的汉字拼音，不是汉字返回空
            formatPinyin = PinyinHelper.toHanyuPinyinStringArray(word, pinyinFormat);
            if (ObjectUtils.isNotEmpty(formatPinyin)){
                int i = 0;
                for (String str : formatPinyin) {
                    if (str.length() > 1) {
                        formatPinyin[i] = str;
                        i++;
                    }
                }
            } else {
                if (Character.isLetterOrDigit(word)) {
                    formatPinyin = new String[1];
                    //返回读音,如果多音字自返回一个
                    formatPinyin[0] = String.valueOf(word);
                } else {
                    formatPinyin = new String[1];
                    // 返回读音,如果多音字则返回一个
                    formatPinyin[0] = "";
                }
            }
            // 抛出异常，捕获异常
        } catch (BadHanyuPinyinOutputFormatCombination e) {
            e.printStackTrace();
        }

        return formatPinyin;
    }

    /**
     * 用递归方法，求出这个二维数组每行取一个数据组合起来的所有情况，返回一个字符串数组
     * @param s 求组合数的2维数组
     * @param len 此二维数组的长度，省去每一次递归长度计算的时间和空间消耗，提高效率
     * @param cursor 类似JDBC、数据库、迭代器里的游标，指明当前从第几行开始计算求组合数，此处从0开始（数组第一行）
     * 				   避免在递归中不断复制剩余数组作为新参数，提高时间和空间的效率
     * @return String[] 以数组形式返回所有的组合情况
     */
    public static String[] recursionArrays(String[][] s, int len, int cursor){
        // 递归条件,直至计算到还剩2行
        if(cursor <= len-2) {
            int len1 = s[cursor].length;
            int len2 = s[cursor+1].length;
            // 上下2行的总共的组合情况
            int newLen = len1*len2;
            // 存上下2行中所有的组合情况
            String[] temp = new String[newLen];
            int index = 0;
            // 嵌套循环遍历，求出上下2行中，分别取一个数据组合起来的所有情况
            for(int i = 0; i < len1; i++){
                for(int j = 0; j < len2; j++){
                    temp[index] = s[cursor][i] + s[cursor+1][j];
                    index ++;
                }
            }
            // 把当前计算到此行的所有组合结果放在cursor+1行
            s[cursor+1] = temp;
            // 游标指向下一行，即上边的数据结果
            cursor++;
            return recursionArrays(s, len, cursor);
        } else {
            // 返回最终的所有组合结果
            return s[len-1];
        }
    }

    public static void main(String[] args) {
        String s = "车友车行";
        System.out.println(getHardPinyins(s));

    }
}

