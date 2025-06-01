import java.util.Scanner;
public class Task5{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string: ");
    String M = sc.nextLine();
    int vowels = 0;
    int consonant = 0;
    for(int i=0; i<M.length();i++){
      char c = M.charAt(i);
      int ascii = (int) c;
      if(ascii==97 || ascii==101||ascii==105||ascii==111||ascii==117){
        vowels++;
      }
      if((65<=ascii && ascii<=122) &&(ascii!=97 || ascii!=101||ascii!=105||ascii!=111||ascii!=117)){
        if(91>=ascii && ascii<=96){
          continue;
        }
      }
      else{
         consonant++;
        }
    }
         if(vowels%3==0 && consonant%5==0){
            System.out.println("Aaarr! Me Plunder!!");
          }
          else{
            System.out.println("Blimey! No Plunder!!");
          }
          }
}