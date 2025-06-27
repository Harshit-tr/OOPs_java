public class fraction{
    public static class Fraction {
        int num;
        int den;

        public Fraction(int num, int den) {
            this.num = num;
            this.den = den;
            simplify();
        }

        private void simplify() {
            int hcf = gcd(num, den);
            this.num /= hcf;
            this.den /= hcf;
        }

        public static Fraction add(Fraction f1, Fraction f2) {
            int numerator = f1.num * f2.den + f2.num * f1.den;
            int denominator = f1.den * f2.den;
            return new Fraction(numerator, denominator);
        }
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(7, 21);
        System.out.println(f1.num + "/" + f1.den);

        Fraction f2 = new Fraction(71, 21);
        System.out.println(f2.num + "/" + f2.den);

        Fraction f3 = Fraction.add(f1, f2);
        System.out.println(f3.num + "/" + f3.den);
    }
}
