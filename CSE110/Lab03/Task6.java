public class Task6{
  public static void main(String[]args){
    int sum = 0;
    int n = 20;
    for(int i=1; i<=n; i++){
      if(i%2==0){
        sum+= -i*i;
      }
      else{
       sum+= i*i; 
      }
    }
    System.out.println("y =" + sum);
  }
}