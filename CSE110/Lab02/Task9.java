import java.util.Scanner;
public class Task9{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three double numbers:");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    if (a>c && a>b){
      System.out.println("Maximum number is "+a);
      if (b>c){
        System.out.println("Minimum number is "+c);
      }
      else{
        System.out.println("Minimum number is "+b);
      }
    }
    else if(b>a && b>c){
      System.out.println("Maximum number is "+b);
      if (a>c){
        System.out.println("Minimum number is "+c);
      }
      else{
        System.out.println("Minimum number is "+a);
      }
    }
    else if(c>a && c>b){
      System.out.println("Maximum number is "+c);
      if (a>b){
        System.out.println("Minimum number is "+b);
      }
      else{
        System.out.println("Minimum number is "+a);
      }
    }
  }
}
      