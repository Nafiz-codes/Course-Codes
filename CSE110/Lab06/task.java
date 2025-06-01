import java.util.Scanner;
public class task1{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the element number: ");
    int N = sc.nextInt();
    int []arr = new int[N];
    for(int i =0;i<arr.length;i++){
      System.out.println("Enter a number: ");
      arr[i]= sc.nextInt();
    }
    System.out.println("The element of the array are: ");
    for(int i=0;i<arr.length;i++){
      System.out.println(i+":"+arr[i]);
    }
    System.out.println("Enter another number: ");
    int M = sc.nextInt();
    int []arr2 = new int[N+1];
    for(int j=0;j<arr.length;j++){
      arr2[j]=arr[j];
    }
    arr2[arr2.length-1] = M;
    System.out.println("After resizing the array: ");
    for(int j=0;j<arr2.length;j++){
      System.out.print(arr2[j]+" ");
    }
  }
}
      
