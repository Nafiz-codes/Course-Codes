import java.util.Scanner;
public class Task12{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three numbers:");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if(a==b && a==c){
      System.out.println("All numbers are equal");
    }
    else if((a==b && a!=c) || (a==c && c!=b) || (b==c && b!=a)){
      System.out.println("Neither all are equal or different");
    }
    else{
        System.out.println("All numbers are different");
    }
  }
}