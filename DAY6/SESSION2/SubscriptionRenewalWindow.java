package DAY6.SESSION2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubscriptionRenewalWindow {
    public static int longestWindow(List<Integer> days,int K){
        int left = 0;
        int maxlength = 0;
        for(int right = 0;right<days.size();right++){
            if(left <= right && days.get(right) - days.get(left) > K){
                left++;
            }
            maxlength = Math.max(maxlength, right - left + 1);
        }
        return maxlength;
    }

    public static void main(String[] args){
        // int[] days= {1,3,5,7,9};
        ArrayList<Integer> days = new ArrayList<>(Arrays.asList(1,3,5,7,9));
        @SuppressWarnings("unused")
        int K = 4;
        days.add(1);

    }
    
}
