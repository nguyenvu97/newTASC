package collection_java.arry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {
    public static  void array(){
        int [] array1 = {1,2,3,4,5};
        array1.clone();
        System.out.println(Arrays.toString(array1));

        String[][] twoDArray = new String[][] {
                { "ONE", "TWO", "THREE", "FOUR" },
                { "FIVE", "SIX", "SEVEN" },
                { "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE" },
                { "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE" }
        };
        System.out.println(Arrays.deepToString(twoDArray));

        String[][][] threeDArray = new String[][][] {
                {
                        { "THREE", "TWO", "ONE" },
                        { "FOUR", "FIVE", "SIX", "SEVEN" }
                }, {
                { "EIGHT", "NINE", "TEN", "ELEVEN" },
                { "TWELVE", "THIRTEEN", "FOURTEEN" }
        }, {
                { "FIFTEEN", "SIXTEEN" },
                { "SEVENTEEN", "EIGHTEEN", "NINETEEN" },
                { "TWENTY", "TWENTY ONE" }
        }
        };
        System.out.println(Arrays.deepToString(threeDArray));

        int[] i = { 24, 13, 45, 37, 84, 13, 28 };

        // Sorting the int array
        Arrays.sort(i);
        System.out.println(Arrays.toString(i));

        // binarySearch
        int [] array2 = {1,2,3,4,5};
        System.out.println(
                Arrays.binarySearch(array2,5));

        // copy

        var data = Arrays.copyOf(array2,5);
        System.out.println(Arrays.toString(data));

        //aslist
        List<Integer> integer = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        integer.add(10);
        System.out.println(integer);
    }
}
