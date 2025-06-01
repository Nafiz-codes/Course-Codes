import java.util.Scanner;
public class Task8{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of width: ");
    int N = sc.nextInt();
    System.out.println("Enter the value of length: ");
    int M = sc.nextInt();
    for (int i=1;i<=M;i++){
      for(int j=1;j<=N;j++){
        System.out.print(j+" ");
      }
      System.out.println();
    }
  }
}