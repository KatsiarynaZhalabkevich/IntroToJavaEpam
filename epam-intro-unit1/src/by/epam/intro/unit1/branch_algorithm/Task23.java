package by.epam.intro.unit1.branch_algorithm;
/*
 * 23. Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12). 
 * Если введены некорректные данные, то сообщить об этом.
 */

import java.util.Scanner;

public class Task23 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int day;
		int month;

		System.out.println("Введите день месяца от 1 до 31");
		while (!sc.hasNextInt()) {

			System.out.println(">");
			sc.next();

		}
		day = sc.nextInt();

		System.out.println("Введите номер месяца от 1 до 12");
		while (!sc.hasNextInt()) {

			System.out.println(">");
			sc.next();

		}
		month = sc.nextInt();

		switch (month) {
		case 1:
			if (day >= 1 && day <= 31) {
				System.out.println("Дата существует!");
			} else
				System.out.println("Дата не существует!");
			break;
		case 2:
			if (day >= 1 && day <= 29) {
				System.out.println("Дата существует!");
			} else
				System.out.println("Дата не существует!");
			break;
		case 3:
			if (day >= 1 && day <= 31) {
				System.out.println("Дата существует!");
			} else
				System.out.println("Дата не существует!");
			break;
		case 4:
			if (day >= 1 && day <= 30) {
				System.out.println("Дата существует!");
			} else
				System.out.println("Дата не существует!");
			break;
		case 5:
			if (day >= 1 && day <= 31) {
				System.out.println("Дата существует!");
			} else
				System.out.println("Дата не существует!");
			break;
		case 6:
			if (day >= 1 && day <= 30) {
				System.out.println("Дата существует!");
			} else
				System.out.println("Дата не существует!");
			break;
		case 7:
			if (day >= 1 && day <= 31) {
				System.out.println("Дата существует!");
			} else
				System.out.println("Дата не существует!");
			break;
		case 8:
			if (day >= 1 && day <= 31) {
				System.out.println("Дата существует!");
			} else
				System.out.println("Дата не существует!");
			break;
		case 9:
			if (day >= 1 && day <= 30) {
				System.out.println("Дата существует!");
			} else
				System.out.println("Дата не существует!");
			break;
		case 10:
			if (day >= 1 && day <= 31) {
				System.out.println("Дата существует!");
			} else
				System.out.println("Дата не существует!");
			break;
		case 11:
			if (day >= 1 && day <= 30) {
				System.out.println("Дата существует!");
			} else
				System.out.println("Дата не существует!");
			break;
		case 12:
			if (day >= 1 && day <= 31) {
				System.out.println("Дата существует!");
			} else
				System.out.println("Дата не существует!");
			break;

		default:
			System.out.println("Дата не существует!");
			break;
		}

	}

}
