public class Task2{
  public static void main(String[]args){
    for(int i=18; i<=63; i+=9){
      if(i%2==0){
        System.out.print(i+",");
      }
      else if(i==63){
        System.out.print(-i);        
      }
      else{
        System.out.print(-i+",");
      }
    }
  }
}