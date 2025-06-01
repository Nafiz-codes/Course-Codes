import java.util.Scanner;
public class task9{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the element number: ");
    int N = sc.nextInt();
    int []arr = new int[N];
    for(int i =0;i<arr.length;i++){
      System.out.println("Enter a number: ");
      arr[i]= sc.nextInt();
    }
    System.out.println("Original Array:");
    for(int i =0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    for(int i=0;i<arr.length;i++){
      for(int j=1;j<arr.length-i;j++){
        if(arr[j-1]>arr[j]){
          int temp = arr[j];
          arr[j]=arr[j-1];
          arr[j-1]=temp;
        }
      }
    }
    int[]arr2= new int[N];
    int temp=0;
    for(int i=arr.length-1;i>=0;i--){
      arr2[temp]=arr[i];
      temp++;
    }
    System.out.println("Sorted Array:");
    for(int i =0;i<arr2.length;i++){
      System.out.print(arr2[i]+" ");
    }
  } 
}
    
    
    