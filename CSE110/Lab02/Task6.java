import java.util.Scanner;
public class Task6{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int x = sc.nextInt();
    if (x<0){
      int output = 2*x;
      System.out.print("Output: "+output);
    }
    else if(0<=x && x<2){
      int output = x+1;
      System.out.print("Output: "+output);
    }
    else if(2<=x && x<5){
      int output = (x*x)-1;
      System.out.print("Output: "+output);
    }
    else if(x>=5){
      int output = (3*x*x)+2;
      System.out.print("Output: "+output);
    }
  }
}