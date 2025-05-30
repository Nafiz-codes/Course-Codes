public class Task5 {
    public static int sumDist(Node head, Integer[] distArr) {
        Node current_node = head;
        Integer sum = 0;
        for(int i=0;i<distArr.length;i++){
          for(int j=0;j<=distArr[i];j++){
             if(j==distArr[i]){
              sum += (int)current_node.elem;
            }
             if(current_node.next==null){
               break;
             }
              current_node=current_node.next;
            }
          current_node = head;
          }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("=========Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[]{10, 16, -5, 9, 3, 4});
        Integer[] dist = new Integer[] {2, 0, 5, 2, 8};
        System.out.print("Given LinkedList: ");
        LinkedList.printLL(head1);
        System.out.print("Distance Array: ");
        Arr.print(dist);
        System.out.println("\nExpected Output: 4");
        int returnedValue = Task5.sumDist(head1, dist);
        System.out.println("Your Output: "+returnedValue); // This should print: Sum of Nodes: 4
    }
}