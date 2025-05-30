class Task4{
    public static Integer[][] compressMatrix( Integer[][] matrix ){
      Integer row = matrix.length;
      Integer col =matrix[0].length;
      Integer [][] arr= new Integer[row/2][col/2];
      int row_arr=0;
      int col_arr=0;
      int val = 0;
      for(int r=0;r<row;r=r+2){
        Integer [] temp=new Integer[col/2];
        Integer count = 0;
        for(int c=0;c<col;c=c+2){
          int sum = matrix[r][c]+matrix[r][c+1]+matrix[r+1][c]+matrix[r+1][c+1];
          temp[count]=sum;
          count++;
        }
        arr[val]=temp;
        val++;
      }
        return arr;
    }
    public static void main(String[] args){
        Integer[][] matrix = {
            { 1 , 2 , 3 , 4 },
            { 5 , 6 , 7 , 8 },
            { 1 , 3 , 5 , 2 },
            {-2 , 0 , 6 ,-3 }
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        
        System.out.println("\nExpected Output:");
        System.out.print("| 14 | 22 |\n| 2  | 10 |\n");
        
        System.out.print("\nYour Output:\n");
        Integer[][] returnedArray = compressMatrix( matrix );
        Arr.print2D( returnedArray );
    }
}