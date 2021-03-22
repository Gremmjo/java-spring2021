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
        return CityRegisterValidator.checkCityRegister(so);
    }

    static AnswerWedding chekWedding(StudentOrder so){
       return WeddingValidator.chekWedding(so);
    }

    static AnswerChildren chekChildren(StudentOrder so){
      return  ChildrenValidator.chekChildren(so);
    }

    static AnswerStudent checkStudent(StudentOrder so){
       return StudentValidator.checkStudent(so);
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
