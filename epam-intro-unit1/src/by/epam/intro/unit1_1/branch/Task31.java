package by.epam.intro.unit1_1.branch;

/*31. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. 
 * Определить, пройдет ли кирпич через отверстие.*/
public class Task31 {
	public static void main(String[] args) {
        /*кирпич пролезет, если одна грань меньше или равна отверстию*/
        int A = 5, B = 5;
        int x = 4, y = 5, z = 6;
        int dAB, dXY, dXZ, dYZ; //диагонали граней в квадрате(нам все равно)

        dAB = A * A + B * B;
        dXY = x * x + y * y;   //вычисляем диагонали, если диагональ грани
        dXZ = x * x + z * z;   // меньше или равна дианонали отверстия, то все ОК
        dYZ = y * y + z * z;

        if (dAB >= dXY || dAB >= dXZ || dAB >= dYZ) {
            System.out.println("Кирпич пройдет!!!");
        } else {
            System.out.println("Кирпич не пройдет!!!");
        }


    }
}
