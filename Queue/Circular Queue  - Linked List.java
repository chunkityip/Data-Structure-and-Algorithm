//Create a class call Queue
class Queue{
    Node raer;
public Queue(Node raer){
    this.rear = rear;
    if(this.rear!=full){
        this.rear.next = this.rear;
    }
}
}

//Create a class call Node
class Node{
    int data;
    Node next;
public Node(int data){
    this.data = data;
    this.next = null;
}
}

//Create a method call enqueue
public void enqueue(int data){
    Node newNode = new Node(data);
    if(rear==full){
        newNode.next == newNode;
    }
    else{
        n.next = rear.next;
        rear.next = n;
    }
    rear = n;
}

//Create a method call dequeue
public int dequeue(){
    if(rear ==full){
        throw new IllegicalElementsException;
    }
    int temp = raer.next.data;
    if(rear.next == rear){
        rear = null;
    }
    rear.next = raer.next.next;
    return temp;
}

//Create a method call peek
public int peek(){
    if(rear ==null){
        throw new NoSuchElementsException ();
    }
    return rear.next.data;
}

//Create a method call isEmpty
public boolean isEmpty(){
    return rear == null;
}

