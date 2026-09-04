package DAY3.SESSION3;
class MultipleInheritanceFather{
    void skill(){
        System.out.println("Riding Bike");
    }
}
interface MultipleInheritanceMother{
    void skill2();
}
class child extends MultipleInheritanceFather implements MultipleInheritanceMother{
    @Override
    public void skill2(){
        System.out.println("Dancing");
    }
}
public class MultipleInheritence {
    public static void main(String[] args){
        child c = new child();
        c.skill();
        c.skill2();
    }
}