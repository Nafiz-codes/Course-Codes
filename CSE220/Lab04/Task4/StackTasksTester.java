public class StackTasksTester {
    public static int diamondCount(Stack stack, String str) {
      int count = 0;  
      for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c=='<'){
                stack.push(c);
            }
            else if(c=='>'){
                if(stack.isEmpty()){
                    continue;
                }
                int top=stack.pop();
                char last =(char)top;
                if(last=='<'&&c!='>'){
                    return -1;
                }
                else{
                  count++;
                }
            }
        }
    if(stack.isEmpty()){
        return count;
    }
    else{
        return count;
       }
    }
    public static void removeBlock(Stack stack, int n) {
        Stack ste = new Stack();
        int count = 1;
        while(!stack.isEmpty()){
          int elem = stack.pop();
          if(count!=n){
            ste.push(elem);
          }
          count++;
        }
        while(!ste.isEmpty()){
          int val=ste.pop();
          stack.push(val);
        }
    }
    public static Stack conditionalReverse(Stack stack) {
      if(stack.isEmpty()){
        return null;
      }
      Stack val = new Stack();
      val.push(stack.pop());
      while(!stack.isEmpty()){
        int elem = stack.pop();
        if(val.peek()!=elem){
          val.push(elem);
        }
      }
        return val;
    }
    public static void printStack(Stack stack) {
        if (stack==null || stack.isEmpty()) {
            System.out.println("null");
            return;
        }
        int elem = stack.pop();
        System.out.println("| " + elem + " |");
        printStack(stack);
        stack.push(elem);
    }
    public static void assertTest(int actual, int expected) {
        if (actual == expected) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed! Expected: " + expected + ", but got: " + actual);
        }
    }


    //DO NOT CHANGE ANYTHING IN THE DRIVER CODE
    public static void main(String[] args) {
        // This part is for checking how the Stack class and printing working
        Stack s = new Stack();
        s.push(4);
        s.push(3);
        s.push(5);
        s.push(1);
        s.push(9);

        printStack(s);
        System.out.println("------");
        s.pop();
        printStack(s);
        System.out.println("------");
        // Checking End Here

        System.out.println("======Task 4 Test Starts Here=======");

        System.out.println("Test 01");
        Stack stack1 = new Stack();
        String string1 = "<..><.<..>> ";
        int result1 = diamondCount(stack1, string1);
        System.out.println("Number of Diamonds: " + result1); // This should print 3
        assertTest(result1, 3);
        System.out.println("-----------------------------------------");

        System.out.println("Test 02");
        Stack stack2 = new Stack();
        String string2 = "<<<..<......<<<<....>";
        int result2 = diamondCount(stack2, string2);
        System.out.println("Number of Diamonds: " + result2); // This should print 1
        assertTest(result2, 1);
        System.out.println("-----------------------------------------");

        System.out.println("Test 03");
        Stack stack3 = new Stack();
        String string3 = ">>><...<<..>>...>...>>>";
        int result3 = diamondCount(stack3, string3);
        System.out.println("Number of Diamonds: " + result3); // This should print 3
        assertTest(result3, 3);
        System.out.println("-----------------------------------------");

        System.out.println("======Task 4 Test Ends Here=======\n");

        System.out.println("======Task 5 Test Starts Here=======");

        System.out.println("Test 01");
        Stack st1 = new Stack();
        st1.push(4);
        st1.push(19);
        st1.push(23);
        st1.push(17);
        st1.push(5);

        System.out.println("Stack:");
        printStack(st1);
        System.out.println("------");

        removeBlock(st1, 2);
        System.out.println("After Removal");
        printStack(st1);
        System.out.println("------");

        System.out.println("======================================");
        System.out.println();

        System.out.println("Test 02");
        Stack st2 = new Stack();
        st2.push(73);
        st2.push(85);
        st2.push(15);
        st2.push(41);

        System.out.println("Stack:");
        printStack(st2);
        System.out.println("------");

        removeBlock(st2, 3);
        System.out.println("After Removal");
        printStack(st2);
        System.out.println("------");

        System.out.println("======Task 5 Test Ends Here=======\n");

        System.out.println("======Task 6 Test Starts Here=======");
        System.out.println("Test 01");
        Stack st = new Stack();
        st.push(10);
        st.push(10);
        st.push(20);
        st.push(20);
        st.push(30);
        st.push(10);
        st.push(50);

        System.out.println("Stack:");
        printStack(st);
        System.out.println("------");

        Stack reversedStack = conditionalReverse(st);

        System.out.println("Conditional Reversed Stack:");
        printStack(reversedStack); // Expected: 50, 10, 30, 20, 10
        System.out.println("------");

        System.out.println("======Task 6 Test Ends Here=======");
    }
}