public class CatchBlockExa {
    public static void main(String[] args) {
        try{
            int i=50/0;
        }
        catch(ArithmeticException obj){
            System.out.println(obj);    //this line is print the description of the error
        }

        System.out.println("Rest of the code");
    }
}
