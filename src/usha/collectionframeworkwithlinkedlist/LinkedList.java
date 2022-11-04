package usha.collectionframeworkwithlinkedlist;

import java.util.LinkedList;

class LL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("usha");
        list.addFirst("preeti");
        System.out.println(list);
        list.addFirst("Avinash");
        System.out.println(list);
        System.out.println(list.size());
        for (int i =0; i<list.size(); i++){// iterate list
            if (list.get(i) == "usha")//search value in index
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");
        /*list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
         */
        list.remove(0);//when we delete index value in list use remove function
        System.out.println(list);
    }

}
