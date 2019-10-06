package by.epam.intro.unit1_1.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
 * Напишите программу, где пользователь вводит любое целое положительное число. 
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 * 
 * */
public class Task6 {
	 public static void main(String[] args) throws IOException {
	        int n, sum = 0;
	        InputStream inputStream = System.in;
	        Reader inputStreamReader = new InputStreamReader(inputStream);
	        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

	        System.out.println("Введите значение ");
	        String str = bufferedReader.readLine();
	        n = Integer.parseInt(str);

	        if (n > 0) {
	            for (int i = 1; i <= n; i++) {
	                sum += i;
	            }
	            System.out.println("Сумма равна (до n включительно) " + sum);
	        } else {
	            System.out.println("Введено неправильное число! n>0");
	        }

	    }
}
