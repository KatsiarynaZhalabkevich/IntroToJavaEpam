package by.epam.intro.unit1_1.branch;

import java.util.Random;

/*
 * 16. На плоскости ХОY задана своими координатами точка А. 
 * Указать, где она расположена (на какой оси или в каком координатном угле).*/

public class Task16 {
	public static void main(String[] args) {

		Random rand = new Random();

		int x = rand.nextInt(100) - 30;
		int y = rand.nextInt(100) - 10;

		System.out.printf("Координаты (%d, %d) ", x, y);
		System.out.println();

		if (x == 0)
			System.out.println("Точка лежит на оси ОУ");

		if (y == 0)
			System.out.println("Точка лежит на оси ОХ");

		if (x != 0 && y != 0) {

			if (x > 0) {

				if (y > 0)
					System.out.println("Точка лежит в I четверти");
				else
					System.out.println("Точка лежит в IV четверти");
			} else {
				if (y > 0)
					System.out.println("Точка лежит в II четверти");
				else
					System.out.println("Точка лежит в III четверти");
			}

		}
	}

}
