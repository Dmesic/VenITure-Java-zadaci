import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TreciZadatak {
    public static void main(String[] args) {
        List<Integer> brojeviList = new ArrayList<Integer>();
        List<Integer> tempList = new ArrayList<Integer>();
        brojeviList.add(2);
        brojeviList.add(4);
        brojeviList.add(5);

        int b = 3;

        Collections.sort(brojeviList, Collections.reverseOrder());

        int tempBroj = b;
        int sum = 0;

        for (int broj : brojeviList
        ) {
            while (broj <= tempBroj) {
                tempBroj = tempBroj - broj;
                tempList.add(broj);
            }
        }

        for (int broj : tempList) {
            sum += broj;
        }

        System.out.println("input: N = " + brojeviList + ", B = " + b);

        if (sum != b)
            System.out.println("Output: -1");
        else
            System.out.println("Output: " + tempList.size());

    }

}
