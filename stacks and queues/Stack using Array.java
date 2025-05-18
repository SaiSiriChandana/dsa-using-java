class StackImpl{
    int size=10000;
    int arr[]=new int[size];
    int top=-1;
    push(int x){
        if(top>=size-1){
            System.out.println("Can't add, stack overflow");
        }
        top++;
        arr[top]=x;
    }
    int top(){
        if(top==-1){
            System.out.println("No element in stack");
            return -1;  //default
        }
        return arr[top];
    }

    int pop(){
        if(top==-1){
            System.out.println("Can't delete, stack underflow");
            return -1;
        }
        int x=arr[top];
        top--;
        return x;
    }
    int size(){
        return top+1;
    }
}
public class Main{
    public static void main(String[] args){
        StackImpl s = new StackImpl();
        s.push(3);
        System.out.println("Top: "+s.top());  //3
        s.push(4);
        System.out.println("Top: "+s.top());  //4
        System.out.println("Popped: "+s.pop());  //4
        System.out.println("Top: "+s.top());     //3
        System.out.println("Popped: "+s.pop());  //3
        System.out.println("Popped: "+s.pop());  // underflow
        s.push(1);
        System.out.println("Size: "+s.size());   //1
    }
}
