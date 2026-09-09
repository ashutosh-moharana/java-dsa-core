package dsa.recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,7,4,5,6};
        System.out.println(isFound(arr,9));
    }
    public static int isFound(int[] arr,int target){
        return helper( arr, target,0);
    }

    public static int helper(int[] arr, int target,int idx){
        if(idx == arr.length) return -1;
        if(arr[idx] == target) return idx;

       return helper(arr,target,idx+1);
    }
}
