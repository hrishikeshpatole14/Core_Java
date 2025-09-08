import java.util.Scanner;

public class problem4{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the initial velocity : ");

Double u = sc.nextDouble();

System.out.println("Enter the acceleration : ");

Double a = sc.nextDouble();

System.out.println("Enter the time : ");

Double t = sc.nextDouble();

Double v = u + a*t;

Double s = u + a*t*t;


System.out.println("The Final velocity is : " + v);

System.out.println("The Final distance is : " + s);

sc.close();

}

}


