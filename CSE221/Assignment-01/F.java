import java.util.Scanner;
public class task5{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr = new int [N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < N - 1; i++) {
                if (arr[i] % 2 == arr[i + 1] % 2 && arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
