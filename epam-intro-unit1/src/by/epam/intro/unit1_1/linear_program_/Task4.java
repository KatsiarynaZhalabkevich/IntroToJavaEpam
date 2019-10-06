package by.epam.intro.unit1_1.linear_program_;

import java.util.Random;

/*Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.*/
public class Task4 {
	public static void main(String[] args) {

		Random random = new Random();
		int a = random.nextInt(20);
		int b = random.nextInt(20);
		int c = random.nextInt(20);

		System.out.println("Result = " + result(a, b, c));
	}

	public static int result(int a, int b, int c) {
		int z;
		z = ((a - 3) * b / 2) + c;
		return z;
	}
}
