class Task2{
    public static Integer[] decryptMatrix( Integer[][] matrix ){
      Integer row = matrix.length;
      Integer col =matrix[0].length;
      Integer[]arr= new Integer[col-1];
      Integer count =0;
        for(int i=1;i<col;i++){
          Integer sum1 = 0;
          Integer sum2 =0;
          for(int j=0;j<row;j++){
            sum1+=matrix[j][i-1];
            sum2+=matrix[j][i];
          }
          arr[count]=sum2-sum1;
          count++;
        }
           
          
        return arr;

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            {1,3,1},
            {6,4,2},
            {5,1,7},
            {9,3,3},
            {8,5,4}
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        System.out.println("\nExpected Output:\n[ -13 1 ]");
        Integer[] returned_val_1 = decryptMatrix( matrix );
        System.out.print("\nYour Output:\n");
        Arr.print(returned_val_1);

    }
}