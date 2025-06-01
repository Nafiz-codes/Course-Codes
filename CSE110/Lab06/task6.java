import java.util.Scanner;
public class task6{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the element number: ");
    int N = sc.nextInt();
    double []arr = new double[N];
    for(int i =0;i<arr.length;i++){
      System.out.println("Enter a number: ");
      arr[i]= sc.nextDouble();
    }
    double max = -9999;
    int max_index = 0;
    double min = 9999;
    int min_index = 0;
    double sum = 0;
    int count=0;
    for(int i=0; i<arr.length;i++){
      if(arr[i]>max){
        max=arr[i];
        max_index=i;
      }
      if(arr[i]<min){
        min=arr[i];
        min_index=i;
      }
      sum+=arr[i];
      count++;
    }
    double avg= sum/count;
    System.out.println("Maximum element "+max+" found at index "+max_index);
    System.out.println("Minimum element "+min+" found at index "+min_index);
    System.out.println("Summation: "+sum);
    System.out.println("Average: "+avg);
  }
}