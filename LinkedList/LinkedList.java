
class Node{
    int data;
    Node next;

public Node (int data){
    this.data = data;
    this.next = null;
}
}

class LinkedList{
Node head;

public LinkedList (Node head){
    this.head = head;
}
}

Node head = new Node (4);
Node head.next = new Node (8);

//Add Node To Start 
void AddToStart (int data){
    Node n = new Node(12);
    n.next = head;
    head = n;
}

//Add Node To End
// Think of if there have no head
void AddToEnd (int data){
    Node n = new Node(data);
    (if head ==null){
        head =n;
    }
    else{
        Node curr = head;
        while(curr.next !=null){
            curr =curr.next;
        }
        curr.next =n;
    }
}

//Add To After 
//Suppose we have a interger element call inserAfter to make sure curr have a right data
void AddToAfter(int insert, int data){
    Node curr = head;
    while(curr!=null){
        if (curr.data = inserAfter){
        Node n = new Node(data);
        n.next = curr.next;
        curr.next = n;
        break;
    }
    curr = curr.next;
}
}

//Delete Node at End 
void DeleteToEnd (){
    Node curr = head;
    if(curr==null || curr.next ==null){
        head =null;
        return curr;
    }
    Node n = curr.next;
    while(curr.next !=null){
        if(n.next ==null){
            curr.next =null;
        }
        curr =n;
        n = n.next;
    }
    return curr;
}

//Delete Node at Start
void DeleteToStart (){
    if (head !=null){
        Node toDelete =head;
        head = head.next;
        return toDelete;
    }
    return null;
}

//Delete Node at After
void DeleteToAfter (int data){
    Node curr = head;
    Node toDelete = null;
    while (curr!=null){
        if(curr.data = data && curr.next !=null){
            toDelete = curr.next;
            curr.next = toDelete.next;
            break;
        }
    curr = curr.next;
    }
    return toDelete;
}


