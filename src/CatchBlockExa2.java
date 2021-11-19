public class CatchBlockExa2 {
    public static void main(String[] args) {
        try{
            int arr[]={1,2,3};
            System.out.println(arr[7]);
        }
        catch(ArrayIndexOutOfBoundsException obj){
            System.out.println(obj);// print the exception description
        }
        System.out.println("rest of the code");
    }
}
