import java.util.Scanner;
public class task10{
  public static void main(String[]args){
    int []marks={85,90,75,44,99};
    String []names={"Bob","Alice", "Max", "Marry", "Rosy"};
    for(int i=0;i<marks.length;i++){
      for(int j=1;j<marks.length-i;j++){
        if(marks[j-1]>marks[j]){
          int temp = marks[j];
          marks[j]=marks[j-1];
          marks[j-1]=temp;
          String temp2 = names[j];
          names[j]= names[j-1];
          names[j-1]=temp2;
        }
      }
    }
    System.out.println("Sorted Array: ");
    for(int i =0;i<marks.length;i++){
      System.out.print(marks[i]+" ");
    }
    System.out.println();
    for(int i =0;i<names.length;i++){
      System.out.print(names[i]+" ");
    }
  }
}