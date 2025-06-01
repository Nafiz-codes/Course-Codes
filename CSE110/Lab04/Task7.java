import java.util.Scanner;
public class Task7{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int N = sc.nextInt();
    int temp1 = 0;
    for(int i=0;i<N;i++){
      System.out.println("Enter 1st numbers: ");
      int X = sc.nextInt();
      System.out.println("Enter 2nd numbers: ");
      int Y = sc.nextInt();
      int sum = 0;
      if(X%2==0){
        X++;
      }
      for(int j=1;j<=Y;j++){
         sum +=X;
         X+=2;
      }
      System.out.println(sum);
      
    }
  }
  }

       