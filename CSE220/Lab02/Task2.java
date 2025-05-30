public class Task2 {

    public static Node wordDecoder( Node head ){
        Node dHead = new Node(null, null);
        int c = get_size(head);
        int r = 13%c;
        int val = r;
        while(val<c){
          Node temp = getNode(head,val);
          if(temp!=null){
            Node newNode = new Node(temp.elem);
            newNode.next = dHead.next;
            dHead.next = newNode;
            val+=r;
          }
        }
        return dHead;
    }
    static int get_size(Node h1){
      if(h1==null){
        return -1;
      }
      int count = 0;
      while(h1!=null){
        count++;
        h1=h1.next;
      }
      return count;
    }
    static Node getNode(Node h2, int idx){
      int c_idx = 0;
      Node current_node = h2;
      while(current_node!=null){
        if(c_idx==idx){
          return current_node;
        }
        c_idx++;
        current_node=current_node.next;
      }
      return null;
    }
    public static void main(String[] args){
        System.out.println("==============Test Case 1=============");
        Node head = LinkedList.createList(new Character[]{'B', 'M', 'D', 'T', 'N', 'O', 'A', 'P', 'S', 'C'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> C -> A -> T");
        Node result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> C -> A -> T
        System.out.println();
        System.out.println("==============Test Case 2=============");
        head = LinkedList.createList(new Character[]{'Z', 'O', 'T', 'N', 'X'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> N");
        result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> N
        System.out.println();
    }
}