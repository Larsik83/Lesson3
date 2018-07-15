package lesson6;

import java.util.List;

public class Main8 {
    public static void main(String[] args) {
        ListUtilImpl obj1= new ListUtilImpl();
        List<String> ab=obj1.asList("Hello", null,"Summer","Night");
        System.out.println(ab);


    }
}
