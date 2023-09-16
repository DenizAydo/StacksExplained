public class StackAsArray {

    /**
     * Init a constant which represents the capacity of the stack
     */
    private static final int n = 5;

    /**
     * Init an array 'stack' and take previously declared 'n' as size
     */
    private int[] stack = new int[n];

    /**
     * Init the variable and set it to '-1'
     */
    private int top = -1;

    /**
     * init the variable to show current items in stack
     */
    private int currentItems = 0;

    /**
     * Inserts a value in the stack
     * @param pushItem the value to be inserted
     */
    public void push(int pushItem) {
        if(isFull()) System.out.println("The stack is full");
        else {
            top++;
            stack[top] = pushItem;
            currentItems++;
        }
    }

    /**
     * Deletes a value in the stack
     */
    public void pop() {
        if(isEmpty()) System.out.println("The stack is empty");
        else {
            top--;
            currentItems--;
        }
    }

    /**
     * Shows the top item of the stack
     */
    public void peek() {
        if(isEmpty()) System.out.println("The stack is empty");
        else {
            System.out.println(stack[top] + " -> top");
        }
    }

    /**
     * Shows the stack
     */
    public void display() {
        for(int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    /**
     * Checks if the stack is full
     * @return the full stack-condition
     */
    public boolean isFull() {
      return top == n-1;
    }

    /**
     * Checks if the stack is empty
     * @return the empty stack-condition
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Shows the amount of items in stack
     */
    public void getSize() {
        System.out.println(currentItems + " -> current Values");
    }
}
