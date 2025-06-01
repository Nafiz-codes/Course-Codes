public class Task13{
  public static void main(String[]args){
    int given = 32768;
    int counter = 0;
    int temp=given;
    while(temp!=0){
      int num=temp%10;
      temp/=10;
      counter+=1;
    }
    int div = 1;
    for(int i =1; i<=counter-1; i++){
      div*=10; 
    }
    //System.out.print(div);
    //System.out.println(given);
    while(given!=0){
      int val=given/div;
      System.out.print(val);
      given%=div;
      div/=10;
      if(given!=0){
        System.out.print(",");
      }
    }
  }
} 
      