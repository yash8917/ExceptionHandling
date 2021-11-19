import java.sql.SQLOutput;

public class NestedTryBlockExa {
    public static void main(String[] args) {
        //Outer Try block
    try{
        System.out.println(20/0);
        //Inner try block-1
        try{
            // inner try block-2
            try{
                int arr[]={12,3,4,5};
            }// Catch block of inner try block-2
            catch (ArrayIndexOutOfBoundsException obj1){
                System.out.println(obj1+"catch block3");
            }
        }//Catch block of Inner try block-1
        catch (ArithmeticException obj2){
            System.out.println(obj2+"Catch block 2");
        }
    }//Catch block of Outer block
    catch (ArithmeticException obj3){
        System.out.println(obj3+"\nCatch block1");
    }// Normal flow of execution Statement
        System.out.println("Set of Statement");
    }

}
