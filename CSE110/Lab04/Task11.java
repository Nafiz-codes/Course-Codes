import java.util.Scanner;
public class Task11{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter starting number: ");
    int N = sc.nextInt();
    System.out.println("Enter ending number: ");
    int M = sc.nextInt();
    int digit_count = 0;
    int temp = N;
    int temp3 = 0;
    while(temp!=0){
      temp3 = temp%10;
      digit_count++;
      temp/=10;
    }
    System.out.println(digit_count);
    System.out.println("Armstrong numbers: ");
    for(int i=N;i<=M;i++){
      int sum = 0;
      int temp1 = i;
      while(temp1!=0){
        int temp2 = 0;
        temp2 = temp1%10;
        sum+= Math.pow(temp2,digit_count);
        temp1/=10;
      }
      if(sum==i){
        System.out.println(i);
      }
    }
  }
} 
        
      