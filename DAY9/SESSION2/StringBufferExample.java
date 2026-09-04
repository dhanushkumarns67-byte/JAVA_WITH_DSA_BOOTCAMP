package DAY9.SESSION2;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("java");
        StringBuffer sbu = new StringBuffer("java");
        sb.append("program");
        sbu.append("program");
        System.out.println(sb);
        System.out.println(sbu);
    }
    
}