import java.util.Scanner;
public class Task9{
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter password: ");
 String password = sc.nextLine();
 int length = password.length();
 int uppercase=0;
 int lowercase=0;
 int digit=0;
 int special=0;
 if (length>=8){
 for (int i=0;i<password.length();i++){
  char c=password.charAt(i);
  int ascii=(int)c;
  if ((c >= 'a' && c <= 'z')||(c >= 'A' && c <= 'Z')||(ascii>=48 && ascii<=57)||(ascii==32)||(ascii>=33 && ascii<=47)||ascii==64){
   if (c >= 'A' && c <= 'Z'){
    uppercase++;
  }
   if (c >= 'a' && c <= 'z'){
    lowercase++;
  }
   if (ascii>=48 && ascii<=57){
    digit++;
  }
  }
   if((ascii>=33 && ascii<=47)||ascii==64){
    special++;
   }
  }
 
 if (uppercase>=1 && lowercase>=1 && digit>=1 && special>=1){
  System.out.print("True");
 }
 else{
  System.out.print("False"); 
 }
}
 else{
  System.out.print("False");
 }
 }
}