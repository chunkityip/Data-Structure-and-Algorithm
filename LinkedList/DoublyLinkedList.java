//Create a class call DllNode
class DllNode{
    int data;
    DllNode prev;
    DllNode next;

public DllNode(int data){
    this.data = data;
    this.prev = null;
    this.next = null;
}
}

//Create a class call DoublyLinkedList
class DoublyLinkedList{
    DllNode head;

public DoublyLinkedList(DllNode){
    this.head = head;
}
}

//Create a method call AddToEnd
void AddToEnd(int data){
    DllNode newNode = new DllNode(data);
    if(head==null){
        head =newNode;
    }else{
        DllNode curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;
    }
}

//Create a method call AddToStart
void AddToStart(int data){
    DllNode newNode = new DllNode(data);
    if(head!=null){
       newNode.next = head;
       head.prev = newNode;
       head = newNode;
    }
    head = newNode;
}
//Create a method call AddToAfter
public Node AddToAfter(int data, int insertAfter){
    Node curr = head;
    if(curr==null || curr.next ==null){
        head = null;
        return curr;
    }
    Node newNode = new Node (data);
    while(curr.next!=null){
        if(curr.data == insertAfter){
            curr.next.prev = newNode;
            newNode.next = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;
        break;
    }
    return curr;
}

//Create a method call DeleteToEnd
public Node DeleteToEnd(){
    Node toDelete = head;
    if(toDelete==null || toDelete.next==null){
        head =null;
        return toDelete;
    }
    while(toDelete.next!=null){
        toDelete =toDelete.next;
    }
    toDelete.prev.next = null;
    return toDelete;
}

//Create a method call DeleteToStart
public void DeleteToStart(){
    Node toDelete = head;
    if(head==null || head.next ==null){
        head = null;
        return toDelete;
    }
    head = head.next;
    head.prev = null;
    return toDelete;
}

//Create a method call DeleteToAfter
public Node DeleteToAfter(int data){
    Node toDelete = head;
    while(toDelete!=null){
        if(toDelete.data ==data){
            toDelete = toDelete.next;
        }

        if(toDelete.next!=null){
            toDelete.next.prev = toDelete.prev;
            break;
        }
        toDelete.prev.next = toDelete.next;
    }
    return toDelete;
}
