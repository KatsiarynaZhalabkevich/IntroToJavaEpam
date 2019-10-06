package by.epam.intro.unit1_1.linear_program_;

/*перевести радианы в градусы, минуты и секунды*/
public class Task28 {
	public static void main(String[] args) {

		double radian = 3.14;

		int grad = ((int) convertToSec(radian)) / 3600;
		int second = ((int) convertToSec(radian)) % 60;
		int minute = ((int) convertToSec(radian) - grad * 3600 - second) / 60;

		System.out.println(radian + " радиан = " + grad + " градусов " + minute + " минут " + second + " секунд ");

	}

	public static double convertToSec(double rad) {

		return rad * 180 * 3600 / Math.PI;

	}
}
