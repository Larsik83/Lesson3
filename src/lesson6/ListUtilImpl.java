package lesson6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListUtilImpl implements ListUtils {

    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        for (String currentString:strings){
            if (currentString==null){
                throw new IllegalArgumentException("String = null");
            }


        }
        ArrayList<String> arrstr = new ArrayList<>();
        for (String currentStr : strings) {
            arrstr.add(currentStr);
        }

        return arrstr;
    }

    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {
        if (data == null) {
            throw new IllegalArgumentException("Data null");

        }
        Collections.sort(data, new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return -o1.compareTo(o2);
            }
        });

        return data;

    }
}
