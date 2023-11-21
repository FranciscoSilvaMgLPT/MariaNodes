
public class List<T> {

    Node<T> head;


    public List() {
    }

    public void add(T value) {
        Node<T> newNode = new Node<>(value);

        if (this.head == null) {
            head = newNode;
        } else {
            Node<T> father = head;
            while (father.next != null) {
                father = father.next;
            }
            father.next = newNode;
        }
    }

    public T get(int index) {
        Node<T> nodeIndex = head;
        for (int i = 0; i < index; i++) {
            nodeIndex = nodeIndex.next;
        }
        return nodeIndex.value;
    }

    public void delete(int index) {
        Node<T> nodeIndex = head;
        if (index == 0) {
            head = head.next;
        }
        for (int i = 0; i < index; i++) {
            nodeIndex = nodeIndex.next;

            if(i==index-2){
                nodeIndex.next=nodeIndex.next.next;
            }
        }
    }

    public void add(T value, int index) {
        Node<T> newNode = new Node<>(value);
        Node<T> tempNode = head;

        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            for (int i = 0; i < index - 1; i++) {
                tempNode = tempNode.next;
            }
            newNode.next = tempNode.next;
            tempNode.next = newNode;
        }
    }

    public int size() {
        Node<T> nodeIndex = head;
        int count = 1;
        if (this.head == null) {
            return 0;
        }
        while (nodeIndex.next != null) {
            nodeIndex = nodeIndex.next;
            count++;
        }
        return count;
    }

    public void seeNodes() {
        for (int i = 0; i < this.size(); i++) {
            System.out.println(this.get(i));
        }
    }
}


