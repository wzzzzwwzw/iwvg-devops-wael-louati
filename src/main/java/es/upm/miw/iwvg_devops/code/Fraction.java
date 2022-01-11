package es.upm.miw.iwvg_devops.code;


public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }
    public Fraction add (Fraction input1){
        return new Fraction(((this.getNumerator()*input1.getDenominator())+(this.getDenominator()*input1.getNumerator())),(this.getDenominator()*input1.getDenominator()));
    }

    public Fraction sub (Fraction input1){
        return new Fraction(((this.getNumerator()*input1.getDenominator())-(this.getDenominator()*input1.getNumerator())),(this.getDenominator()*input1.getDenominator()));
    }


    public Fraction divide(Fraction input1){
        return new Fraction((this.getNumerator()*input1.getDenominator()),(this.getDenominator()*input1.getNumerator()));
    }

    public Fraction mul(Fraction input1){
        return new Fraction((this.getNumerator()*input1.getNumerator()),(this.getDenominator()*input1.getDenominator()));
    }

    public boolean isProper() {
        return (this.numerator < this.denominator);

    }

    public boolean isImproper() {
        return (this.numerator >= this.denominator);

    }


    public boolean isEquivalent(Fraction inputFraction) {
        return (inputFraction.numerator * this.denominator == inputFraction.denominator * this.numerator);
    }




    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }


}
