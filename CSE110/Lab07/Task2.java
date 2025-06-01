import java.util.Scanner;
public class Task2{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[]arr = new int[N];
    for(int i = 0; i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Before removing duplicates: ");
    for(int j=0;j<arr.length;j++){
      System.out.print(arr[j]+" ");
    }
    System.out.println();
    for(int i=0;i<arr.length;i++){
      if(arr[i]==0){
        continue;
      }
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]){
          arr[j]=0;
        }
     }
   }
    System.out.println("After replacing duplicates with 0: ");
    for(int j=0;j<arr.length;j++){
      System.out.print(arr[j]+" ");
    }
  }
 }