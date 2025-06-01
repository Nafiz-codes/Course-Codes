public class Task8{
  public static void main(String[]args){
   int n = 5;
   int sum = 0;
   for(int i=1;i<=5;i++){
      int odd = 2*i-1;
      System.out.println(odd);
      sum+=odd;
     }
   System.out.println("The Sum of odd Natural Numbers up to "+n+" terms is: "+sum);
  }
}