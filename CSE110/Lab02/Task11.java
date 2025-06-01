public class Task11{
  public static void main(String [] args){
    int pay = 60;
    int given = 500;
    
    if (pay>given){
      int need_to_pay = pay-given;
      System.out.println("Please pay "+need_to_pay+" taka more.");
    }
    else if(pay==given){
      System.out.println("The returned amount is 0 taka.");
    }
    else if(given>pay){
      //notes and coins available 
      int substraction = given-pay;
      int temp = substraction;
      int to_receive = 0;
      int hundred = 0;
      int fifty = 0;
      int twenty = 0;
      int ten = 0;
      int five = 0;
      int two = 0;
      int one = 0;
      
      hundred += (temp/100);
      to_receive +=hundred;
      temp %= 100;
      
      fifty += (temp/50);
      temp %= 50;
      
      twenty+= (temp/20);
      temp %= 20;
      
      ten+= (temp/10);
      temp %= 10;
      
      five+= (temp/5);
      temp -= (five*5);
      
      two+= (temp/2);
      temp -= (two*2);
      
      one = temp;
      
      System.out.println("The returned amount "+substraction+" taka.");
      System.out.println("100 taka note: "+hundred);
      System.out.println("50 taka note: "+fifty);
      System.out.println("20 taka note: "+twenty);
      System.out.println("10 taka note: "+ten);
      System.out.println("5 taka coin: "+five);
      System.out.println("2 taka coin: "+two);
      System.out.println("1 taka coin: "+one);
      
    }
  }
  }
