class QueueImpl {
    int size = 10000;
    int q[] = new int[size];
    int curSize = 0;
    int start = -1, end = -1;
    void push(int x) {
        if (curSize == size) {
            System.out.println("Can't add, overflow");
            return;
        }
        if (curSize == 0) {
            start = 0;
            end = 0;
        } else {
            end = (end + 1) % size;
        }
        q[end] = x;
        curSize++;
    }
    int top() {
        if (curSize == 0) {
            System.out.println("No element in queue");
            return -1;
        }
        return q[start];
    }
    int pop() {
        if (curSize == 0) {
            System.out.println("Can't delete, underflow");
            return -1;
        }
        int el = q[start];
        if (curSize == 1) {
            start = end = -1;
        } else {
            start = (start + 1) % size;
        }
        curSize--;
        return el;
    }
    int size() {
        return curSize;
    }
}
public class Main {
    public static void main(String[] args) {
        QueueImpl queue = new QueueImpl();
        queue.push(3);
        System.out.println("Top: " + queue.top());  //3
        queue.push(4);
        System.out.println("Top: " + queue.top());  //still 3(front of queue)
        System.out.println("Popped: " + queue.pop());  //3
        System.out.println("Top: " + queue.top());     //4
        System.out.println("Popped: " + queue.pop());  //4
        System.out.println("Popped: " + queue.pop());  //underflow
        queue.push(1);
        System.out.println("Size: " + queue.size());   //1
        System.out.println("Top: " + queue.top());     //1
    }
}
