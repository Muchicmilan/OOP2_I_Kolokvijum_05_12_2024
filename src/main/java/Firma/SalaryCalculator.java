package Firma;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor

public class SalaryCalculator {
    private List<Zaposlen> employeeList;

    public double brutoPayment(){
        double sum =0;
        for(Zaposlen z: employeeList){
            sum += z.getSalary();
        }
        return sum;
    }

    public double monthlyTax(int fixedTax){
        double sum =0;
        for(Zaposlen z: employeeList){
            sum += z.tax(fixedTax);
        }
        return sum;
    }
}
