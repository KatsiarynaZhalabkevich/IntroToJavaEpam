package by.epam.intro.unit1.cycle_algorithm;
/*23. ��������� ��������� ��� ���������� �������� ������� F(x) �� ������� [�, b] � ����� h. ���������
����������� � ���� �������, ������ ������� ������� � �������� ���������, ������ - ���������������
�������� �������:*/
public class Task23 {
	public static void main(String[] args) {
		double a=-3;
		double b=5.5;
		double h=0.25;
		
		double f;
		
		System.out.println("-----------------------");
		System.out.println("|   x      |    f(x)  |");
		System.out.println("-----------------------");
		
		for(double i=a;i<=b;i+=h) {
			
			f=1/Math.tan(i/3) +0.5*Math.sin(i);
			System.out.printf("|%-10.3f|%-10.3f|",i,f);
			System.out.println();
			
		}
		System.out.println("-----------------------");
		
	}

}
