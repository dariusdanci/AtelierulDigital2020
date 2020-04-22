package Lab2;

public class Main {

    public static void main(String[] args) {
        Exemple exemple=new Exemple();
        int b=5;
        int result = exemple.calculate(b);
        System.out.println("result= " +result);

        Exemple e = new Exemple();
//        Exemple.incrementA(e);
        System.out.println("after e= "+ e.getA());
    }
}
