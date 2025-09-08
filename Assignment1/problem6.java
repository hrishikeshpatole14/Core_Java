import java.util.Scanner;

public class problem6{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the Lenght of cuboid : ");

Double l = sc.nextDouble();

System.out.println("Enter the breadth of cuboid : ");

Double b = sc.nextDouble();


System.out.println("Enter the height of cuboid : ");

Double h = sc.nextDouble();

Double s = 2 * (l*b + l*h + b*h) ;

Double v = l*b*h;

System.out.println("Surface area of cuboid is : " +s);

System.out.println("Volume of cuboid is : " +v);

sc.close();

}

}
