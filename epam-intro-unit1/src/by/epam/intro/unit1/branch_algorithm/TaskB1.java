package by.epam.intro.unit1.branch_algorithm;

import java.io.*;

/*Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, 
 * и если да, то будет ли он прямоугольным.*/

public class TaskB1 {
    public static void main(String[] args) throws IOException {
    	int a, b, c;

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Введите значение углов!");
        System.out.print("Угол А =");
        String str = bufferedReader.readLine();
        a = Integer.parseInt(str);
        System.out.print("Угол B =");
        String str1 = bufferedReader.readLine();
        b = Integer.parseInt(str1);

        if (a > 0 && a < 180 && b > 0 && b < 180) {
            if (a + b >= 180) System.out.println("Треугольник не существует!!!");
            else {
                c = 180 - (a + b);
                System.out.println("Треугольник существует!");
                if (a == 90 || b == 90 || c == 90) {
                    System.out.println("Треугольник прямоугольный!");
                }
            }
        } else System.out.println("Введены неверные значения углов!");
    }
}
