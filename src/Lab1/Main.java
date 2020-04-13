package Lab1;

public class Main {
    private static int semester=2;
    public static void main(String[] args) {
        ControlFlow cf= new ControlFlow();
        System.out.println("result= " + cf.addManyTimes());
        int nr=6;
        cf.AutoBox(nr);
        stringExample();
    }
    public static void stringExample(){
        String s="Java";
        s = s.concat(" code");
        System.out.println(s);
    }
}
