package lab6.ch1;

public class RON extends Currency {
    public RON(double units) {
        super(units);
    }
    public RON() {super();}

    public String toString(){
        return "RON: " + getUnits();
    }
}
