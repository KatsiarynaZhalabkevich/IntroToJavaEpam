package by.epam.intro.unit1.branch_algorithm;

import java.util.Random;

/*
 * 16. �� ��������� ��Y ������ ������ ������������ ����� �. 
 * �������, ��� ��� ����������� (�� ����� ��� ��� � ����� ������������ ����).
 * 
 * */

public class Task16 {
	public static void main(String[] args) {

		Random rand = new Random();

		int x = rand.nextInt(100) - 30;
		int y = rand.nextInt(100) - 10;

		System.out.printf("����� �(%d, %d) ", x, y);
		System.out.println();

		if (x == 0)
			System.out.println("����� ����������� �� ��� ��");

		if (y == 0)
			System.out.println("����� ����������� �� ��� ��");

		if (x != 0 && y != 0) {

			if (x > 0) {

				if (y > 0)
					System.out.println("����� ����������� � I ��������");
				else
					System.out.println("����� ����������� � IV ��������");
			} else {
				if (y > 0)
					System.out.println("����� ����������� �� II ��������");
				else
					System.out.println("����� ����������� � III ��������");
			}

		}
	}

}
