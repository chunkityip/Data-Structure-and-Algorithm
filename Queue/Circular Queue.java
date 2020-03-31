import java.util.EmptyElementsException; 

//Create a class call Queue
class Queue{
    int front, rear;
    int [] nums;

    public Queue(int size){
        this.front = this.rear = -1;
        this.nums = new int [size];
    }
}

//Create a method call isFull
public boolean isFull(){
    return (rear+1)% nums.length == front;
}

//Create a method call isEmpty
public boolean isEmpty(){
    return front ==-1;
}

//Create a method call resize
public int resize(){
    int [] tempArr = new int [nums.length *2];
    int i=0;
    int j=front;

    do{
        tempArr[i++] = nums[j];
        j=(j+1) % nums.length;
    }while(j!=front);

    int front =0;
    j = nums.length -1;
    nums = tempArr;
}

//Create a method call peek
public int peek(){
    if(!isEmpty()){
        return nums[front];
    }
    throw new EmptyElementsException ();
}

//Create a method call enqueue
public void enqueue(int data){
    if(isFull)
        resize()
    else if(isEmpty)
        front++;
    rear = (rear+1)%nums.length;
    nums[rear] = data;

}

//Create a method call dequeue
public int dequeue(){
   int temp = nums[front]; 
    if(!isEmpty()){
        if(front==rear){
            front=rear=-1;
    }else{
        front = (front+1) %nums.length;
    }
    return temp;
}
    throw new NoSuchElementsException();
}