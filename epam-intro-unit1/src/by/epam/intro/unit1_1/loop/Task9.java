package by.epam.intro.unit1_1.loop;

/*сумма квадратов первых 100 чисел*/

public class Task9 {
	
	public static void main(String[] args) {
        int sum=0;

        for (int i = 1; i <=100 ; i++) {
            sum+=i*i;
        }
        System.out.println("Результат "+sum);

    }

}
