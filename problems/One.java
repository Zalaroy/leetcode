import javax.swing.table.TableRowSorter;

import jdk.jshell.execution.FailOverExecutionControlProvider;

public class One {

    
    public static void main(String[] args){
        int[] test = new int[]{4,6,8,2,3,56,12,33,9,23};
        twoSum(test, 14);
    }

    public static int[] twoSum(int[] nums, int target) {
        int x = 0;
        int y = nums.length - 1;
        int[] finalArr = new int[2];
        while((x < y) && (y > x)){
            if(nums[x] + nums[  y] == target){
                finalArr[0] = x;
                finalArr[1] = y;
                return finalArr;
            }
            x ++;
            y --;
        }
        return finalArr;
    }
}
