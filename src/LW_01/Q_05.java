package LW_01;

import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        System.out.println("Enter the radius of the inner circle:");
        double ri=Scanner.nextDouble();
        System.out.println("Enter the radius of the outer circle:");
        double ro=Scanner.nextDouble();
        circle outerCircle = new circle(ro);
        circle innerCircle = new circle(ri);
        double outerCircleArea=outerCircle.computeArea();
        double innerCircleArea=innerCircle.computeArea();
        double shadeArea=outerCircleArea-innerCircleArea;
        System.out.println("shaded area: "+shadeArea);
    }
}
