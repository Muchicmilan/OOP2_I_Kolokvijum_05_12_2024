package Firma;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public abstract class Zaposlen {
    final private String name;
    private double salary;

    public abstract double tax(int value);


}
