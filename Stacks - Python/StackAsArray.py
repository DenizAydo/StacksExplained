class StackAsArray:

    # Init the variables and the array
    def __init__(self):
        self.n = 5
        self.stack = [0] * self.n
        self.top = -1
        self.current_items = 0

    # Inserts a value in the stack
    def push(self, push_item):
        if self.is_full():
            print("The stack is full")
        else:
            self.top += 1
            self.stack[self.top] = push_item
            self.current_items += 1

    # Deletes a value in the stack
    def pop(self):
        if self.is_empty():
            print("The stack is empty")
        else:
            self.top = self.top - 1
            self.current_items -= 1

    # Shows the top item of the stack
    def peek(self):
        if self.is_empty():
            print("The stack is empty")
        else:
            print(f"{self.stack[self.top]} -> top")

    # Shows the stack
    def display(self):
        for i in range(self.top, -1, -1):
            print(self.stack[i])

    # Checks if the stack is full
    def is_full(self):
        return self.top == self.n - 1

    # Checks if the stack is empty
    def is_empty(self):
        return self.top == -1

    # Shows the amount of items in stack
    def get_size(self):
        print(f"{self.current_items} -> current Values")


# The main method
def main():
    stack = StackAsArray()

    stack.push(4)
    stack.push(3)
    stack.push(12)
    # Output at this point (as array): [12, 3, 4]

    stack.pop()
    # Output by now (as array): [3, 4]

    stack.push(8)
    stack.push(10)
    stack.push(9)
    # Output by now (as array): [9, 10, 8, 3, 4]

    stack.peek()
    stack.get_size()
    stack.display()
    # The Output will be (as array): [9, 10, 8, 3, 4], 9 -> top, 5 -> current Values


# Used for the main method
if __name__ == "__main__":
    main()
