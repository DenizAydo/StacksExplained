public class StackAsArrayExamples {
    public static void main(String[] args) {
        StackAsArray stack = new StackAsArray();

        stack.push(4); // Inserts the item '4'
        stack.push(3); // Inserts the item '3'
        stack.push(12); // Inserts the item '12'
        // output at this point (as array): [12, 3, 4]

        stack.pop(); //deletes the top item '12'
        // output by now (as array): [3, 4]

        stack.push(8); // inserts the item '8'
        stack.push(10); // Inserts the item '10'
        stack.push(9); // Inserts the item '9'
        // output by now (as array): [9, 10, 8, 3, 4]

        stack.peek(); // Will print '9'
        stack.getSize(); // Will print '5'
        stack.display(); // Displays the stack
        // the output will be (as array): [9, 10, 8, 3, 4], 9 -> top, 5 -> current values
    }
}
