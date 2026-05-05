package lectures_java;

import java.util.Arrays;
class Ptr {
    public int getSecondLargest(int[] arr) {
        // code here
        Arrays.sort(arr);
        int max= arr[arr.length - 2 ];
        int min = arr[0];
        if(max!=arr.length - 1){
            return max;
        }
        else{
            return -1;
        }
    }
    public static void main(String args[]){
        int myArray[] = {12,35,1,10,34,1};
        
        Ptr myObj = new Ptr();
        myObj.getSecondLargest(myArray);
    }
}
