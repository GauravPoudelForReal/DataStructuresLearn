import java.util.Scanner;
import java.util.ArrayList;

public class Stack {
    private int top;
    private ArrayList<Integer> stack;
    private int size;

    public Stack(int size) {
        stack = new ArrayList<>();
        this.size = size;
    }

    private void push(int item) throws Exception{
        if(stack.size() == size){
            throw new Exception("Stack is full.");
        }
        stack.addLast(item);
    }

    private void pop() throws Exception{
        if(stack.isEmpty()) {
            throw new Exception("Stack is empty.");
        }
        System.out.printf("The popped item is: %d",stack.getLast());
        stack.removeLast();
    }

    public static void main(String[] args) throws Exception {

        System.out.println("Enter the size of the Stack: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Stack stack = new Stack(size);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.pop();

    }

}
