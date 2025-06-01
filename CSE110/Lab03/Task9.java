public class Task9{
  public static void main(String[]args){
    int num =1; 
    int sum =1;
    for(int i=1; i<=10;i++){
      System.out.println("Current Number; "+num+",Sum: "+sum);
      num+=1;
      sum+=num;
    }
  }
} 