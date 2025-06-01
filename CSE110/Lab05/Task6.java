import java.util.Scanner;
public class Task6{
  public static void main(String[]args){
    String str1 = "";
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string: ");
    String M = sc.nextLine();
for(int i=M.length()-1; i>=0;i--){
      str1 = "";
      char c = M.charAt(i);
      int ascii = (int) c;
      if(ascii==32){
        System.out.println("");
      }
      else{
        char temp = (char) ascii;
        str1+=temp;
      }
      for(int j=str1.length()-1; j>=0;j--){
         char d = str1.charAt(j);
         System.out.print(d);
      }
}
  }
}