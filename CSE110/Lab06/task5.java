import java.util.Scanner;
public class task5{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the element number: ");
    int N = sc.nextInt();
    int []arr = new int[N];
    for(int i =0;i<arr.length;i++){
      System.out.println("Enter a number: ");
      arr[i]= sc.nextInt();
    }
    int M = sc.nextInt();
    int count=0;
    int index = 0;
    for(int j=0;j<arr.length;j++){
      if(count==0){
       if(arr[j]==M){
         count++;
         index+=j;
       }
     }
    }
    if(count>0){
      System.out.println(M+" is at index "+index);
    }
    else{
        System.out.println("Element not found");
      }
    }
  }