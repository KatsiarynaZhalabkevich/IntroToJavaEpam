package by.epam.intro.unit1.linear_program;

public class Task30 {
	public static void main(String[] args) {
		
		double r1=1.5;
		double r2 = 2.3;
		double r3 = 3.5;
		double r = r1*r2*r3/(r2*r3+r1*r3+r2*r1);
		
		System.out.printf("ќбщее сопротивление резисторов равно %5.3f ќм", r);
		

	}

}
