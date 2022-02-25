package com.dacistudio.calback.test;

import com.dacistudio.calback.vo.Ricky;
import com.dacistudio.calback.vo.Student;
import com.dacistudio.calback.vo.Teacher;
import org.junit.Test;

public class CallBackTest {

    @Test
    public void testCallBack(){
        Student student = new Ricky();
        Teacher teacher = new Teacher(student);

        teacher.askQuestion();

    }

}
