package lesson6;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main3 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(132);
        numbers.add(12);
        numbers.add(8);
        numbers.add(155);
        numbers.add(8);
        for (Integer n:numbers){
            System.out.println(n);
        }

    }
}
