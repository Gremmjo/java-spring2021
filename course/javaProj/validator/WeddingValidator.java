package com.course.javaProj.validator;

import com.course.javaProj.domain.AnswerWedding;
import com.course.javaProj.domain.StudentOrder;

public class WeddingValidator {

     public AnswerWedding checkWedding(StudentOrder so){
        System.out.println("Wedding running ");
        return new AnswerWedding();
    }
}
