import java.util.Scanner;
public class Task1{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int N = sc.nextInt();
    int max = -9999;
    int min = 9999;
    int avg = 0;
    int sum = 0;
    int count = 0;
    for(int i=0;i<N;i++){
      System.out.println("Enter numbers: ");
      int p = sc.nextInt();
      if(p>=0 && p%2==0){
        if(p<min){
         min=p;
        }
        if(p>max){
          max=p;
      }
        sum+=p;
        count++;
      }
    }
      if(sum>0){
        avg = sum/count;
      }
      else{
        avg = 0;
      }
    System.out.println("Max: "+max);
    System.out.println("Min: "+min);
    System.out.println("Average: "+avg);
  } 
}
  
