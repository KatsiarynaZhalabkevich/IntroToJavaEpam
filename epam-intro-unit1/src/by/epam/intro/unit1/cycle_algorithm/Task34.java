package by.epam.intro.unit1.cycle_algorithm;

/*34. ������� ��� �������������� �����, ����� ���� ������� �� ������� ����� 15.*/
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
				System.out.println("����� ���� ����� " + i + " ����� 15");
			sum = 0;
		}
	}

}
