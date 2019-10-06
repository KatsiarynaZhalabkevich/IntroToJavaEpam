package by.epam.intro.unit1_1.linear_program_;
/*
 * Найти площадь равнобедренной трапеции, даны основания и угол при большей стороне
 * */
public class Task24 {
	public static void main(String[] args) {

        double a = 15;
        double b = 10;
        double angle = 30;
        double h, square;

        h=Math.tan(convertToRadian(angle))*(a-b)/2;

        square = (a+b)/2*h;
        System.out.printf("Высота трапеции равна %5.3f ",h);
        System.out.println();
        System.out.printf("Площадь трапеции равна %5.3f ",square);


    }

    public static double convertToRadian(double angle) {
        double rad;

        rad = angle*Math.PI/180;

        return rad;
    }

}
