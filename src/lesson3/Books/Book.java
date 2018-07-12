package lesson3.Books;

public class Book {
    private int id;
    private String name;
    private int cena;

    public Book() {

    }
    public Book (int id, String name, int cena) {
        this.id=id;
        this.name=name;
        this.cena=cena;

    }

    public Book (String name, int cena){
        this.name=name;
        this.cena=cena;

    }
    public Book (int id, int cena) {
        this.id=id;
        this.cena=cena;
    }
    public Book (int id, String name ) {

        this.id=id;
        this.name=name;

    }

    public void printInfo() {
        System.out.println(id +" "+ name + " "+ cena);
    }
    public int getCena () {
        return cena;
    }
}
