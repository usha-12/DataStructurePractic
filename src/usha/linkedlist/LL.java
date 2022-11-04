package usha.linkedlist;
 class LL {
     Node head;
     private int size;

      LL() {
         this.size = 0;
     }

     class Node{
        String data;
        Node next;

         Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    // add- first, last
    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

     public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;

     }
     public void deleteFirst(){
        if (head == null){
            System.out.println("This list is empty");
            return;
        }
        size--;
        head = head.next;
     }
     public void deleteLast(){
         if (head == null){
             System.out.println("This list is empty");
             return;
         }
         size--;
         if (head.next == null){
             head = null;
             return;
         }
         Node secondLast = head;
         Node lastNode = head.next;// head.next = null -> lastNode = null
         while (lastNode.next != null){ // null.next
             lastNode = lastNode.next;
             secondLast = secondLast.next;
         }
         secondLast.next = null;
     }
     public void printList() {
         Node currNode = head;

         while (currNode != null) {
             System.out.print(currNode.data + " -> ");
             currNode = currNode.next;
         }

         System.out.println("null");
     }

     public int getSize() {
         return size;
     }

     public static void main(String[] args) {
         LL list = new LL();
         list.addFirst("usha");
         list.addFirst("aditya");
         list.printList();
         list.addLast("preeti");
         list.printList();
         list.addFirst("usha");
         list.printList();
         list.deleteFirst();
         list.printList();
         list.deleteLast();
         list.printList();
         list.getSize();
         System.out.println(list.getSize());



     }

}
