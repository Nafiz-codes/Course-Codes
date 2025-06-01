import java.util.Scanner;
public class Task4{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string: ");
    String M = sc.nextLine();
    for(int i=M.length()-1; i>=0;i--){
      char c = M.charAt(i);
      System.out.print(c);
    }
  }
}