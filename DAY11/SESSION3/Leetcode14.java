package DAY11.SESSION3;

public class Leetcode14 {
    public String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        Leetcode14 lcp = new Leetcode14();
        String[] strs = {"flower", "flow", "flight"};
        String result = lcp.longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + result);
    }
}
