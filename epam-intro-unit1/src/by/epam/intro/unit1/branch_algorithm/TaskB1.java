package by.epam.intro.unit1.branch_algorithm;

import java.io.*;

/*���� ��� ���� ������������ (� ��������). ����������, ���������� �� ����� �����������, 
 * � ���� ��, �� ����� �� �� �������������.*/

public class TaskB1 {
    public static void main(String[] args) throws IOException {
    	int a, b, c;

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("������� �������� �����!");
        System.out.print("���� � =");
        String str = bufferedReader.readLine();
        a = Integer.parseInt(str);
        System.out.print("���� B =");
        String str1 = bufferedReader.readLine();
        b = Integer.parseInt(str1);

        if (a > 0 && a < 180 && b > 0 && b < 180) {
            if (a + b >= 180) System.out.println("����������� �� ����������!!!");
            else {
                c = 180 - (a + b);
                System.out.println("����������� ����������!");
                if (a == 90 || b == 90 || c == 90) {
                    System.out.println("����������� �������������!");
                }
            }
        } else System.out.println("������� �������� �������� �����!");
    }
}
