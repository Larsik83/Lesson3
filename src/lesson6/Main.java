package lesson6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> texts = new LinkedList<>();
        texts.add("Hello");
        texts.add("World");
        texts.add("People");
        texts.add(0,"Winter");
        texts.set(0,"Summer");


        for(int i=0;i<texts.size();i++){
            System.out.println(texts.get(i));
        }   // 1 способ прохода по коллекции

        for (String t:texts ) {
            System.out.println(t); // 2 способ (к сетам)

        }
        for (Iterator<String> iter=texts.iterator();iter.hasNext();){
            System.out.println(iter.next()); // 3 способ (к сетам)

        }
    }
}
