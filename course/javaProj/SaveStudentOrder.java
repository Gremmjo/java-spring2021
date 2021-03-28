package com.course.javaProj;

import com.course.javaProj.domain.Adult;
import com.course.javaProj.domain.StudentOrder;

public class SaveStudentOrder {

    public static void main(String[] args) {
        buildStudentOrder();
      //  StudentOrder so;
     //   so = new StudentOrder();
        // long ans = saveStudentOrder(so);
      //  System.out.println(ans);

    }

     static long saveStudentOrder(StudentOrder studentOrder){
        long answer = 199;
         System.out.println("saveSudentOrder : "  );
         return answer;
    }
    static StudentOrder buildStudentOrder(){
        StudentOrder so = new StudentOrder();
        Adult husband = new Adult();
        husband.setGivenName("Anton");
        husband.setSurName("Petrov");
        husband.setPassportSeria("213214");
        so.setHusband(husband);


        String ans = husband.getPersonString();
        System.out.println(ans);

        return so;
    }
}
