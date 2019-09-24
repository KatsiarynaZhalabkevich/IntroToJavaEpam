package by.epam.intro.unit1.linear_program;



/*
 * ����� ������� �������������� ��������, ���� ��������� � ���� ��� ������� �������
 * */
public class Task24 {
	public static void main(String[] args) {
		
		double a = 15;
		double b = 10;
		double angle = 30; 
		double h, square;
		
		h=Math.tan(convertToRadian(angle))*(a-b)/2;
		
		square = (a+b)/2*h;
		System.out.println("������ �������� ����� "+h);
		System.out.println("������� �������� ����� "+square);
		
		
	}
	
	public static double convertToRadian(double angle) {
		double rad;
		
		rad = angle*Math.PI/180;
		
		return rad;
	}

}
