package me.weglarz;

import org.jetbrains.annotations.NotNull;

// Rozšířený Euklidův algoritmus
public class Euclid {

    public record Result(int gcd, int x, int y) { }

    public static @NotNull Result extendedGCD(final int a, final int b) {
        if (b == 0)
            return new Result(a, 1, 0);  // Konec rekurze
        Result next = extendedGCD(b, a % b);
        int gcd = next.gcd;
        int x = next.y;
        int y = next.x - (a / b) * next.y;
        return new Result(gcd, x, y);
    }
}
