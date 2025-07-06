import java.util.Scanner;
import java.util.Arrays;
public class task5{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr = new int [N];
        String ans = "YES";
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int[] odd;
        int[] even;
        if (N % 2 == 0) {
            odd = new int[N / 2];
            even = new int[N / 2];
        } else {
            odd = new int[(N / 2) + 1];
            even = new int[N / 2];
        }
        int temp1 = 0;
        int temp2 = 0;
        for(int i=0;i<N;i++){
            if(i%2==0){
                odd[temp1] = arr[i];
                temp1++;
            }
            else{
                even[temp2]= arr[i];
                temp2++;
            }
        }
        Arrays.sort(odd);
        Arrays.sort(even);
        int e = 0;
        int o = 0;
        int [] fin = new int [N];
        for(int i=0;i<N;i++){
            if(i%2==0){
                fin[i]=odd[o];
                o++;
            }
            else{
                fin[i]=even[e];
                e++;
            }
        }
        for(int i=0;i<fin.length-1;i++){
            if(fin[i]<=fin[i+1]){
                continue;
            }
            else{
                ans ="NO";
                break;
            }
        }
        System.out.println(ans);
    }
}
