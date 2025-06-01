import java.util.Scanner;
public class Task1{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string: ");
    String M = sc.nextLine();
    for(int i=0; i<M.length();i++){
      char c = M.charAt(i);
      int ascii = (int) c;
      if(ascii>=97 && ascii<=122){
        ascii-=32;
      }
      char val = (char) ascii;
      System.out.print(val);
    }
  }
}