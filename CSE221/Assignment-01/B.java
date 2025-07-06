import java.util.Scanner;
public class task1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<N;i++){
            String cal = sc.nextLine();
            String[] step = cal.split(" ");
            Double num1 = Double.parseDouble(step[1]);
            Double num2 = Double.parseDouble(step[3]);
            String ops = step[2];
            double res = 0;
            if(ops.equals("+")){
                res = num1+num2;
            }
            if(ops.equals("-")){
                res = num1-num2;
            }
            if(ops.equals("*")){
                res = num1*num2;
            }
            if(ops.equals("/")){
                res = num1/num2;
            }
            System.out.println(res);
        }
    }
}  
