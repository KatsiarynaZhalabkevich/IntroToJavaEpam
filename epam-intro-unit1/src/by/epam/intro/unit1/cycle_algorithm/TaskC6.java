package by.epam.intro.unit1.cycle_algorithm;

/*Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера*/
public class TaskC6 {
	public static void main(String[] args) {
		char a;
		for (int i = 0; i < 256; i++) {
			a = (char) i;
			System.out.println(i + " ---> " + a);
			System.out.println(a + " ---> " + i); // если надо наоборот
		}
	}
}
