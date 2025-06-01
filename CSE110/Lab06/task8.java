import java.util.Scanner;
public class task8{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the element number: ");
    int N = sc.nextInt();
    int []arr = new int[N];
    for(int i =0;i<arr.length;i++){
      System.out.println("Enter a number: ");
      arr[i]= sc.nextInt();
    }
    System.out.println("enter the element number: ");
    int M = sc.nextInt();
    int []arr2 = new int[M];
    for(int i =0;i<arr2.length;i++){
      System.out.println("Enter a number: ");
      arr2[i]= sc.nextInt();
    }
    boolean []arr3= new boolean[arr.length];
    for(int i=0;i<arr3.length;i++){
      arr3[i]=false;
    }
    int count =0;
    for(int i=0;i<arr2.length;i++){
      for(int j=0;j<arr.length;j++){
        if(arr3[j]==false){
          if(arr[j]==arr2[i]){
            count++;
            arr3[j]=true;
          }
        }
       }
      }
      if(count/arr2.length==1){
        System.out.println("Array 2 is a subset of Array 1.");
      }
      else{
        System.out.println("Array 2 is not a subset of Array 1.");
      }
    }
  }
        
          
          