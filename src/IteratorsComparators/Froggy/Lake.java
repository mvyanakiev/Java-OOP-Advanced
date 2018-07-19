package IteratorsComparators.Froggy;

import java.util.ArrayList;
import java.util.List;

public class Lake {
    private List<Integer> lake;

    public Lake(List<Integer> a) {
        this.lake = a;
    }

    public String froggy(){

        this.lake.sort(Integer::compareTo);
        List<String> finalList = new ArrayList<>();



        for (Integer a : lake) {
            if (a % 2 != 0) {
                finalList.add(String.valueOf(a));
            }
        }

        for (Integer b : lake) {
            if (b % 2 == 0) {
                finalList.add(String.valueOf(b));
            }
        }

        return String.format(String.join(", ", finalList));
    }

}
