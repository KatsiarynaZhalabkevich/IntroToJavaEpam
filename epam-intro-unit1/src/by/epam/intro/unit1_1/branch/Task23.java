package by.epam.intro.unit1_1.branch;
/*
 * 23. Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12). 
 * Если введены некорректные данные, то сообщить об этом.*/
import java.util.Scanner;

public class Task23 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int day;
		int month;

		System.out.println("Введите день от 1 до 31");
		System.out.println(">");
		
		while (!sc.hasNextInt()) {

			System.out.println(">");
			sc.next();

		}
		day = sc.nextInt();

		System.out.println("Введите месяц 1 до 12");
		System.out.println(">");
		
		while (!sc.hasNextInt()) {

			System.out.println(">");
			sc.next();

		}
		month = sc.nextInt();

		switch (month) {
		case 1:
			if (day >= 1 && day <= 31) {
				System.out.printf("%d января!", day);
			} else
				System.out.println("Такой даты не существует!");
			break;
		case 2:
			if (day >= 1 && day <= 29) {
				System.out.printf("%d февраля!", day);
			} else
				System.out.println("Такой даты не существует!");
			break;
		case 3:
			if (day >= 1 && day <= 31) {
				System.out.printf("%d марта!", day);
			} else
				System.out.println("Такой даты не существует!");
			break;
		case 4:
			if (day >= 1 && day <= 30) {
				System.out.println("%d апреля!");
			} else
				System.out.printf("Такой даты не существует!", day);
			break;
		case 5:
			if (day >= 1 && day <= 31) {
				System.out.printf("%d мая!", day);
			} else
				System.out.println("Такой даты не существует!");
			break;
		case 6:
			if (day >= 1 && day <= 30) {
				System.out.printf("%d июня!", day);
			} else
				System.out.println("Такой даты не существует!");
			break;
		case 7:
			if (day >= 1 && day <= 31) {
				System.out.printf("%d июля!", day);
			} else
				System.out.println("Такой даты не существует!");
			break;
		case 8:
			if (day >= 1 && day <= 31) {
				System.out.printf("%d августа!", day);
			} else
				System.out.println("Такой даты не существует!");
			break;
		case 9:
			if (day >= 1 && day <= 30) {
				System.out.printf("%d сентября!", day);
			} else
				System.out.println("Такой даты не существует!");
			break;
		case 10:
			if (day >= 1 && day <= 31) {
				System.out.printf("%d октября!", day);
			} else
				System.out.println("Такой даты не существует!");
			break;
		case 11:
			if (day >= 1 && day <= 30) {
				System.out.printf("%d ноября!", day);
			} else
				System.out.println("Такой даты не существует!");
			break;
		case 12:
			if (day >= 1 && day <= 31) {
				System.out.printf("%d декабря!", day);
			} else
				System.out.println("Такой даты не существует!");
			break;

		default:
			System.out.println("Такой даты не существует!");
			break;
		}
		
		sc.close();

	}
	

}
