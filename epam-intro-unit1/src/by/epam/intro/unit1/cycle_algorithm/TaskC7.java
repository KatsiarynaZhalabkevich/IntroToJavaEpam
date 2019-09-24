package by.epam.intro.unit1.cycle_algorithm;
/*� ���������� ������� ��� �������� ��� ������� �����, ����� 1 � ������ ����� �����*/

import java.io.*;

public class TaskC7 {
	public static void main(String[] args) throws IOException {

		int n, m, x, count = 0;

		InputStream inputStream = System.in;
		Reader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		System.out.println("������� �������� ���������� ");
		System.out.println("n = ");
		String str = bufferedReader.readLine();
		n = Integer.parseInt(str);

		System.out.println("m = ");
		String str1 = bufferedReader.readLine();
		m = Integer.parseInt(str1);

		if (n > m) {
			x = n;
			n = m; // ���� ����� ���������� ����� �� ���������������
			m = x;
		}

		for (int i = n; i <= m; i++) {
			System.out.println("�������� " + i + " :");
			count = 0;
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					System.out.print(" " + j);
					count++;
				}

			}
			System.out.println();
			if (count == 0)
				System.out.println(i + " ������� �����!");
		}

	}
}
