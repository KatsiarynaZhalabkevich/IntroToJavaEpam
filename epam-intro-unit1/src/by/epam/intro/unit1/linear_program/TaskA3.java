package by.epam.intro.unit1.linear_program;
/*Вычислить значение выражения по формуле (все переменные принимают действительные значения): 𝑠𝑖𝑛𝑥+𝑐𝑜𝑠𝑦𝑐𝑜𝑠𝑥−𝑠𝑖𝑛𝑦∗𝑡𝑔 𝑥𝑦*/
import java.util.Random;

public class TaskA3 {
	public static void main(String[] args) {

		Random random = new Random();
		double x = random.nextDouble() * 10;
		double y = random.nextDouble() * 10;
		result(x, y);
	}

	public static void result(double x, double y) {
		double rez;
		try {
			rez = ((Math.cos(y) + Math.sin(x)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
			System.out.printf("Result is %5.3f" , rez);

		} catch (Exception e) {
			e.getMessage(); //исключение, если вдруг произойдет деление на нуль!
			System.out.println("Can't solve the result!");
		}
	}
}
