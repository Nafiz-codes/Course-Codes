public class Task3 {
    public static Node idGenerator(Node head1, Node head2, Node head3) {
        
        Node newNode = reverse(head1);
        Node first = new Node(null);
        while(head2!=null){
          int val = (int)head2.elem + (int)head3.elem;
          if(val>=10){
            val%=10;
          }
          Node temp = new Node(val);
          Node last=get_tail(newNode);
          last.next=temp;
          head2=head2.next;
          head3=head3.next;
        }

        return newNode; 
    }
    static Node reverse(Node head){
      if(head==null){
        return null;
      }
      Node rev=new Node(head.elem);
      Node temp = head.next;
      while(temp!=null){
        Node newNode = new Node(temp.elem);
        newNode.next = rev;
        rev = newNode;
        temp=temp.next;
      }
      return rev;
    }
    static Node get_tail(Node head){
      if(head==null){
        return null;
      }
      Node c = head;
      while(c.next!=null){
        c=c.next;
      }
      return c;
    }
    public static void main(String[] args) {
        System.out.println("=========Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[]{0, 3, 2, 2});
        Node head2 = LinkedList.createList(new Integer[]{5, 2, 2, 1});
        Node head3 = LinkedList.createList(new Integer[]{4, 3, 2, 1});

        System.out.print("LinkedList#1:  ");
        LinkedList.printLL(head1); // This should print 0 -> 3 -> 2 -> 2

        System.out.print("LinkedList#2:  ");
        LinkedList.printLL(head2); // This should print 5 -> 2 -> 2 -> 1

        System.out.print("LinkedList#3:  ");
        LinkedList.printLL(head3); // This should print 4 -> 3 -> 2 -> 1

        Node result = Task3.idGenerator(head1, head2, head3);

        System.out.print("\nNew ID:  ");
        LinkedList.printLL(result); // This should print 2 -> 2 -> 3 -> 0 -> 9 -> 5 -> 4 -> 2

        System.out.println("\n=========Test Case 2=============");
        Node head4 = LinkedList.createList(new Integer[]{0, 3, 9, 1});
        Node head5 = LinkedList.createList(new Integer[]{3, 6, 5, 7});
        Node head6 = LinkedList.createList(new Integer[]{2, 4, 3, 8});

        System.out.print("LinkedList#4:  ");
        LinkedList.printLL(head4); // This should print 0 -> 3 -> 9 -> 1

        System.out.print("LinkedList#5:  ");
        LinkedList.printLL(head5); // This should print 3 -> 6 -> 5 -> 7

        System.out.print("LinkedList#6:  ");
        LinkedList.printLL(head6); // This should print 2 -> 4 -> 3 -> 8

        Node result2 = Task3.idGenerator(head4, head5, head6);

        System.out.print("\nNew ID:  ");
        LinkedList.printLL(result2); // This should print 1 -> 9 -> 3 -> 0 -> 5 -> 0 -> 8 -> 5
    }
}
