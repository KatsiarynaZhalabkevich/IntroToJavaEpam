package by.epam.intro.unit1.linear_program;
/*��������� ������� � �������, ������ � �������*/

public class Task28 {
	public static void main(String[] args) {
	
		double radian=3.14;
	
	int grad =((int)convertToSec(radian))/3600;
	int second = ((int) convertToSec(radian))%60;
	int minute = ((int) convertToSec(radian)-grad*3600-second)/60;
	
	
	System.out.println(radian+" ������ = "+grad+" �������� "+minute+" ����� "+second+" ������ ");
	

}

public static double convertToSec(double rad) {
		
	return rad*180*3600/Math.PI;
	
}

}
