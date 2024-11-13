import java.util.Scanner;

import static java.lang.System.in;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Switch {
    public static void main(String[] args) {
Scanner Scanner = new Scanner(in);
System.out.println("Введите день недели ");
int N = Scanner.nextInt();
 switch (N)  {
     case 1: System.out.println("Понедельник");
         break;
     case 2: System.out.println("Вторник");
         break;
     case 3: System.out.println("Среда");
         break;
     case 4: System.out.println("Четверг");
         break;
     case 5: System.out.println("Пятница");
         break;
     case 6: System.out.println("Суббота");
         break;
     case 7: System.out.println("Воскресенье");
         break;
     default: System.out.println("ОШИБКА");
 }

    }

 }