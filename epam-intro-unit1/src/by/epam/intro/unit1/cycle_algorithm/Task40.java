package by.epam.intro.unit1.cycle_algorithm;

/*40. Получить все числа, не превышающие заданного числа N, которые делятся без остатка на все свои цифры.*/
public class Task40 {
	public static void main(String[] args) {

		int num = 10000;

		for (int i = 1; i < num; i++) {
			int n = i;
			int count = 0; // счетчик делителей
			String str = Integer.toString(n);
			for (int j = 0; j < str.length(); j++) {

				int d = n % 10; // делитель

				if (d == 0)
					break;
				if (i % d == 0)
					count++;
				n /= 10;

			}
			if (count == str.length())
				System.out.println("У числа " + i + " все цифры являются делителями!");

		}

		System.out.println("Конец выполнения программы!");
	}

}
