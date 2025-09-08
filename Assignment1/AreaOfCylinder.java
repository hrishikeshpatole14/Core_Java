import java.util.Scanner;

public class AreaOfCylinder {

public static void main(String [] args) {

Scanner sc = new Scanner (System.in) ;

System.out.println("Enter the radius of cylinder : ");

Double radius = sc.nextDouble();

System.out.println("Enter the height of cylinder : ");

Double height =  sc.nextDouble();

double  area = 2*3.14*radius*radius + 2*3.14*radius*height;

double volume = 3.14*radius*radius*height;

System.out.println("Area of Cylinder is : " + area);

System.out.println("Volume of Cylinder is : " + volume);


sc.close();

}

}

