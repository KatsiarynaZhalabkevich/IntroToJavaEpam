package by.epam.intro.unit1.branch_algorithm;

/*������ ������� �, � �������������� ��������� � ������� �, �, z �������. ����������, ������� �� ������ ����� ���������.*/
public class TaskB4 {
	public static void main(String[] args) {
		/* ������ ��������, ���� ���� ����� ������ ��� ����� ��������� */
		int A = 5, B = 5;
		int x = 4, y = 5, z = 6;
		int dAB, dXY, dXZ, dYZ; // ��������� ������

		dAB = A * A + B * B;
		dXY = x * x + y * y; // ��������� ���������, ���� ��������� �����
		dXZ = x * x + z * z; // ������ ��� ����� ��������� ���������, �� ��� ��
		dYZ = y * y + z * z;

		if (dAB >= dXY || dAB >= dXZ || dAB >= dYZ) {
			System.out.println("������ �������!!!");
		} else {
			System.out.println("������ �� �������!!!");
		}

	}

}
