public class duplicate{
  public static void main(String [] args){
    String s1 = "Helloolllohase"; //user input
    //Helohas
    String ans = "";
    for(int i = 0; i < s1.length(); i++){
      char ch = s1.charAt(i);
      boolean flag = false;
      for(int j = 0; j < ans.length(); j++){
        if(ch == ans.charAt(j)){
          flag = true;
        }
//        else{
//          flag = false;
//        }
      }
      if(flag == false){
        ans += ch;
      }
    }
    System.out.println(ans);
  }
} 
