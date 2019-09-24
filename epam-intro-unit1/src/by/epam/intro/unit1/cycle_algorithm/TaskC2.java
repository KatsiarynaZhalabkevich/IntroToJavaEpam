package by.epam.intro.unit1.cycle_algorithm;

/*Вычислить значения функции на отрезке [а,b] c шагом h:*/
public class TaskC2 {
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
