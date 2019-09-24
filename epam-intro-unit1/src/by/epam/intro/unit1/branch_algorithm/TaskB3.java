package by.epam.intro.unit1.branch_algorithm;

import java.io.*;

/*принадлежат ли 3 точки одной прямой*/

public class TaskB3 {
    public static void main(String[] args) throws IOException {
    	
    	int x1, x2, x3, y1, y2, y3;

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Введите координаты точек");
        System.out.print("Точка A:");
        System.out.println(">");
        String str = bufferedReader.readLine();
        x1 = Integer.parseInt(str);
        System.out.println(">");
        String str1 = bufferedReader.readLine();
        y1 = Integer.parseInt(str1);
        
        System.out.print("Точка B:");
        System.out.println(">");
        String str2 = bufferedReader.readLine();
        x2 = Integer.parseInt(str2);
        System.out.println(">");
        String str3 = bufferedReader.readLine();
        y2 = Integer.parseInt(str3);
        
        System.out.print("Точка C:");
        System.out.println(">");
        String str4 = bufferedReader.readLine();
        x3 = Integer.parseInt(str4);
        System.out.println(">");
        String str5 = bufferedReader.readLine();
        y3 = Integer.parseInt(str5);

        //Составляем уравнение прямой через 2 точки
        //Проверяем, подходит ли туда 3-я точка
        //Проверка, вдруг координаты точек совпадают?
     
        if (x1 == x2 && y1 == y2) {
            System.out.println("Координаты двух точек совпадают!!!");
        }

        if ((x3 - x1) * (y2 - y1) == (y3 - y1) * (x2 - x1)) {
            System.out.println("Точки лежат на одной прямой!");
        } else System.out.println("Точки НЕ лежат на одной прямой!");

    }
}
