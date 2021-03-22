package app1;

public class CityRegisterValidator {

    static AnswerCityRegister checkCityRegister(StudentOrder so){
        System.out.println("City Register is Running");
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.success = false;
        return ans;
    }
}
