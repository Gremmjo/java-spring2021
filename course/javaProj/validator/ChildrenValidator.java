package com.course.javaProj.validator;

import com.course.javaProj.domain.AnswerChildren;
import com.course.javaProj.domain.StudentOrder;

public class ChildrenValidator {
     public AnswerChildren checkChildren(StudentOrder so){
        System.out.println("Children Check is running");
        return new AnswerChildren();
    }
}
