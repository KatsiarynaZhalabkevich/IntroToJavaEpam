package by.epam.intro.unit1_1.linear_program_;

import java.util.Random;

/*Вычислить значение выражения по формуле (все переменные принимают действительные значения)*/

public class Task8 {
	 public static void main(String[] args) {

	        Random random = new Random();
	        double a = random.nextDouble()*2;
	        double b = random.nextDouble()*10;
	        double c = random.nextDouble()*15;
	        System.out.printf("a=%5.3f,  b=%5.3f,  c= %5.3f ",a,b,c);
	        System.out.println();

	        if (a!=0&&b!=0){
	           result(a,b,c);
	        }else System.out.println( "/nIncorrect values!/n");
	    }
	    public static void result(double a, double b, double c){

	        double rez=b*b+4*a*c;

	        if (rez>=0) {
	            rez = Math.sqrt(rez);
	            rez=((b+rez)/2*a)-Math.pow(a,3)*c+Math.pow(b,-2);
	            System.out.printf("Result =%5.3f ",rez);
	        }
	        else System.out.println("Подкоренное выражение меньше нуля!");

	    }

}
