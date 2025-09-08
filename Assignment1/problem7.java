import java.util.Scanner;

public class problem7{

  public static void main(String [] args){
   
    Scanner sc = new Scanner(System.in);

     System.out.println("Enter value for a : ");

     int a = sc.nextInt();

     System.out.println("Enter value for b : ");


    int b = sc.nextInt();


    int temp ;

     temp = a; 
     a = b ;
     b = temp ;


   System.out.println("Interchange value of a is : " +a);

   System.out.println("Interchange value of b is : " +b);

    sc.close();

}

}




     