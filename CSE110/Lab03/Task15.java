public class Task15{
  public static void main(String[]args){
    int num =6;
    int per = 0;
    for(int i=1; i<num; i++){
      if(num%i==0){
        per+=i;
    }
    }
    //System.out.println(per);
      if(num==per){
        System.out.println(num+" is a perfect number");
      }
      else{
        System.out.println(num+" is not a perfect number.");
  }

  }
}
