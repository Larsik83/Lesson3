package lesson6;

import java.util.ArrayList;

public class Main9 {
    public static void main(String[] args) {
        ListUtilImpl sortObj = new ListUtilImpl();
        ArrayList<Double> colDoubl= new ArrayList<>();
        colDoubl.add(12.45);
        colDoubl.add(11.9);
        colDoubl.add(2.4);
        colDoubl.add(7.3);
        sortObj.sortedList(null);

        System.out.println(colDoubl);
    }
}
