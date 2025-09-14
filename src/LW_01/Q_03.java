package LW_01;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter length in centimeters:");
        float cm= Scanner.nextFloat();
        double in=(int)cm/2.54;
        double ft=(int)in/12;
        in=(int)in%12;
        System.out.println("feet:"+ft+" "+"inches:"+in);





    }
}

