
public class Stack <t>{
    private node<t> lastNode;
    private node<t> firstNode;


public void push(t value) {
    if (lastNode == null){
        lastNode = new node<t>(value);
        firstNode = lastNode;
    }else{
        node<t> current = new node<T>(value);
        current.setnext(firstNode);
        firstNode = current;
    }
}


public T pop() {
    if (firstNode != null) {
        T value = firstNode.getvalue();
        firstNode = firstNode.getNext();
        return value;
    }
    throw new RuntimeException("Stack underflow");
}


}
