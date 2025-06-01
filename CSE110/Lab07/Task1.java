import java.util.Scanner;
public class Task1{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int N = sc.nextInt();
    evenChecker(N);
    System.out.println("Enter the number: ");
    int M = sc.nextInt();
    boolean result = isEven(M);
    System.out.println( result );
    System.out.println("Enter the number: ");
    int O = sc.nextInt();
    result = isPos(O);
    System.out.println( result );
    System.out.println("Enter the number: ");
    int R = sc.nextInt();
    sequence(R);
  }
  public static void evenChecker(int num){
    if(num%2==0){
      System.out.println("Even!!");
    }
    else{
      System.out.println("Odd!!");
    }
  }
  public static boolean isEven(int num){
    if(num%2==0){
      return true;
    }
    else{
      return false;
    }
  }
  public static boolean isPos(int num){
    if(num>=0){
      return true;
    }
    else{
      return false;
    }
  }
  public static void sequence(int num){
    boolean pos = isPos(num);
    if(pos==true){
        for(int i=0; i<=num; i++){
           boolean even = isEven(i);
           if(even==true){
             System.out.print(i+" ");
           }
        }
     }
    else{
       for(int i=num;i<0;i--){
         boolean even = isEven(i);
         if(even==false);
         System.out.print(i+" ");
           }
       }
    }
  }
