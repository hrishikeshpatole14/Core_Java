import java.util.Scanner;

public class AreaOfCircle{
 
  public static void main(String [] args) {


Scanner sc = new Scanner(System.in);

System.out.println("Enter the radius of circle : ");

double r = sc.nextDouble();

double area  = 3.14 * r * r ;

double circumference = 2 * 3.14 * r ;

System.out.println("Area of Circle is : " + area );


System.out.println("Circumference of circle is : " + circumference);

sc.close();


}

}
