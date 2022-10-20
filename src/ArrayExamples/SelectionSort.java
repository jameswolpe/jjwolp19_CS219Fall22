package ArrayExamples;

public class SelectionSort {
    /*
        Return index of the smallest item in the array

     */
    public static int smallest_loc(int [] aoi){

        int smallest = aoi[0];
        int smallest_idx = 0;

        for (int i = 1; i < aoi.length; i++){

            if(aoi[i]< smallest){
                smallest=aoi[i];
                smallest_idx = i;
            }
        }
        return smallest_idx;

    }

    public static void main(String[] args) {
        System.out.println(smallest_loc(new int[] {4,1,9,-1,6})==3);
    }
}

