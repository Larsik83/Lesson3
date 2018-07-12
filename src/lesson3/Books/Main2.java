package lesson3.Books;


public class Main2 {
    public static void main(String[] args) {
        Book book1= new Book(12,"Wqwq", 150);
        Book book2=new Book (15, "rwerw",200);

      //  book1.printInfo();
        BookUtils utils = new BookUtils();
        utils.booksReach(book1,book2);
        utils.bookCheap(book1,book2);

    }

}

//Сделать класс который описывает дробное число  (...3/4 и тд)
//(поля класса int числитель и int знаменатель)
//Создать конструкторы и методы считывания с этих полей и установки значений на эти поля
//Создать класс по работе с дробными числами. Написать 4 метода: сложение(вычитание деление умножение)
// дробей (входящие параметры -два объекта типа дробное)
// возвращаемый тип объект класса дробное число.


