package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args){
        double radius;
        double area;
        double pie = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Lets find the area of a circle.\nEnter the radius?");
        radius = input.nextDouble();
        input.close();
        area = Circles.getArea(radius);
        System.out.println("The area of the circle is "+area);

    }
}
