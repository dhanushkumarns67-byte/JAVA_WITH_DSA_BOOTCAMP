package DAY4.SESSION1;

import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] a) {
        List<Integer> ans = new ArrayList<>();
        int t = 0, b = a.length - 1;
        int l = 0, r = a[0].length - 1;

            while (t <= b && l <= r) {
            for (int i = l; i <= r; i++) ans.add(a[t][i]);
            t++;

            for (int i = t; i <= b; i++) ans.add(a[i][r]);
            r--;

            if (t <= b)
                for (int i = r; i >= l; i--) ans.add(a[b][i]);
            b--;

            if (l <= r)
                for (int i = b; i >= t; i--) ans.add(a[i][l]);
            l++;
        }
        return ans;
    }
}

