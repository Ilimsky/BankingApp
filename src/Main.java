import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import java.util.Scanner;

public class Main{
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws ParseException {

        new TextFields();

        /*Payment payment = new Payment();
        System.out.print("Введите сумму кредита ");
        int sum = scanner.nextInt();
        System.out.print("Введите срок кредита ");
        int period = scanner.nextInt();
        System.out.print("Введите %-ую ставку кредита ");
        double percent = scanner.nextInt();
        System.out.print("Введите дату ");
        int dayOfIssue = scanner.nextInt();
        System.out.print("Введите месяц ");
        int monthOfIssue = scanner.nextInt();
        System.out.print("Введите год ");
        int yearOfIssue = scanner.nextInt();
        scanner.close();

        System.out.printf("%-4s %-30s %-15s %-14s %-15s %-15s", "№","Дата","Взнос","Проценты","Капитал","Остаток");
        System.out.println();
        payment.payment(sum, period, percent, yearOfIssue, monthOfIssue, dayOfIssue);*/
    }
}
