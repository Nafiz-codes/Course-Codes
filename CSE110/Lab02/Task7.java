import java.util.Scanner;
public class Task7{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter ID:");
    int id = sc.nextInt();
    int th = id/100000;
    int third_digit = th%10;
    int first_2_digits = id/1000000;
    //System.out.println(th);
    if (third_digit==1){
      System.out.print("Student Joined BRAC in Spring " + first_2_digits);
    }
    else if(third_digit==2){
      System.out.print("Student Joined BRAC in Fall " + first_2_digits);
    }
    else{
      System.out.print("Student Joined BRAC in Summer " + first_2_digits);
    }
  }
}

