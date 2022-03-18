package Assignment13B;

public class LinkedList {
    Node head;
    Node tail;

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public void addTask(String t) {
        Node newNode = new Node(t);
        if (head == null) {
            head = newNode;
        } else if (tail == null) {
            tail = newNode;
            head.next = tail;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public String nextTask() {
        Node trash;
        if (head != null) {
            if (tail == null) {
                trash = head;
                head = null;
                return trash.getTask();
            } else if (head.next == tail) {
                trash = head;
                head = tail;
                tail = null;
                return trash.getTask();
            } else {
                trash = head;
                head = head.next;
                return trash.getTask();
            }
        } else {
            return "list is empty";
        }
    }
}
