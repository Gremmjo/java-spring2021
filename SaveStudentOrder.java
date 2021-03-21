package app1;

public class SaveStudentOrder {

    public static void main(String[] args) {

        StudentOrder so;
        so = new StudentOrder();
        so.hFirstName = "Алексей";
        so.hLastName = "Петров";
        so.wFirstName = "Полина";
        so.wLastName = "Петрова";
         long ans = saveStudentOrder(so);
        System.out.println(ans);

    }

     static long saveStudentOrder(StudentOrder studentOrder){
        long answer = 199;
         System.out.println("saveSudentOrder : " + studentOrder.hFirstName + " " + studentOrder.wFirstName );
         return answer;
    }
}
