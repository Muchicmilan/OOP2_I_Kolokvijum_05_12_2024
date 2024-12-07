package Firma;

public class PoUgovoru extends Zaposlen{

    public PoUgovoru(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double tax(int value) {
        return getSalary() * 0.8;
    }
}
