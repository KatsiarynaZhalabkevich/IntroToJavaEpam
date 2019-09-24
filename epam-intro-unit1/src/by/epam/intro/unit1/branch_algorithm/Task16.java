package by.epam.intro.unit1.branch_algorithm;

import java.util.Random;

/*
 * 16. На плоскости ХОY задана своими координатами точка А. 
 * Указать, где она расположена (на какой оси или в каком координатном угле).
 * 
 * */

public class Task16 {
	public static void main(String[] args) {

		Random rand = new Random();

		int x = rand.nextInt(100) - 30;
		int y = rand.nextInt(100) - 10;

		System.out.printf("Точка А(%d, %d) ", x, y);
		System.out.println();

		if (x == 0)
			System.out.println("Точка расположена на оси ОХ");

		if (y == 0)
			System.out.println("Точка расположена на оси ОУ");

		if (x != 0 && y != 0) {

			if (x > 0) {

				if (y > 0)
					System.out.println("Точка расположена в I четверти");
				else
					System.out.println("Точка расположена в IV четверти");
			} else {
				if (y > 0)
					System.out.println("Точка расположена во II четверти");
				else
					System.out.println("Точка расположена в III четверти");
			}

		}
	}

}
