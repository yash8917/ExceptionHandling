public class ThrowsStatement_1 {
    public void m1() throws InterruptedException {

        m2();
    }
    public void m2()throws InterruptedException{
        System.out.println("Executed");
    }
    public static void main(String[] args)throws InterruptedException {
        ThrowsStatement_1 obj=new ThrowsStatement_1();
        try{
            obj.m1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
