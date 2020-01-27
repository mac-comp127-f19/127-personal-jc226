package basicjava;
import java.util.Scanner;
import java.lang.Math;
public class BasicStuff {
    public static void main(String[] args) {
        double age0 = 19;
        double age1 = 20;
        System.out.println("We are 19 and 20 years old!");
        double sumOfAges = age0 + age1;
        System.out.println("The sum of our age is " + sumOfAges + " !");
        System.out.println("The sum of our age is " + (age0 + age1) + " !");
        System.out.println(6/3);
        System.out.println(6/4);
        System.out.println(6/4.0);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE-1);
        System.out.println("There are 1600 hours in 1600 hours");
        System.out.println("There are " + (1600/24.0) + "days in 1600 hours");
        System.out.println("There are " + (1600/168.0) + "weeks in 1600 hours");
        Scanner myObj = new Scanner(System.in);
        double radius = myObj.nextDouble();
        Scanner myObj2 = new Scanner(System.in);
        double height = myObj2.nextDouble();
        double V = (1/3.0) * Math.PI * radius * radius * height;
        System.out.println("The volume is " + V);
        double A = Math.PI*radius*radius + Math.PI*radius*Math.sqrt(radius*radius+height*height);
        System.out.println("The surface area is " + A);
    }
}
