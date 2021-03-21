package app1;

import app1.*;

public class StudentOrderValidator {

    public static void main(String[] args) {

        chekAll();
    }


    static StudentOrder readStudentOrder(){
        StudentOrder so = new StudentOrder();
        return so;
    }

    static AnswerCityRegister checkCityRegister(StudentOrder so){
        System.out.println("City Register is Running");
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.success = false;
        return ans;
    }

    static AnswerWedding chekWedding(StudentOrder so){
        System.out.println("Wedding running ");
        return new AnswerWedding();
    }

    static AnswerChildren chekChildren(StudentOrder so){
        System.out.println("Children Check is running");
        return new AnswerChildren();
    }

    static AnswerStudent checkStudent(StudentOrder so){
        System.out.println("Student Checking");
        return new AnswerStudent();
    }

    static void sendMail(StudentOrder so){

    }

    static  void chekAll(){



        while (true) {
            StudentOrder so = readStudentOrder();
                if(so == null){
                    break;
                }

                AnswerCityRegister cityAnswer = checkCityRegister(so);

                if(!cityAnswer.success){
                    continue;
                }
                AnswerWedding weddAnswer = chekWedding(so);
                AnswerChildren childAnswer = chekChildren(so);
                AnswerStudent studentAnswer = checkStudent(so);

                sendMail(so);

                so = readStudentOrder();
        }
    }
}
