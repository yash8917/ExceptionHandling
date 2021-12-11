public class FinallyBlockExa3 {
    public static void main(String[] args) {
        try {
            System.out.println(11/0);
        }
        catch (ArithmeticException obj){
            System.out.println("Exception is raised and conroll is in catch block");
        }
        finally {
            System.out.println("Finally block is always executed");
        }
        
        System.out.println("Some set of statement");
    }
}
