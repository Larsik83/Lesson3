package lesson6;

import java.util.HashSet;

public class Main4 {
    public static void main(String[] args) {
        Moneta mon1=new Moneta(4,8,12.5);
        Moneta mon2=new Moneta(8,2,8.1);
        Moneta mon3=new Moneta(2,2,5);
        Moneta mon4=new Moneta(8,2,8.1);

        HashSet<Moneta> monets=new HashSet<>();
        monets.add(mon1);
        monets.add(mon2);
        monets.add(mon3);
        monets.add(mon4);

        for(Moneta moneta :monets){
            System.out.println(moneta);
        }

    }
}
