public class LinearSearch {
    public static void main (String [] args){

        int [] arr = {12, 22, 34, 56, 23, 67};
        int target = 23;
        System.out.println (answer(arr, target));
    }

    static int answer (int [] arr, int target){
        int n = arr.length;
        if (n == 0){
            return -1;
        }

        for (int elementValue : arr){
            if (elementValue == target){
                return elementValue;
            }
        }

        for (int index = 0; index < n; index++){
            int elementValue = arr[index];
            if (elementValue == target){
                return index;
            }
        }
        return -1;
    }
}