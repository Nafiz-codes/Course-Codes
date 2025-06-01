import java.util.Scanner;
public class Task5{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of N: ");
    int N = sc.nextInt();
    int sub = 0;
    for (int i=1;i<=N;i++){
      int sum =0;
      for(int j=0;j<=i;j++){
        sum = sum+j;
  }
      sub = sub-sum;
}
    System.out.println(sub);
  }
}