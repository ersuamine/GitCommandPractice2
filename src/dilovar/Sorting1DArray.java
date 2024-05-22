package dilovar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorting1DArray {
    //sort an array without using a special method
    public static void main(String[] args) {
        Integer[] num={2,6,5,9,3,12,15,17};

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length-1; j++) {
                if (num[j]>num[j+1]){
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }

        }
        System.out.println(Arrays.toString(num));
        //you can solve also by finding minimum assigning it to new array then removing it
        //use treeset
        //use collection.sort

    }


}
