import java.util.Scanner;

public class problem12{

public static void main(String [] args){


Scanner sc = new Scanner(System.in);

System.out.println("Enter the character : ");

char ch = sc.next().charAt(0);


System.out.println("The ASCII value of '" + ch + "' is " + (int) ch);

sc.close();

}

}


