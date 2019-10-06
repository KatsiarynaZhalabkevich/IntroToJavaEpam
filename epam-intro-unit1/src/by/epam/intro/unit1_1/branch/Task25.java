package by.epam.intro.unit1_1.branch;

import java.util.Random;

/*
 * 25. Написать программу — модель анализа пожарного датчика в помещении, 
 * которая выводит сообщение «Пожароопасная ситуация »,
 *  если температура в комнате превысила 60° С.. */

public class Task25 {
	public static void main(String[] args) {

		Random rand = new Random();
		int temp = rand.nextInt(100);

		System.out.println("Температура в помещении  "+temp);
		if (temp > 60) {
			System.out.println("Пожароопасная ситуация!!!");
		} else
			System.out.println("Все спокойно! Температура в норме!");
	}

}
