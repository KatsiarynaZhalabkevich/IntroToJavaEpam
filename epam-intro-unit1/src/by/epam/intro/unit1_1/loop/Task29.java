package by.epam.intro.unit1_1.loop;

/*29. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.*/

public class Task29 {
	 public static void main(String[] args) {
	        int n = 1234;
	        int m = 145369;
	        numbers(n);
	        numbers(m);

	    }

	    public static void numbers(int n) {

	        String str = Integer.toString(n);
	        System.out.println("Number " + n + " consists of: ");

	        for (int i = 0; i < str.length(); i++) {
	            System.out.print(" " + str.charAt(i));

	        }
	    }

}
