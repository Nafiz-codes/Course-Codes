import java.util.Scanner;
public class Task2{
  public static void main (String[]args){
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number: ");
    int grade = sc.nextInt();
    if (100<=grade || grade>=90){
      System.out.print("Your grade is A");
  }
    else if (89<=grade || grade>=85){
      System.out.print("Your grade is A-");
  }
    else if (84<=grade || grade>=70){
      System.out.print("Your grade is B");
  }
    else if (69<=grade || grade>=57){
      System.out.print("Your grade is C");
  }
    else if (56<=grade || grade>=50){
      System.out.print("Your grade is D");
  }
    else{
      System.out.print("Your grade is F");
  }
 }
}