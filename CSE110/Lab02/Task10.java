import java.util.Scanner;
public class Task10{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three sides of a triangle:");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if(a==b && a==c){
      System.out.println("This is a Equilateral triangle");
    }
    else if((a==b && a!=c) || (a==c && c!=b) || (b==c && b!=a)){
      System.out.println("This is a Isosceles triangle");
    }
    else{
        System.out.println("This is a Scalene triangle");
    }
  }
}