public class CatchBlockExa {
    public static void main(String[] args) {
        try{
            int i=50/0;
            // if exception occurs , the remaining statement will not excecute
            System.out.println("Rest of the code1");
        }
        catch(ArithmeticException obj){ // this excption is child class exception
            //this line is print the description of the error
            System.out.println(obj);

            // print the default message to the user.
            System.out.println("Can't divided by zero");
        }
        System.out.println("Rest of the code2");
    }
}
