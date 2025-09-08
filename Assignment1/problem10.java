import java.util.Scanner;
import java.lang.Math;

public class problem10{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);

float x1 , x2 , y1 , y2 ;


System.out.println("Enter x and y coordinates of first point : ");

 x1 = sc.nextFloat();

 y1 = sc.nextFloat();

System.out.println("Enter x and y coordinates of second point : ");

x2 = sc.nextFloat();

 y2 = sc.nextFloat();

 Double distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));

System.out.println("Distance between two end points is : " +distance);

sc.close();

}

}

