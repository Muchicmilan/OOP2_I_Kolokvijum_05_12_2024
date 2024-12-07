package Razlomci;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter

public class Razlomci {
    final private int brojilac;
    final private int imenilac;

    Razlomci(int brojilac, int imenilac) {
        if(imenilac == 0) {
            System.out.println("Nije moguce deljenje sa 0!");
            this.brojilac = 0;
            this.imenilac = 1;
        }
        else {
            this.brojilac = brojilac;
            this.imenilac = imenilac;
        }
    }
    Razlomci(){
        this.brojilac = 0;
        this.imenilac = 1;
    }

    public Razlomci addition(Razlomci r){
        if(imenilac == r.imenilac)
            return new Razlomci(brojilac+r.brojilac, imenilac);
        return new Razlomci(brojilac*r.imenilac + r.brojilac*imenilac, imenilac*r.imenilac);
    }
    public Razlomci subtraction(Razlomci r){
        if(imenilac == r.imenilac)
            return new Razlomci(brojilac-r.brojilac, imenilac);
        return new Razlomci(brojilac*r.imenilac-r.brojilac*imenilac, imenilac*r.imenilac);
    }
    public Razlomci multiplication(Razlomci r){
        return new Razlomci(brojilac*r.brojilac, imenilac*r.imenilac);
    }
    public Razlomci division(Razlomci r){
        return new Razlomci(brojilac*r.imenilac,r.brojilac*imenilac);
    }
    public double value(){
        return brojilac/(double)imenilac;
    }

    @Override
    public String toString() {
        return brojilac + " / " + imenilac;
    }

}
