package com.dacistudio.calback.vo;

import com.dacistudio.calback.service.callBack;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

/**
 * 老师对象,继承回调接口
 */
@Data
public class Teacher implements callBack {

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

    }

    /**
     * 实现告诉答案这个方法
     * @param answer
     */
    @Override
    public void tellAnswer(String answer) {
        log.
    }
}
