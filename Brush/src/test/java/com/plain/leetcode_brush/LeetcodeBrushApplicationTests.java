package com.plain.leetcode_brush;

import com.plain.leetcode_brush.StringSolution.ReverseString;
import com.plain.leetcode_brush.StringSolution.ReverseVowels;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@SpringBootTest
class LeetcodeBrushApplicationTests {

    @Test
    void contextLoads() {
        RemoveDuplicatesFromSortedArray rdf = new RemoveDuplicatesFromSortedArray();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        rdf.removeDuplicates(nums);
    }

    @Test
    void contextLoads2(){
        IntegertoRoman2 integertoRoman2 = new IntegertoRoman2();
        System.out.println(integertoRoman2.intToRoman(1135));//MCXXXV
    }

    @Test
    void contextLoads3(){
          RomantoInteger romantoInteger = new RomantoInteger();
//        System.out.println(romantoInteger.RomantoInt("I"));
//        System.out.println(romantoInteger.RomantoInt("XV"));
//        System.out.println(romantoInteger.RomantoInt("XCVII"));
//        System.out.println(romantoInteger.RomantoInt("CXCVIII"));
//        System.out.println(romantoInteger.RomantoInt("CCCXCIX"));
//        System.out.println(romantoInteger.RomantoInt("MMCMXCV"));
//        System.out.println(romantoInteger.RomantoInt("MMMI"));//"LVIII"
        System.out.println(romantoInteger.RomantoInt("LVIII"));//"LVIII"
    }

    @Test
    void  contextLoadsCountAndSay(){
        CountandSay countandSay = new CountandSay();
        System.out.println(countandSay.countAndSay(2));
        System.out.println(countandSay.countAndSay(3));
        System.out.println(countandSay.countAndSay(4));
        System.out.println(countandSay.countAndSay(5));
        System.out.println(countandSay.countAndSay(6));

        //System.out.println("nihao");
//        System.out.println(countandSay.countAndSay(4));
//        System.out.println(countandSay.countAndSay(5));
//        System.out.println(countandSay.countAndSay(6));
//        System.out.println(countandSay.countAndSay(7));
    }

    //leetcode38 参考别人的答案
    @Test
    void contextLoadsCDS(){
        CountAndSayDiscuss1 cds =  new CountAndSayDiscuss1();
        System.out.println(cds.countAndSay(5));
        System.out.println(cds.countAndSay(6));
    }

    @Test
    void contextLoads26() {
        RemoveDuplicatesFromSortedArray rdf = new RemoveDuplicatesFromSortedArray();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(rdf.removeDuplicates(nums));
    }


    @Test
    void contextLoads15(){
        String str1 = "flower";
        String str2 = "flow";
        String str3 = "float";
        String str4 = "ow";
//        String str4 = "er";
//        System.out.println(str1.indexOf(str2));
//        System.out.println(str1.indexOf(str3));
//        //System.out.println(str1.isEmpty());
//        System.out.println(str1.indexOf(str3));
//        System.out.println(str1.indexOf(str4));
        System.out.println(str1.indexOf(str4));
    }

    @Test
    void  contextLoads58(){
        IntOfLastWord intOfLastWord = new IntOfLastWord();
        //System.out.println(intOfLastWord.intOfLastWord("   Hello"));
        System.out.println(intOfLastWord.intOfLastWord("hello"));
        System.out.println(intOfLastWord.intOfLastWord(""));
        System.out.println("a  ");
        System.out.println(intOfLastWord.intOfLastWord("  a "));
    }
    @Test
    void contextLoads28(){
        String str1 = new String("");
        String str2 = new String("");
        ImplementStr implementStr = new ImplementStr();
        System.out.println(implementStr.strStr(str1,str2));
        //System.out.println();

    }

    @Test
    void contextLoadsDate() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse("2020-01-30");
        //Date d = sdf.parse(“2017-01-31”);
        Calendar cld = Calendar.getInstance();
        cld.setTime(d);
        cld.add(Calendar.MONTH, 1);
        Date d2 = cld.getTime();
        System.out.println(sdf.format(d)+"加一月："+sdf.format(d2));
    }

    @Test
    void contextLoadsAddBinary(){
        AddBinary addBinary = new AddBinary();
        String a = new String("11011");
        String b = new String("111111");
        System.out.println(addBinary.addBinary(a,b));
    }


    @Test
    void contextLoadsReverseVowels(){
        String s = new String("leetcode");
        ReverseVowels  reverseVowels = new ReverseVowels();
        System.out.println(reverseVowels.reverseVowels(s));
        int [][] a =new int[3][3];
        System.out.println(a[0][0]);
    }

    @Test
    void contextLoadsFindCommonCharacters(){
        String[] A = {"bella","label","roller"};
        List<String> result = FindCommonCharacters.commonChars(A);
    }
}
