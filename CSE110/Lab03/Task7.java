public class Task7{
  public static void main(String[]args){
    int a = 6;
    int divisors = 0;
    System.out.println("Divisors of "+a+":");
    for(int i=1;i<=10;i++){
      if(a%i==0){
       divisors+=1;
       System.out.println(i);
      }
    }
    System.out.println("Total Divisors: "+divisors);
  }
}
