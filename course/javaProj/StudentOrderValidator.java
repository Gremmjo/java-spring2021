package com.course.javaProj;

import com.course.javaProj.domain.*;
import com.course.javaProj.mail.MailSender;
import com.course.javaProj.validator.*;

public class StudentOrderValidator {

    public static void main(String[] args) {

        checkAll();
    }


    static StudentOrder readStudentOrder(){
        StudentOrder so = new StudentOrder();
        return so;
    }

    static AnswerCityRegister checkCityRegister(StudentOrder so){
        CityRegisterValidator crv = new CityRegisterValidator();
        crv.hostName = "host 1";
        crv.login = "login 1";
        crv.password = "1111";

        AnswerCityRegister ans = crv.checkCityRegister(so);
        ans.success = false;

        return ans;
    }

    static AnswerWedding chekWedding(StudentOrder so){


        WeddingValidator wv = new WeddingValidator();
        AnswerWedding ans = wv.checkWedding(so);
        return ans;
    }

    static AnswerChildren chekChildren(StudentOrder so){

        ChildrenValidator cv = new ChildrenValidator();
        AnswerChildren ans = cv.checkChildren(so);
        return  ans;
    }

    static AnswerStudent checkStudent(StudentOrder so){

        StudentValidator sv = new StudentValidator();
        AnswerStudent ans = sv.checkStudent(so);
       return ans;
    }

    static void sendMail(StudentOrder so){
        MailSender ms = new MailSender();
        ms.sendMail(so);
    }

    static  void checkAll(){



        while (true) {
            StudentOrder so = readStudentOrder();
                if(so == null){
                    break;
                }

                AnswerCityRegister cityAnswer = checkCityRegister(so);

                if(!cityAnswer.success){
                    //continue;
                    break;
                }
                AnswerWedding weddAnswer = chekWedding(so);
                AnswerChildren childAnswer = chekChildren(so);
                AnswerStudent studentAnswer = checkStudent(so);

                sendMail(so);

                so = readStudentOrder();
        }
    }
}
