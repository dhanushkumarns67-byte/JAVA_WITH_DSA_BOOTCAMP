package DAY7.SESSION2;

public class Decodeways {
    public static int decode(String s){
        int n = s.length();
        if(s.isEmpty()||s.charAt(0)=='0'){
            return 0;
        }
        int[] dp=new int[s.length()+1];
        //initialization
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            //single
            int singleDigit=s.charAt(i-1)-'0';
            if(singleDigit>=1 && singleDigit<=9){
                dp[i]=dp[i]+dp[i-1];
            }
            //two digit
            int doubleDigit=Integer.parseInt(s.substring(i-2,i));
            if(doubleDigit>=10 && doubleDigit<=26){
                dp[i]=dp[i]+dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println(decode("226"));

    }
}