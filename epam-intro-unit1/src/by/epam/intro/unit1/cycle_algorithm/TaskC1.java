package by.epam.intro.unit1.cycle_algorithm;
/*�������� ���������, ��� ������������ ������ ����� ����� ������������� �����.
� ��������� ��������� ��� ����� �� 1 �� ���������� ������������� �����.*/

import java.io.*;

public class TaskC1 {
	public static void main(String[] args) throws IOException {
		
		int n, sum = 0;
		InputStream inputStream = System.in;
		Reader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		System.out.println("������� �������� ");
		String str = bufferedReader.readLine();
		n = Integer.parseInt(str);

		if (n > 0) {
			for (int i = 1; i <= n; i++) {
				sum += i;
			}
			System.out.println("����� ����� (�� n ������������) " + sum);
		} else {
			System.out.println("������� ������������ �����! n>0");
		}

	}
}
