import java.util.Scanner;
public class Task2{
  public static void main(String[]args){
    boolean flag = false;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string: ");
    String M = sc.nextLine();
    for(int i=0; i<M.length();i++){
      char c = M.charAt(i);
      int ascii = (int) c;
      if(M.charAt(i) == M.charAt(M.length()-1-i)){
        flag = true;
      }
      else{
        flag = false;
        break;
    }
    }
    System.out.print(flag);
  }
}
  