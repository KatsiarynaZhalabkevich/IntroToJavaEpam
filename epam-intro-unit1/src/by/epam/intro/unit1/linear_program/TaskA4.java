package by.epam.intro.unit1.linear_program;

/*���� �������������� ����� R ���� nnn.ddd (��� �������� ������� � ������� � ����� ������).
�������� ������� ������� � ����� ����� ����� � ������� ���������� �������� �����.*/

public class TaskA4 {
	public static void main(String[] args) {

		double R = 356.123;
		System.out.println("Start value " + R);

		R *= 1000;
		int r = (int) R ;
		System.out.println(r);

		int a = r % 1000;
		System.out.println(a);
		int b = r / 1000;
		System.out.println(b);
		double rez = a + 0.001 * b;

		System.out.println("Result is " + rez);
	}
}
