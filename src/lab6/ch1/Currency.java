package lab6.ch1;

public abstract class Currency {
    private double units;

    public Currency(){

    }

    public double getUnits() {
        return units;
    }

    public void setUnits(double units) {
        this.units = units;
    }

    public Currency(double units) {
        this.units = units;
    }
}
