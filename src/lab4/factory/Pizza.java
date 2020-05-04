package lab4.factory;

public abstract class Pizza {

    protected String name;

    public void bake() {
        System.out.println("bake "+name);
    }

    public void prepare() {
        System.out.println("Prepare "+name);
    }

    public void cut() {
        System.out.println("Cut "+name);
    }
    public void box(){
        System.out.println("Box "+name);
    }

    public String toString(){          //ea afiseaza un ob
        return "This is " + name + " pizza";
    }
}