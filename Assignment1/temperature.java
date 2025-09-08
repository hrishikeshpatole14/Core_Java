import java.util.Scanner;

public class temperature{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the temperature in Fahrenhit(F) : ");

Double f = sc.nextDouble();

Double c = (f - 32) * (5.0/9.0);

Double k  = c + 273.15;

System.out.println("Temperature from Fahrenheit to Celsius is : " + c);

System.out.println("Temperature from Fahrenheit to kelvin is : " + k);

sc.close();

}

}

