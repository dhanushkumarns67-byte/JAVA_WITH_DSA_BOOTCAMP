package DAY3.SESSION2;
class StaticBank{
    //static variable
    static int count=0;
    static String appName;
    //static block
    static{
        appName="Bank app";
    }
    static void printcount(){
        System.out.println("Static Method");
        System.out.println(count);
    }
}
public class StaticVariables {
    public static void main(String[] args) {
        StaticBank.printcount();
        System.out.println(StaticBank.appName);
    }
    public static int main(){
        return 1;
    }
}