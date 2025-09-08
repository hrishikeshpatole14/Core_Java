import java.util.Scanner;

public class problem5{

public static void main ( String [] args){


Scanner sc = new Scanner(System.in);

System.out.println("Enter number 1 : ");
int n1 = sc.nextInt();

System.out.println("Enter number 2 : ");
int n2 = sc.nextInt();

int am = (n1+n2)/2;
int hm = (n1*n2)/(n1+n2);

System.out.println("Arithmetic of two num is : " + am);

System.out.println("Harmonic of two num is : " + hm);


sc.close();

}

}


