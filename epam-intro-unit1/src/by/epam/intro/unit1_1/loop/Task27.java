package by.epam.intro.unit1_1.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*27. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого
числа. m и n вводятся с клавиатуры.*/

public class Task27 {
	 public static void main(String[] args) throws IOException {

	        int n, m, x, count = 0;

	        InputStream inputStream = System.in;
	        Reader inputStreamReader = new InputStreamReader(inputStream);
	        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

	        System.out.println("Введите значение промежутка ");
	        System.out.println("n = ");
	        String str = bufferedReader.readLine();
	        n = Integer.parseInt(str);

	        System.out.println("m = ");
	        String str1 = bufferedReader.readLine();
	        m = Integer.parseInt(str1);

	        if (n > m) {
	            x = n;
	            n = m; //если вдруг промежуток задан не последовательно
	            m = x;
	        }

	        for (int i = n; i <= m; i++) {
	            System.out.println("Делители " + i + " :");
	            count = 0;
	            for (int j = 2; j < i; j++) {

	                if (i % j == 0) {
	                    System.out.print(" " + j);
	                    count++;
	                }

	            }
	            System.out.println();
	            if (count == 0) System.out.println(i + " простое число!");
	        }

	    }
}
