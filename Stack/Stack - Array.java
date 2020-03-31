//Create a class call Stack
class Stack{
    int top;
    int [] nums;
    int size;
public Stack(int initialSize){
    this.top = -1;
    this.size = 0;
    this.nums = new int [initialSize];
}
}

//Create a method call resize
public void resize(){
    int [] newSize = nums.length *2;
    int [] newArray = new int [newSize];
    for(int i=0; i<nums.length; i++){
        newArray[i] = nums[i];
    }
    nums = newArray;
}

//Create a method call isEmpty
public boolean isEmpty(){
     return top <0;
}

//Create a method call isFull
public boolean isFull(){
    return size == nums.length;
}

//Create a method call peek
public int peek(){
    if(!isEmpty()){
        return nums[top];
    }
    throws new EmptyStackException();
}

//Create a method call push
public void push(){
    if(isFull()){
        resize();
    }
    nums[++top]== data;
    size++;
}

//Create a method call pop
public int pop(){
    if(!isEmpty()){
        int  removedata = peek();
        top--;
        size--;
        return removedata;
    }
    throw new EmptyStackException();
}