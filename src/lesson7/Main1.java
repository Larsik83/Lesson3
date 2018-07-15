package lesson7;

import java.io.FileNotFoundException;

public class Main1 {
    public static void main(String[] args) {
        String text = null;

        Person first = new Person();
        try {
            first.setAge(160);
            System.out.println("ertyui");
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }


        System.out.println("we");
    }
}
