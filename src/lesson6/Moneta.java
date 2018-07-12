package lesson6;

import java.util.Objects;

public class Moneta {
    private  int kolvoStars;
    private  int godVipuska;
    private  double diametr;

    public Moneta() {

    }
    public Moneta(int kolvoStars,int godVipuska,double diametr){
        this.kolvoStars=kolvoStars;
        this.godVipuska=godVipuska;
        this.diametr=diametr;
    }

    @Override
    public String toString() {
        return "Монета звезд :"+ kolvoStars+" "+"год выпуска: "+godVipuska+"диаметр :"+diametr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moneta moneta = (Moneta) o;
        return kolvoStars == moneta.kolvoStars &&
                godVipuska == moneta.godVipuska &&
                Double.compare(moneta.diametr, diametr) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(kolvoStars, godVipuska, diametr);
    }
}
