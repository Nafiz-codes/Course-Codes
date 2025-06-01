public class Task12{
  public static void main(String[]args){
    int given = 32768;
    while(given!=0){
      int num=given%10;
      given/=10;
      System.out.print(num);
    
    if(given!=0){
      System.out.print(",");
    }
   }
 }
}