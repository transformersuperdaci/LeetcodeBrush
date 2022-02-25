package com.dacistudio.calback.vo;

import com.dacistudio.calback.service.CallBack;

/**
 * 学生Ricky解决了老师提出的问题
 */
public class Ricky implements Student{
    @Override
    public void resolveQuestion(CallBack callBack) {
        // 模拟解决问题
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 回调，告诉老师写作业的情况
        callBack.tellAnswer("3");
    }
}
