import java.util.Scanner;

public class problem9{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the amount to withdraw : ");

int amount = sc.nextInt();

int tenNotes = amount / 10 ;
amount = amount % 10 ;

int fiveNotes = amount / 5 ;
amount = amount % 5 ;

int oneNotes = amount / 1 ;
amount = amount % 1 ;

System.out.println("Currency notes needed are : ");
System.out.println("10 rupees notes           : " +tenNotes);
System.out.println("5  rupees notes           : " +fiveNotes);
System.out.println("1  rupees notes           : " +oneNotes);


sc.close();

}

}





