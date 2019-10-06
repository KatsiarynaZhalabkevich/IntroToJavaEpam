package by.epam.intro.unit1_1.loop;

/*34. Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.*/

public class Task34 {
	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1000; i <= 9999; i++) {
			int n = i;

			for (int j = 0; j < 4; j++) {
				sum += n % 10;
				n /= 10;
			}
			if (sum == 15)
				System.out.println("Сумма цифр числа " + i + " равна 15");
			sum = 0;
		}
	}
}
