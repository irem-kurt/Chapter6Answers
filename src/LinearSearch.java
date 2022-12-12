import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {

    }

    public static int findIndexOrMinusOne(int key, Integer[] array) {
        if (array.length == 0)
            return -1;
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
        for (Integer number : list) {
            if (number == key ){
                return list.indexOf(number);
            }
        }
        return -1;
    }
}
