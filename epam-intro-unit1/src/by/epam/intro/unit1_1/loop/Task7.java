package by.epam.intro.unit1_1.loop;

/*Вычислить значения функции на отрезке [а,b] c шагом h:
 * y = x
 * y = -x */

public class Task7 {
	public static void main(String[] args) {

        double h = 0.5;
        int a = -5;
        int b = 7;

        for (double i = a; i <= b; i += h) {
            if (i > 2) {
                System.out.println("y = " + i);
            } else {
                System.out.println("y = " + (-i));
            }
        }
    }

}
