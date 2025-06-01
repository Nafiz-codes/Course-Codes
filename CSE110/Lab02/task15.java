public class task15{
  public static void main(String[]args){
    int sum = 0;
    double num = 0;
    for(int i=1; i<=200; i+=1){
      sum+=i;
      num+=1;
    }
    double avg = sum/num;
    System.out.println("sum :"+sum);
    System.out.println("average :"+avg);
  }
}