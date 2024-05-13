package labExam;
import java.util.Stack;
public class Ex3<T> {
    private Stack<T> stack1;
    private Stack<T> stack2;

    public Ex3() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(T item) {
        stack1.push(item);
    }

    public T dequeue() {
        if (isEmpty())
            throw new IllegalStateException("Queue is empty");

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public T peek() {
        if (isEmpty())
            throw new IllegalStateException("Queue is empty");

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        collection1.QueueUsingStacks<Integer> queue = new collection1.QueueUsingStacks<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);


        System.out.println("Peek: " + queue.peek());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Peek after deq: " + queue.peek());
    }
}
