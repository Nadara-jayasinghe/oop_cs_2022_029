package LW_01;

import java.util.Scanner;

public class Q_01 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter an odd length word: ");
        String word=Scanner.next();
        int length=word.length();
        System.out.println(word.substring(length/2,length/2+1));



    }
}

