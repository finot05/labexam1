package labExam;

public class Ex2 {
    int[] numArray;
    int top;
    int size;

    public Ex2(int capacity) {
        numArray = new int[capacity];
        top = -1;
        size = 0;
    }
    public int size() {
        return size;
    }
    void push(int value) {
        if (!isFull()) {
            numArray[++top] = value;
            size++;
        }
        else {
            System.out.println("Full");
        }
    }
    public int pop() {
        if (!isEmpty()) {
            int data = numArray[top--];
            size--;
            return data;
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == numArray.length;
    }
    public int peek() {
        if(top >= 0) {
            return numArray[top];
        }
        return -1;
    }
    public static void main(String[] args) {
        collection1.Stack numStack = new collection1.Stack(5);
        numStack.push(1);
        numStack.push(2);
        numStack.push(3);
        numStack.push(4);
        numStack.pop();
        for (int i = 0; i < numStack.size; i++) {
            System.out.println(numStack.numArray[i]);
        }
    }
}
