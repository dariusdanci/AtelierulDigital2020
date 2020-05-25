package lab6.ch1;

public class USD extends Currency {
    public USD(double units) {
        super(units);
    }
    public USD() { super(); }

    public String toString(){
        return "USD: " + getUnits();
    }
}
//fol atunci cand , trebuie sa se limiteze la un anumit tip
//principiu: avem un dep , dar nu stim utilizatoroul la ce o sa-l foloseasca
//