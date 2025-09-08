import java.util.Scanner;

public class problem8{

public static void main(String [] args){

 Scanner sc = new Scanner(System.in);

System.out.println("Enter the employee id : ");

int id = sc.nextInt();

System.out.println("Enter employee basic salary : ");

int bs = sc.nextInt();

int da = 30;
int hra = 10;
 int tax = 5;
int hs ;  


hs = bs+((bs*(da+hra))/100);

System.out.println("Employee id is : " +id);
System.out.println("Employee dearness allowance is (%%) : " +da);
System.out.println("Employee House renting is (%%) : " +hra);
System.out.println("Employee Tax is(%%) : " +tax);
System.out.println("Employee Basic Salary is : " +bs);
System.out.println("Employee Home Salary is : " +hs);

sc.close();

}

}

