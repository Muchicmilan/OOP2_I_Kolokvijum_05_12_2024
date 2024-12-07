package Firma;

public class Stalno extends Zaposlen{
    public Stalno(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double tax(int value) {
        return getSalary() * 0.6;
    }
}
