package by.epam.intro.unit1.branch_algorithm;

import java.util.Random;

/*
 * 25. �������� ��������� � ������ ������� ��������� ������� � ���������, ������� ������� ���������
 * �������������� �������� �, ���� ����������� � ������� ��������� 60� �. */

public class Task25 {
	public static void main(String[] args) {

		Random rand = new Random();
		int temp = rand.nextInt(100);

		System.out.println("����������� ������� "+temp);
		if (temp > 60) {
			System.out.println("�������� ��������!!!");
		} else
			System.out.println("������ ���! ��� ��������!");
	}

}
