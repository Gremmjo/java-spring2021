package com.course.javaProj.validator;

import com.course.javaProj.domain.AnswerCityRegister;
import com.course.javaProj.domain.StudentOrder;

public class CityRegisterValidator {

    public String hostName;
    protected  int port;
    public String login;
    public String password;

 public AnswerCityRegister checkCityRegister(StudentOrder so){
        System.out.println("City Register is Running" + hostName + ", "
        +login + ", " + password);
        AnswerCityRegister ans = new AnswerCityRegister();

        return ans;
    }
}
