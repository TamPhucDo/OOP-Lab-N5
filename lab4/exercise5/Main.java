public class Main {
    public static void main(String[] args) {
        System.out.println("--- Test Fraction ---");
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        
        Fraction sum = f1.add(f2);
        Fraction sub = f1.sub(f2);
        Fraction mul = f1.mul(f2);
        Fraction div = f1.div(f2);
        
        System.out.println("f1: " + f1);
        System.out.println("f2: " + f2);
        System.out.println("Add: " + sum);
        System.out.println("Sub: " + sub);
        System.out.println("Mul: " + mul);
        System.out.println("Div: " + div);
        
        Fraction f3 = new Fraction(10, 20);
        System.out.println("\nBefore reduce: " + f3);
        f3.reducer();
        System.out.println("After reduce: " + f3);
    }
}