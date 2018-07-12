package lesson3;

public class Main {
    public static void main(String[] args) {
        Student st1= new Student();
        Student st2= new Student();
        st1.setName("Nikita");
        st2.setName("Oleg");
        st1.printname();
        st2.printname();
        st1.setsurname("Ivanov");
        st2.setsurname("Petrov");
        st1.printsurname();
        st2.printsurname();
        int res=st1.perimetrTreugolnik(12,3,15);
        System.out.println(res);

        int kol=st2.kolBukvName();
        System.out.println(kol);
        int countGlasn =st1.glasBukv();
        System.out.println(countGlasn);


    }
}
