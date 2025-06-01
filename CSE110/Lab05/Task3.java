import java.util.Scanner;
public class Task3{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string: ");
    String M = sc.nextLine();
    System.out.println("Enter the split: ");
    String N = sc.nextLine();
    char n1 = N.charAt(0);
    int val = (int) n1;
    for(int i=0; i<M.length();i++){
      char c = M.charAt(i);
      int ascii = (int) c;
      if(ascii==val){
        System.out.println("");
      }
      else{
        char temp = (char) ascii;
        System.out.print(temp);
      }
    }
  }
} 
      