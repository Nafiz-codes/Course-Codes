public class leftToRight{
  public static void main(String [] args){
    int num = 87461;
    int copy = num;
    int digitCount = 0;
    while (copy != 0){
      copy /= 10;
      digitCount++;
    }
    int divisor = (int)Math.pow(10, digitCount-1);
    while (num!= 0){
      int digit  = num / divisor;
      System.out.println(digit);
      num %= divisor;
      divisor /= 10;
    }
  }
}
