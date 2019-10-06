package by.epam.intro.unit1_1.branch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*Найти max{min(a, b), min(c, d)}*/

public class Task27 {
	public static void main(String[] args) throws IOException {
        int a, b, c, d, min1, min2, max;

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Введите значения!");
        System.out.print("А =");
        String str = bufferedReader.readLine();
        a = Integer.parseInt(str);
        System.out.print("B =");
        String str1 = bufferedReader.readLine();            //блок ввода данных
        b = Integer.parseInt(str1);
        System.out.print("С =");
        String str2 = bufferedReader.readLine();
        c = Integer.parseInt(str2);
        System.out.print("D =");
        String str3 = bufferedReader.readLine();
        d = Integer.parseInt(str3);

        if (a <= b) min1 = a;
        else min1 = b;

        if (c <= d) min2 = c;
        else min2 = d;

        if (min1 > min2) max = min1;
        else max = min2;

        System.out.println("max{min(a,b), min(c,d)} = " + max);
    }
}
