package program;

import lombok.Data;

@Data
public class Fraction {
    private int numerator;
    private int denominator;
    private int rez;

    public Fraction(int numerator, int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
    }

    public double getRez(int numerator, int denominator) {
        double rez=(double)numerator/denominator;
        return rez;
    }
}
