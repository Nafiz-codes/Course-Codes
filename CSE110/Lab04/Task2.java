import java.util.Scanner;
public class Task2{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    for(int i=0; ;i++){
      System.out.println("Enter the number: ");
      int N = sc.nextInt();
      if(N>0){
        System.out.println(N*N);
      }
      else{
        break;
      }
    }
  }
}