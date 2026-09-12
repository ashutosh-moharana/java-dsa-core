package dsa.recursion;
import java.util.*;
//LeetCode 46 - Permutations
public class PermuteArray {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1,2,3};
        List<List<Integer>> list = s.permute(nums);
        System.out.println(list);
    }
}

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }

        permutations(new ArrayList<>(), list, 0, ls);
        return ls;
    }

    public void permutations(List<Integer> p, List<Integer> up,int idx, List<List<Integer>> ls){
        if(idx == up.size()){
            ls.add(new ArrayList<>(p)); //In this code, this is the change, because p contains the reference to the original array so we have to create a newArrayList and add it.
            return;
        }

        int elem = up.get(idx);
        for(int i=0; i<=p.size();i++){
            //this part changed. Add elem 3 to [3,1,2] and when recursive call end it should preserve it original state by removing the 3.. to become [1,2] and then next recursive call happens.

            p.add(i,elem);
            permutations(p,up,idx+1,ls);
            p.remove(i);
        }

    }
}

/*

nums =
[1,2,3]

Output
[[3,2,1],[2,3,1],[2,1,3],[3,1,2],[1,3,2],[1,2,3]]

*/
