package by.epam.intro.unit1.branch_algorithm;

import java.io.*;

/*����� max{min(a, b), min(c, d)}*/
public class TaskB2 {
    public static void main(String[] args) throws IOException {
    	
    	int a, b, c, d, min1, min2, max;

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("������� ��������!");
        System.out.print("� =");
        String str = bufferedReader.readLine();
        a = Integer.parseInt(str);
        System.out.print("B =");
        String str1 = bufferedReader.readLine();            //���� ����� ������
        b = Integer.parseInt(str1);
        System.out.print("� =");
        String str2 = bufferedReader.readLine();
        c = Integer.parseInt(str2);
        System.out.print("D =");
        String str3 = bufferedReader.readLine();
        d = Integer.parseInt(str3);

        if (a <= b) min1 = a;
        else min1 = b;

        if (c <= d) min2 = c;
        else min2 = d;

        if (min1 > min2) max = min1;
        else max = min2;

        System.out.println("max{min(a,b), min(c,d)} = " + max);
    }
    }

