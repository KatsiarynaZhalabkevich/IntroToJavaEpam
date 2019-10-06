package by.epam.intro.unit1_1.linear_program_;

/*22. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.*/

public class Task22 {
	public static void main(String[] args) {

        int time =15899651; //время в секундах
        int hours;
        int minutes;
        int seconds;

        hours = time/3600;
        time%=3600; //остаток от деления на часы
        minutes = time/60;
        seconds=time%60;
        System.out.println(hours+" часов "+minutes+" минут "+seconds+" секунд ");
    }
}
