package by.epam.intro.unit1_1.linear_program_;

/*Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
Поменять местами дробную и целую части числа и вывести полученное значение числа.*/

public class Task21 {
	public static void main(String[] args) {

        double R = 356.123;
        System.out.println("Start value " + R);

        R *= 1000;
        int r = (int) R*1000;

        int a = r % 1000;
        int b = r / 1000;
        double rez = a + 0.001 * b;

        System.out.println("Result is "+rez);
    }

}
