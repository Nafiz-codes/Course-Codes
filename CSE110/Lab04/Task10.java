import java.util.Scanner;
public class Task10{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of height: ");
    int M = sc.nextInt();
    int temp = M;
    for (int i=1;i<=M;i++){
      for(int j=1;j<=temp-1;j++){
        System.out.print(" ");
      }
      for(int k=1;k<=(2*i-1);k++){
        System.out.print(k);
    }
    System.out.println();  
    temp--;
  } 
}
}  