import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RunAll {
    public static void main(String[] args) {
/*
        1. Дано трехзначное число. Вывести число, полученное при прочтении исходного числа справа налево.
        2. Дано трехзначное число. В нем зачеркнули первую слева цифру и приписали ее справа. Вывести полученное число.
        3. Дано трехзначное число. Вывести число, полученное при переста¬новке цифр сотен и десятков исходного числа (например,
        123 перейдет в 213).
        4. Дано трехзначное число. Заменить в нем вторую цифру, если она является четной, на ближайшую большую нечетную цифру.
        5. Дано трехзначное число. Изменить одну его цифру так, чтобы оно стало палиндромом (одинаково читается справа налево и слева направо).
        6. Дано трехзначное число. Определить, является ли его число десятков четным числом.
        7. Дано трехзначное число. Определить, является ли его число сотен нечетным числом.
        8. Определить, является ли введенное трехзначное число палиндромом (одинаково читается справа налево и слева направо).
        9. Дано целое число, большее 999. Найти цифру, соответствующую разряду сотен в записи этого числа.
        10. Дано трехзначное число. Определить разность между этим числом и числом, записанным из тех же цифр, но в обратном порядке.
        11. Дано трехзначное число. Округлить его до десятков.
        12. Дано трехзначное число. Округлить его до сотен.
         */
        // boolean;byte;short;int;long;float;double;char
        int number = 141;
        int hundreds = number/100;
        int tens = (number%100)/10;// JIB<RF
        System.out.println(tens);
        int units= (number%10)/100;
        int number2=units*100+tens*10+hundreds;
        System.out.println(number2);
        System.out.println(units);
        System.out.println(hundreds);
        //
        number=141;
         hundreds = number/100;
         tens = (number%100)/10;
         units= number%10;
        number2 = tens*100+units*10+hundreds;
        System.out.println(number2);

            if(tens%2==0)
                tens++;
        number2 = hundreds*100+tens*10+units;
        System.out.println(number2);
        /*
        int x = ++tens; //tens++; x=tens;
        x = tens++; //x=tens; tens++
        tens++
        ++tens
        tens=5; x=5;
        */

        boolean b =tens%2==0;
        System.out.println(b);
        if (tens%2==0)
        tens++;
        number2=hundreds*100+tens*10+units;

    if (hundreds==units)
        System.out.println("palindrom");
    else
        System.out.println("not a palindrom");

    String s=hundreds==units?"palindrom":"not a palindrom";
        System.out.println(s);
//0000000
    }
}

