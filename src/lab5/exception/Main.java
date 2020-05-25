package lab5.exception;

public class Main {
    public static void main(String[] args) {
        SomeClass sc = new SomeClass();
        sc.methodUncheckedException(2);
        //sc.methodUncheckedException(0);

        try {
            sc.methodCheckedException(2);
        } catch(ChException exception){
            exception.printStackTrace();
        }finally {
            System.out.println("finally");
        }
        System.out.println("after exception");
    }
}
