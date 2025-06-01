public class Fibonacci{
  public static void main(String[]args){
    int n1 = 0;
    int n2 = 1;
    for (int i = 0; i<7; i++){
      System.out.print(n1);
      int temp = n2;
      n2 = n1+n2;
      n1 = temp;
    }
  }
}
