package com.plain.leetcode_brush;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LeetcodeBrushApplicationTests {

    @Test
    void contextLoads() {
        IntegertoRoman integertoRoman = new IntegertoRoman();
        System.out.println(integertoRoman.intToRoman(1));
        System.out.println(integertoRoman.intToRoman(15));
        System.out.println(integertoRoman.intToRoman(97));
        System.out.println(integertoRoman.intToRoman(198));
        System.out.println(integertoRoman.intToRoman(399));
        System.out.println(integertoRoman.intToRoman(2995));
        System.out.println(integertoRoman.intToRoman(3001));



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
}
