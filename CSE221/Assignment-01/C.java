import java.util.Scanner;
public class task2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=0;i<N;i++) {
            int M = sc.nextInt();
            long sum = (long) M*(M+1)/2;
            System.out.println(sum);
        }
    }
}
