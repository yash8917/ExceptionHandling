import java.security.spec.RSAOtherPrimeInfo;

public class ThrowExa {
    //function to check if person is eligible to vote
    public static  void validation(int age){
        if (age<18){
            //throw Arithmetic Excption if not eligible to vote
            throw new ArithmeticException("Person is not eligible to vote ");
        }else {
            System.out.println("Person is not eligible to vote.");
        }
    }

    public static void main(String[] args) {
        // Calling the function
        validation(16);
        System.out.println("rest of the code.");
    }
}
