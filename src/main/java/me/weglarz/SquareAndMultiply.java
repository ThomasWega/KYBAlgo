package me.weglarz;

public class SquareAndMultiply {

    public static int squareAndMultiply(int base, int exponent, final int modulus) {
        int result = 1;
        base = base % modulus;

        while (exponent > 0) {
            // Pokud je exponent lichý, vynásobit výsledek současnou hodnotou základu
            if ((exponent & 1) == 1)
                result = (result * base) % modulus;

            // Druhá mocnina základu
            base = (base * base) % modulus;

            // posun bitu o jeden doprava (v podstatě  ekvivalentní exponent / 2)
            exponent >>= 1;
        }

        return result;
    }
}
