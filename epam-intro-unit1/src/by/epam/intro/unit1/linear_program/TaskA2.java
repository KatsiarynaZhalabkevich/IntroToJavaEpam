package by.epam.intro.unit1.linear_program;

/*вычислить значение выражения по формуле с корнями и делением на b*/
import java.util.Random;

public class TaskA2 {
	public static void main(String[] args) {

		Random random = new Random();
		double a = random.nextDouble() * 2;
		double b = random.nextDouble() * 10;
		double c = random.nextDouble() * 15;
		System.out.println("a= " + a + " b= " + b + " c= " + c);

		if (a != 0 && b != 0) {
			result(a, b, c);
		} else
			System.out.println("Incorrect values!");
	}

	public static void result(double a, double b, double c) {

		double rez = b * b + 4 * a * c;

		if (rez >= 0) {
			rez = Math.sqrt(rez);
			rez = ((b + rez) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
			System.out.printf("Result = %5.3f", rez);
		} else
			System.out.println("Incorrect values!");

	}
}
