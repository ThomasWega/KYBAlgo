package me.weglarz;

public class Main {
    public static void main(String[] args) {
        // EUCLID
        final int a = 40;
        final int b = 20;
        final Euclid.Result result = Euclid.extendedGCD(a, b);
        System.out.println("Extended Euclid's Algorithm");
        System.out.println("GCD: " + result.gcd());
        System.out.println("x: " + result.x());
        System.out.println("y: " + result.y());

        System.out.println();

        // SQUARE AND MULTIPLY
        final int base = 11;
        final int exponent = 13;
        final int modulus = 53;
        final int resultSquareMultiply = SquareAndMultiply.squareAndMultiply(base, exponent, modulus);
        System.out.println("Square and Multiply");
        System.out.println("Base: " + base);
        System.out.println("Exponent: " + exponent);
        System.out.println("Modulus: " + modulus);
        System.out.println("Result: " + resultSquareMultiply);
    }
}
