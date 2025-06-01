import java.util.Scanner;
public class Task83{
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the string: ");
 String M = sc.nextLine();
 String str1="";
 for (int i=0;i<M.length();i++){
  char c=M.charAt(i);
  int ascii=(int)c;
  if (ascii==32){
    str1+=c;
    continue;
  }
  else if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z'){
   if (i==0){
    ascii+=32;
    char d=(char)ascii;
    str1+=d;
   }
   else if (i%2==0){
     if (c >= 'a' && c <= 'z'){
     str1+=c;
     }
     else{
     ascii+=32;
     char d=(char)ascii;
     str1+=d; 
     }
    }
   else if (i%2!=0){
    if(c >= 'A' && c <= 'Z'){
    str1+=c;
    }
    else{
    ascii-=32;
    char d=(char)ascii;
    str1+=d;
    }
   }
     }
  else{
    str1+=c;
   }
 }
  System.out.print(str1);
 }
}
