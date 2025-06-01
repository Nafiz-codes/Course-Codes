import java.util.Scanner;
public class Task3{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int N = sc.nextInt();
    int neg = 0;
    int pos = 0;
    for(int i=0;i<N;i++){
      System.out.println("Enter numbers: ");
      int p = sc.nextInt();
      if(p>=0){
        pos++;
      }
      else{
        neg++;
      }
    }
    System.out.println(pos+" Non-negative Numbers");
    System.out.println(neg+" Negative Numbers");
  }
} 
    