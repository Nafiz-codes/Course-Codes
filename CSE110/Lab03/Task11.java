public class Task11{
  public static void main(String[]args){
    int num = 7546;
    int count = 0;
    for(int i = 0; i<= num; i++){
        num/=10;
        count+=1;
    }
  System.out.print("Total digits: "+count);
  }
  
}
