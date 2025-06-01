import java.util.Scanner;
public class Task7{
  public static void main(String[]args){
    String s1 ="";
    boolean flag = true;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string: ");
    String M = sc.nextLine();
    System.out.println("Enter another string: ");
    String N = sc.nextLine();
    for(int i=0; i<M.length();i++){
      flag =true;
      char c = M.charAt(i);
      for(int j=0; j<N.length();j++){
        char d = N.charAt(j);
        if(c==d){
          flag=false;
        }
      }
      if(flag==true){
        s1+=c;
    }
    }
    for(int k=0; k<N.length();k++){
      flag =true;
      char e = N.charAt(k);
      for(int l=0; l<M.length();l++){
        char f = M.charAt(l);
        if(e==f){
          flag=false;
        }
      }
      if(flag==true){
        s1+=e;
    }
    }
    for(int s=0; s<s1.length();s++){
      char q = s1.charAt(s);
      int ascii = (int) q;
      ascii-=32;
      char val = (char) ascii;
      System.out.print(val);
  }
}
}