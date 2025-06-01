import java.util.Scanner;
public class Task8{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int paid = sc.nextInt();
    int age = sc.nextInt();
    if (age>18){
      if (paid<10000){
       System.out.println("Your tax amounts in 0 Tk");
    }
      else if (10000<=paid && paid<=20000){
        int tax = (paid*5)/100;
        System.out.println("Your tax amounts in "+ tax +" Tk");
      }
      else if(paid>20000){
        int tax = (paid*10)/100;
        System.out.println("Your tax amounts in "+ tax +" Tk");
      }
      }
    else{
      System.out.println("Your tax amounts in 0 Tk");
  }
}
}