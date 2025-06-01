import java.util.Scanner;
public class Task82{
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the first string: ");
 String str = sc.nextLine();
 String str_new="";
 
 for (int i=0;i<str.length();i++){
  char ch=str.charAt(i);
  int ascii=(int)ch;
  if (ch==' '){
    str_new+=ch;
   if ((i+1)%2!=0){
    if(ascii>=65 && ascii<=90){
    str_new+=ch;
    }
    else{
    char ch_new=(char)(ch-32);
    str_new+=ch_new;
    }
   }
    else if ((i+1)%2==0 && i!=0){
     if (ascii>=97 && ascii<=122){
     str_new+=ch;
     }
     else{
     char ch_new=(char)(ch+32);
     str_new+=ch_new; 
     }
    }
    i++;
    continue;
  }
  else if ((ascii>=65 && ascii<=90)||(ascii>=97 && ascii<=122)){
   if (i==0){
    char ch_new=(char)(ch+32);
    str_new+=ch_new;
   }
   else if (i%2!=0){
    if(ascii>=65 && ascii<=90){
    str_new+=ch;
    }
    else{
    char ch_new=(char)(ch-32);
    str_new+=ch_new;
    }
   }
    else if (i%2==0 && i!=0){
     if (ascii>=97 && ascii<=122){
     str_new+=ch;
     }
     else{
     char ch_new=(char)(ch+32);
     str_new+=ch_new; 
     }
    }
     }
  else{
    str_new+=ch;
   }
 }
  System.out.print(str_new);
 }
}
