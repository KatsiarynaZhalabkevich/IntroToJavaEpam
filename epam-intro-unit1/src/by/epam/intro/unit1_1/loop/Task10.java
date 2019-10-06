package by.epam.intro.unit1_1.loop;

import java.math.BigInteger;

/*произведение квадратов 200 чисел*/

/*в конце все равно идут нули ? почему?*/

public class Task10 {
	public static void main(String[] args) {

        BigInteger mult = BigInteger.valueOf(1);
        BigInteger I;

        for (int i = 1; i <= 200; i++) {
            I = BigInteger.valueOf(i);
            mult = mult.multiply(I);

        }
        mult = mult.multiply(mult);
        System.out.println("Произведение 200! = " + mult);
    }
}
