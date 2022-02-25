package com.plain.lab;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.plain.lab.**.dao.plus")
public class LABApplication {

    public static void main(String[] args) {

        SpringApplication.run(LABApplication.class, args);

        System.out.println("////////////////////////////////////////////////////////////////////");
        System.out.println("//                          _ooOoo_                               //");
        System.out.println("//                         o8888888o                              //");
        System.out.println("//                         88\" . \"88                              //");
        System.out.println("//                         (| ^_^ |)                              //\n");
        System.out.println("//                         O\\  =  /O                              //\n");
        System.out.println("//                      ____/`---'\\____                           //\n");
        System.out.println("//                    .'  \\\\|     |//  `.                         //\n");
        System.out.println("//                   /  \\\\|||  :  |||//  \\                        //\n");
        System.out.println("//                  /  _||||| -:- |||||-  \\                       //\n");
        System.out.println("//                  |   | \\\\\\  -  /// |   |                       //\n");
        System.out.println("//                  | \\_|  ''\\---/''  |   |                       //\n");
        System.out.println("//                  \\  .-\\__  `-`  ___/-. /                       //\n");
        System.out.println("//                ___`. .'  /--.--\\  `. . ___                     //\n");
        System.out.println("//              .\"\" '<  `.___\\_<|>_/___.'  >'\"\".                  //\n");
        System.out.println("//            | | :  `- \\`.;`\\ _ /`;.`/ - ` : | |                 //\n");
        System.out.println("//            \\  \\ `-.   \\_ __\\ /__ _/   .-` /  /                 //\n");
        System.out.println("//      ========`-.____`-.___\\_____/___.-`____.-'========         //\n");
        System.out.println("//                           `=---='                              //\n");
        System.out.println("//      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^        //\n");
        System.out.println("//            早睡早起       永不宕机      永无BUG                　　 //\n");
        System.out.println("////////////////////////////////////////////////////////////////////\n");
    }



}
