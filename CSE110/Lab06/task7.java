public class task7{
  public static void main(String[]args){
    int []arr= {23,100,23,56,100};
    int count=0;
    System.out.println("Input array:");
    for(int i =0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
      if(arr[i]==0){
          count++;
    }
    }
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]){
          arr[j]=0;
        }
     }
    }
   System.out.println();
   System.out.println("New array:");
   for(int i=0;i<arr.length;i++){
      if(arr[i]==0){
        if(count==1){
         System.out.print(arr[i]+" ");
         count++;
        }
        continue;
      }
      else{
        System.out.print(arr[i]+" ");
      }
   }
  }
 }