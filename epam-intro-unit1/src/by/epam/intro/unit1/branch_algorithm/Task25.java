package by.epam.intro.unit1.branch_algorithm;

import java.util.Random;

/*
 * 25. Написать программу — модель анализа пожарного датчика в помещении, которая выводит сообщение
 * «Пожароопасная ситуация », если температура в комнате превысила 60° С. */

public class Task25 {
	public static void main(String[] args) {

		Random rand = new Random();
		int temp = rand.nextInt(100);

		System.out.println("Температура воздуха "+temp);
		if (temp > 60) {
			System.out.println("Пожарная ситуация!!!");
		} else
			System.out.println("Пожара нет! Все спокойно!");
	}

}
