public class reverse{
  public static void main(String[]args){
    int rev = 0;
    int n = 1234;
    while(n!=0){
      rev = rev*10+n%10;
      n=n/10;
    }
    System.out.print(rev);
  }
}