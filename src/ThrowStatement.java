class InvalidAgeException extends Exception{
   InvalidAgeException(String s){
      super(s);
   }
}
public class ThrowStatement {
   public static void validation(int age) throws InvalidAgeException{
      if(age<18)
         throw new InvalidAgeException("not Valid");
      else
         System.out.println("Welcome to vote");
   }

   public static void main(String[] args) {
      try{
         validation(19);
      }catch(InvalidAgeException m){
         System.out.println("Exception Occur:"+m);
   }
      System.out.println("rest of the code");
}}
