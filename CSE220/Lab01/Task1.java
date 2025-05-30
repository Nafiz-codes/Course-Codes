class Task2{
    public static void mostWater( Integer[] height ){
      Integer max = 0;
      Integer h = 0;
      Integer w = 0;
      Integer area = 0;
      for(int i=0;i<height.length;i++){
        for(int j=i+1;j<height.length;j++){
          if(height[i]>height[j]){
            h=height[j];
          }
          else{
            h=height[i];
          }
          w=j-i;
          area = h*w;
          if(area>max){
            max = area;
          }
        }
      }
      System.out.println(max);
    }
    public static void main(String[] args){
        Integer[] array = {1,8,6,2,5,4,8,3,7};
        System.out.println("Given Array: ");
        Arr.print(array);
        System.out.println("\nExpected Output:");
        System.out.print("49");
        System.out.print("\nYour Output:\n");
        mostWater( array );

    }
 }
