public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Fraction(int num, int den) {
        this.numerator = num;
        this.denominator = (den == 0) ? 1 : den; // Tránh lỗi chia cho 0
    }

    public Fraction(Fraction f) {
        this.numerator = f.numerator;
        this.denominator = f.denominator;
    }

    public Fraction add(Fraction f) {
        return new Fraction(this.numerator * f.denominator + f.numerator * this.denominator, this.denominator * f.denominator);
    }

    public Fraction sub(Fraction f) {
        return new Fraction(this.numerator * f.denominator - f.numerator * this.denominator, this.denominator * f.denominator);
    }

    public Fraction mul(Fraction f) {
        return new Fraction(this.numerator * f.numerator, this.denominator * f.denominator);
    }

    public Fraction div(Fraction f) {
        return new Fraction(this.numerator * f.denominator, this.denominator * f.numerator);
    }

    
    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void reducer() {
        int gcd = gcd(this.numerator, this.denominator);
        if (gcd != 0) {
            this.numerator /= gcd;
            this.denominator /= gcd;
        }
    }

    @Override
    public String toString() {
        return "Fraction[num=" + numerator + ", den=" + denominator + "]";
    }
}