package com.dreamltd.practice.utils;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;

import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;


import java.util.*;
import java.util.stream.Collectors;

/**
 * @author QuS
 * @date 2022/3/31 21:52
 */
public class PinyinUtils {

    private static HanyuPinyinOutputFormat hanyuPinyinOutputFormat;

    static {
        hanyuPinyinOutputFormat = new HanyuPinyinOutputFormat();
        //2.设置好格式
        hanyuPinyinOutputFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        hanyuPinyinOutputFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
    }

    public static void main(String[] args) throws BadHanyuPinyinOutputFormatCombination {
        String chinese = "给我一首歌的时间";
        System.out.println("中文:>>" + chinese);
        System.out.println("全拼:>>" + convertToFullPinYin(chinese));
        System.out.println("第一个汉字全拼:>>" + convertToFullAbbMixPinYin(chinese));
        System.out.println("全部汉字首字符:>>" + convertToFirstLetterPinYin(chinese));

    }

    /**
     * 根据中文获取拼音全拼
     *
     * @param chinese
     * @return
     * @throws BadHanyuPinyinOutputFormatCombination
     */
    public static Set<String> convertToFullPinYin(String chinese) throws BadHanyuPinyinOutputFormatCombination {
        List<String> pinyinFullList = new ArrayList<>();
        for (int i = 0; i < chinese.length(); i++) {
            char chineseChar = chinese.charAt(i);
            if (String.valueOf(chineseChar).matches("[\\u4E00-\\u9FA5]+")) {
                //是中文
                String[] currentPinyinArray = PinyinHelper.toHanyuPinyinStringArray(chineseChar, hanyuPinyinOutputFormat);
                if (pinyinFullList.isEmpty()) {
                    pinyinFullList = Arrays.asList(currentPinyinArray);
                    continue;
                }
                pinyinFullList = getCartesian(pinyinFullList, Arrays.asList(currentPinyinArray));
            } else {
                //不是中文
                for (int j = 0; j < pinyinFullList.size(); j++) {
                    pinyinFullList.set(j, pinyinFullList.get(j) + chineseChar);
                }
            }
        }

        return pinyinFullList.stream().collect(Collectors.toSet());
    }

    /**
     * 根据中文获取首字母拼音
     *
     * @param chinese
     * @return
     * @throws BadHanyuPinyinOutputFormatCombination
     */
    public static Set<String> convertToFirstLetterPinYin(String chinese) throws BadHanyuPinyinOutputFormatCombination {
        List<String> pinyinFullList = new ArrayList<>();
        for (int i = 0; i < chinese.length(); i++) {
            char chineseChar = chinese.charAt(i);
            if (String.valueOf(chineseChar).matches("[\\u4E00-\\u9FA5]+")) {
                //是中文
                String[] currentPinyinArray = getFirstLetterPinYin(chineseChar, hanyuPinyinOutputFormat);
                if (pinyinFullList.isEmpty()) {
                    pinyinFullList = Arrays.asList(currentPinyinArray);
                    continue;
                }
                pinyinFullList = getCartesian(pinyinFullList, Arrays.asList(currentPinyinArray));
            } else {
                //不是中文
                for (int j = 0; j < pinyinFullList.size(); j++) {
                    pinyinFullList.set(j, pinyinFullList.get(j) + chineseChar);
                }
            }
        }

        return pinyinFullList.stream().collect(Collectors.toSet());
    }

    /**
     * 根据中文获取拼音字符
     * 第一个汉字的全拼,其余汉字取首字符
     * todo 目前可能有bug
     *
     * @param chinese
     * @return
     */
    public static Set<String> convertToFullAbbMixPinYin(String chinese) throws BadHanyuPinyinOutputFormatCombination {
        List<String> pinyinFullList = new ArrayList<>();
        for (int i = 0; i < chinese.length(); i++) {
            char chineseChar = chinese.charAt(i);
            if (String.valueOf(chineseChar).matches("[\\u4E00-\\u9FA5]+")) {
                //是中文
                String[] currentPinyinArray;
                if (i == 0) {
                    currentPinyinArray = PinyinHelper.toHanyuPinyinStringArray(chineseChar, hanyuPinyinOutputFormat);
                } else {
                    currentPinyinArray = getFirstLetterPinYin(chineseChar, hanyuPinyinOutputFormat);
                }
                if (pinyinFullList.isEmpty()) {
                    pinyinFullList = Arrays.asList(currentPinyinArray);
                    continue;
                }
                pinyinFullList = getCartesian(pinyinFullList, Arrays.asList(currentPinyinArray));
            } else {
                //不是中文
                for (int j = 0; j < pinyinFullList.size(); j++) {
                    pinyinFullList.set(j, pinyinFullList.get(j) + chineseChar);
                }
            }
        }

        return pinyinFullList.stream().collect(Collectors.toSet());
    }

    /**
     * 获取汉字的首字符
     *
     * @param chineseChar
     * @param hanyuPinyinOutputFormat
     * @return
     * @throws BadHanyuPinyinOutputFormatCombination
     */
    private static String[] getFirstLetterPinYin(char chineseChar, HanyuPinyinOutputFormat hanyuPinyinOutputFormat) throws BadHanyuPinyinOutputFormatCombination {
        String[] currentPinyinArray = PinyinHelper.toHanyuPinyinStringArray(chineseChar, hanyuPinyinOutputFormat);
        String[] firstLetterPinYin = new String[currentPinyinArray.length];
        for (int i = 0; i < currentPinyinArray.length; i++) {
            firstLetterPinYin[i] = String.valueOf(currentPinyinArray[i].charAt(0));
        }
        return firstLetterPinYin;
    }

    /**
     * 两个list笛卡尔积
     *
     * @param list1
     * @param list2
     * @return
     */
    private static List<String> getCartesian(List<String> list1, List<String> list2) {
        List<String> set = new ArrayList<>();
        for (String str : list1) {
            for (String str2 : list2) {
                set.add(str + str2);
            }
        }
        return set;
    }
}

