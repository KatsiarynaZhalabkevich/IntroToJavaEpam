package by.epam.intro.unit1.linear_program;
/*���� ����������� ����� �, ������� ������������ ������������ ���������� ������� � ��������.
������� ������ �������� ������������ � �����, ������� � �������� � ��������� �����:
��� ����� SSc.*/
public class TaskA5 {
    public static void main(String[] args) {

    	int time =15899651; //����� � ��������
        int hours;
        int minutes;
        int seconds;

        hours = time/3600;
        time%=3600; //������� �� ������� �� ����
        minutes = time/60;
        seconds=time%60;
        System.out.println(hours+" ����� "+minutes+" ����� "+seconds+" ������ ");
    }
}
