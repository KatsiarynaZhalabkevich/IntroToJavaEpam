package by.epam.intro.unit1_1.linear_program_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*Для данной области составить линейную программу, которая печатает true,
если точка с координатами (х, у) принадлежит закрашенной области,
и false — в противном случае:*/

public class Task38 {
	public static void main(String[] args) throws IOException {
        int x;
        int y;

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Введите координаты:");
        System.out.println("x= ");
        String str = bufferedReader.readLine();
        x=Integer.parseInt(str);
        System.out.println("y= ");
        str = bufferedReader.readLine();
        y=Integer.parseInt(str);

        boolean flag;
        //область четная, достаточно обозначить область и исключить 1 маленький кусочек!
        x=Math.abs(x); //нельзя убирать модуль!

        if (x>=2&&x<4&&y>0&&y<4){
            flag=false;
        }else flag=true;

        System.out.println(flag?"Точка принадлежит области":"Точка не пренадлежит области");
    }
}
