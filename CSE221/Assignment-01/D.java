import java.util.Scanner;
public class task1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            int num = sc.nextInt();
            int[] test = new int[num];
            String res = "YES";
            for(int j=0;j<num;j++){
                test[j] = sc.nextInt();
            }
            if(num>1){
                for(int k=0;k<num-1;k++){
                    if(test[k]>test[k+1]){
                        res = "NO";
                        break;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
