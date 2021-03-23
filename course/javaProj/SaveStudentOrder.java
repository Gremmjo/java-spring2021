package com.course.javaProj;

import com.course.javaProj.domain.StudentOrder;

public class SaveStudentOrder {

    public static void main(String[] args) {

        StudentOrder so;
        so = new StudentOrder();
        so.sethFirstName("Алексей");
        so.sethLastName("Петров");
        so.setwFirstName("Полина");
        so.setwLastName("Петрова");
         long ans = saveStudentOrder(so);
        System.out.println(ans);

    }

     static long saveStudentOrder(StudentOrder studentOrder){
        long answer = 199;
         System.out.println("saveSudentOrder : " + studentOrder.gethFirstName() + " " + studentOrder.gethLastName() );
         return answer;
    }
}
