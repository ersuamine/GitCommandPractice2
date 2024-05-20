package dilovar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorting1DArray {
    //sort an array without using a special method
    public static void main(String[] args) {
        Integer[] num={2,6,5,9,3,12,15,17};
        Integer[] result=new Integer[num.length];
        int min=100;
        List<Integer> number=new ArrayList<>(Arrays.asList(num));
        for (int i = 0; i < number.size(); i++) {
            if (min> number.get(i)) {
                min = number.get(i);
                number.remove(min);
            }
            result[i]=min;


        }
        System.out.println(min);
        System.out.println(Arrays.toString(result));
    }


}
