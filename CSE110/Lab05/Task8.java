import java.util.Scanner;
public class Task8{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string: ");
    String M = sc.nextLine();
    for(int i=0; i<M.length();i++){
      char c = M.charAt(i);
      int ascii = (int) c;
      if(ascii==32){
        continue;
      }
      else{
        if(M.charAt(0)==(A>=Z)){
          ascii+=32;
        }
        if(M.charAt(i+2)==(A>=Z)){
          ascii+=32;
        }
        if(M.charAt(i+1)==(a>=z)){
          ascii-=32;
        }
           }    
      char val = (char) ascii;
      System.out.print(val);
    }
  }
  }
 
