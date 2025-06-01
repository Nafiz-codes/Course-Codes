import java.util.Scanner;
public class task4{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the element number: ");
    int N = sc.nextInt();
    int []arr = new int[N];
    for(int i =0;i<arr.length;i++){
      System.out.println("Enter a number: ");
      arr[i]= sc.nextInt();
    }
    System.out.println("Original array: ");
    for(int j=0;j<arr.length;j++){
      System.out.print(arr[j]+" ");
    }
    for(int i=0;i<arr.length;i++){
      if(arr[i]>0){
        arr[i]=1;
      }
      else{
        arr[i]=0;
      }
    }
    System.out.println("After modifying: ");
    for(int j=0;j<arr.length;j++){
      System.out.print(arr[j]+" ");
    }
  }
}