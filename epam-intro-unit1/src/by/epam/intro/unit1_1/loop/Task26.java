package by.epam.intro.unit1_1.loop;

/*26. Вывести на экран соответствий между символами и их численными обозначениями в памяти
компьютера (Таблицу ASCII).*/

public class Task26 {
	
	public static void main(String[] args) {
	        char a;
	        for (int i = 0; i <500 ; i++) {
	            a=(char)i;
	            System.out.println(i+ " ---> "+a);
	           // System.out.println(a+ " ---> "+i); //если надо наоборот
	        }
	    }

}
