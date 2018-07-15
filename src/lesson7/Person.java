package lesson7;


import java.io.FileNotFoundException;

public class Person {
    private int age;
    private String name;

    public void setAge(int a) throws Exception {
        if (a < 0) {
            throw new Exception("Возраст не может быть меньше 0");

        }
        if (a>150) {
            throw new AgeException("Возраст не может больше 150");
        }
        this.age = a;
    }

    public void setName(String name) {
        this.name = name;
    }
}
