import java.util.Scanner;
public class task3B{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the element number: ");
    int N = sc.nextInt();
    int []arr = new int[N];
    for(int i =0;i<arr.length;i++){
      System.out.println("Enter a number: ");
      arr[i]= sc.nextInt();
    }
    System.out.println("Reversed the original array: ");
    for(int j=arr.length-1;j>=0;j--){
      System.out.print(arr[j]+" ");
    }
  }
}