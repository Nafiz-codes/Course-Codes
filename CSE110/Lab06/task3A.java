import java.util.Scanner;
public class task3A{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the element number: ");
    int N = sc.nextInt();
    int []arr = new int[N];
    for(int i =0;i<arr.length;i++){
      System.out.println("Enter a number: ");
      arr[i]= sc.nextInt();
    }
    int[]arr2= new int[N];
    int temp=0;
    for(int i=arr.length-1;i>=0;i--){
      arr2[temp]=arr[i];
      temp++;
    }
    System.out.println("Reversed using a new array: ");
    for(int j=0;j<arr2.length;j++){
      System.out.print(arr2[j]+" ");
    }
  }
}
    