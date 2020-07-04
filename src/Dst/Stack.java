package Dst;

public class Stack {

    private int maxSize;
    private int top;
    private int stack[];



    public Stack(int maxSize) {
       this.maxSize = maxSize;
       this.stack = new int[maxSize];
       this.top = -1;
    }

    public void push(int value) {
        top++;
        stack[top] = value;
    }

    public int pop(){
        int old_value = top;
        top--;
        return stack[old_value];
    }

    public int peek() {

        return stack[top];

    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }






}
