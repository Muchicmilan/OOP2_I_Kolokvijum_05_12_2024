package Firma;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PoSatu extends Zaposlen {
    private int satiRada;
    private double cenaSata;

    public PoSatu(String name, double salary,int satiRada,int cenaSata) {
        super(name, satiRada*cenaSata);
        this.satiRada = satiRada;
        this.cenaSata = cenaSata;
    }


    @Override
    public double tax(int fixed) {
        if((int)getSalary() < fixed){
            System.out.println("Nije moguce umanjiti platu");
            return 0;
        }
        else
            return getSalary()-(double)fixed;
    }
}
