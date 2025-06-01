import java.util.Scanner;
public class Task81{
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the string: ");
 String M = sc.nextLine();
 String str1="";
 for (int i=0;i<str1.length();i++){
   char c = str1.charAt(i);
   int ascii=(int)c;
     if (i==0 && (ascii>=65 && ascii<=90)){
      ascii+=32;
      char val = (char) ascii;
      str1+=val;
     }
     if (i%2!=0){
       if(ascii>=65 && ascii<=90){
        str1+=c;
        }
    else{
    ascii-=32;
    char val=(char) ascii;
    str1+=val;
    }
   }
    if (ascii==32){
     str1+=' ';
     i+=1;
     continue;
    }
    if (i%2==0 && i!=0){
     if (ascii>=97 && ascii<=122){
     str1+=c;
     }
     else{
     ascii+=32;
     char d=(char)ascii;
     str1+=d; 
     }
    }
  System.out.print(str1);
 }
}
}
