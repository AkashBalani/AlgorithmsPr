class LinkedList{
    Node head = null;

    class Node{
        int val;
        Node next;
        Node(int x){
            val = x;
            next = null;
        }
    }

    Node new_node(int x){
        Node y = new Node(x);
        return y;
    }

    void sortedInsert(Node new_node){
        Node current;

        if(head == null || head.val >= new_node.val){
            new_node.next = head;
            head = new_node;
        }
        else{
            current = head;
            while(current.next != null && current.next.val < new_node.val)
                current = current.next;
            new_node.next = current.next;
            current.next = new_node;
        }
    }
}