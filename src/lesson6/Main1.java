package lesson6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args) {
        CollectionUtilImpl utils= new CollectionUtilImpl();
        LinkedList<Integer> link1= new LinkedList<>();
        link1.add(0);
        link1.add(5);
        link1.add(8);
        ArrayList<Integer> link2 = new ArrayList<>();
        link2.add(5);
        link2.add(3);
        link2.add(7);
        Collection<Integer> result=utils.difference(link1,link2);
        for (Iterator<Integer> iter = result.iterator(); iter.hasNext();) {
            System.out.println(iter.next());
        }
    }
}
