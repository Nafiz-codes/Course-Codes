class Task5{
    public static void playGame( Integer[][] arena ){
      Integer row = arena.length;
      Integer col =arena[0].length;
      int sum = 0;
      for(int r=0;r<row;r++){
        for(int c=0;c<col;c++){
          if(arena[r][c]%50==0){
            if(c>0){
              if(arena[r][c-1]==2){
                sum+=arena[r][c-1];
              }
            }
            if(r>0){
              if(arena[r-1][c]==2){
              sum+=arena[r-1][c];
              }
            }
            if(c<col-1){
              if(arena[r][c+1]==2){
                sum+=arena[r][c+1];
              }
            }
            if(r<row-1){
              if(arena[r+1][c]==2){
                sum+=arena[r+1][c];
              }
            }
          }
        }
      }
      if(sum<10){
        System.out.println("Points Gained: "+sum+". Your team is out.");
      }
      else{
          System.out.println("Points Gained: "+sum+". Your team has survived the game.");
      }
    }
        

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] arena = {
            {0,2,2,0},
            {50,1,2,0},
            {2,2,2,0},
            {1,100,2,0}
        };
        System.out.println("Given Arena: ");
        Arr.print2D(arena);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 6. Your team is out.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena );

        System.out.print("\n======================\n");

        Integer[][] arena1 = {
            {0,2,2,0,2},
            {1,50,2,1,100},
            {2,2,2,0,2},
            {0,200,2,0,0}
        };
        System.out.println("\nGiven Arena: ");
        Arr.print2D(arena1);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 14. Your team has survived the game.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena1 );
    }
}