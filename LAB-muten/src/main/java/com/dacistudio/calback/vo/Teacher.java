package com.dacistudio.calback.vo;

import com.dacistudio.calback.service.CallBack;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * 老师对象,继承回调接口
 */
@Data
@Slf4j
public class Teacher implements CallBack {

    // 学生
    private Student student;

    /**
     * 构造函数
     * @param student
     */
    public Teacher(Student student) {
        this.student = student;
    }

    // 老师的方法： 提问
    public void askQuestion(){

        student.resolveQuestion(this);

    }

    /**
     * 实现告诉答案这个方法
     * @param answer
     */
    @Override
    public void tellAnswer(String answer) {
        System.out.println("知道了，你的答案是：" + answer);
    }
}
