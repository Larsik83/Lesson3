package lesson3;

public class Student {
    private String name;
    private String surname;
    private int kurs;

    public void setName(String newname) {
        name=newname;


    }
    public void printname (){
        System.out.println(name);
    }
    public void setsurname(String newsurname){
        surname=newsurname;

    }
    public void printsurname () {
        System.out.println(surname);
    }
    public int perimetrTreugolnik(int a,int b,int c) {
        int perimetr=a+b+c;
        return perimetr;

    }
    public int kolBukvName() {
        int kol=name.length();
        return kol;
    }
    public int glasBukv() {
        char [] bukvs=name.toCharArray();
        int count =0;
        for (int i=0;i<name.length();i++){
            if (bukvs[i]=='a' || bukvs[i]=='o' || bukvs[i]=='u' || bukvs[i]=='e' || bukvs[i]=='i') {
                count++;
            }
        }
        return count;
    }
}
// Создать все варианты конструкторов