package by.epam.intro.unit1_1.branch;

import java.util.Random;

/*вычислить значение функции
 * y = x*x-3x+9, x<=3
 * y = 1/(x*x*x +6), x>3 */

public class Task36 {
	public static void main(String[] args) {
       
		Random rand = new Random();
		double x = rand.nextDouble();
        double result;

        System.out.printf("x =%5.3f ",x);
        if (x > 3) {
            result = 1 / (Math.pow(x, 3) + 6);
        } else {
            result = x * x - 3 * x + 9;
        }
        System.out.println();
        System.out.printf("Result = %5.3f" ,result);
    }

}
