import java.util.Scanner;
public class Task6{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    for(int i=0; ;i++){
      System.out.println("Enter the number: ");
      int N = sc.nextInt();
      int div = 0;
      if(N%2==0){
        for(int k=1;k<=N;k++){
          div = 0;
          for(int j=1;j<=k;j++){
            if(k%j==0){
              div++;
            }
          }
        }
         System.out.println(N+" has "+div+" divisors");
      } 
      else{
        break;
      }
    }
  }
}     

