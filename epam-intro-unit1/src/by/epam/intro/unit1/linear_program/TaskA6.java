package by.epam.intro.unit1.linear_program;

import java.io.*;
import static java.lang.Integer.parseInt;

/*��� ������ ������� ��������� �������� ���������, ������� �������� true,
���� ����� � ������������ (�, �) ����������� ����������� �������,
� false � � ��������� ������:*/
public class TaskA6 {
    public static void main(String[] args) throws IOException {
    	int x;
        int y;

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("������� ����������:");
        System.out.println("x= ");
        String str = bufferedReader.readLine();
        x=parseInt(str);
        System.out.println("y= ");
        str = bufferedReader.readLine();
        y=parseInt(str);

        boolean flag;
        //������� ������, ���������� ���������� ������� � ��������� 1 ��������� �������!
        x=Math.abs(x); //������ ������� ������!

        if (x>=2&&x<4&&y>0&&y<4){
            flag=false;
        }else flag=true;

        System.out.println(flag?"����� ����������� �������":"����� �� ����������� �������");}
}
