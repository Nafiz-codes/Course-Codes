import java.util.Scanner;
public class Task1{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three numbers:");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if (a>b && a>c){
      System.out.println("Largest number: "+a);
    }
    else if (b>a && b>c){
      System.out.println("Largest number: "+b);
    }
    else{
      System.out.println("Largest number: "+c);
    }
  }
}
