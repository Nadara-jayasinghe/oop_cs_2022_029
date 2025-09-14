package LW_01;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstname= Scanner.next();
        System.out.println("Enter your middle name:");
        String middlename=Scanner.next();
        System.out.println("Enter your last name:");
        String lastname=Scanner.next();
        System.out.println(lastname+","+firstname+" "+middlename.substring(0,1));
    }
}