//Create a class call Stack
class Stack{
    Node top;
    int size;
public Stack(){
    this.top = null;
    this.size = 0;
}
}

//Create a class call Node
class Node{
    int data;
    Node next;
public Node (int data){
    this.data = data;
    this.next = null;
}
}

//Create a method call isEmpty
public boolean isEmpty(){
    return top == null;
}

//Create a method call push
public void push(int data){
    Node newNode = new Node(data);
    newNode.next = top;
    top = newNode;
    size++;
}

//Create a method call pop
public int pop(){
    if(!isEmpty()){
        int temp = top.data;
        top = top.next;
        size--;
        return temp;
    }
    throw new EmptyStackException();
}

//Create a method call peek
public int peek(){
    if(top==null){
        throw new EmptyStackException();
    }
    return top.data;
}