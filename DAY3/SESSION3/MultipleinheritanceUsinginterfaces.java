package DAY3.SESSION3;
interface Father{
    void skill1();
}
interface Mother{
    void skill2();
}
interface Child extends Father,Mother{
    void skill3();
}
class Details implements Child{
    @Override
    public void  skill1(){

    }
    @Override
    public void  skill2(){

    }
    @Override
    public void  skill3(){

    }

}
public class MultipleinheritanceUsinginterfaces {
    public static void main(String[] args){
        Child child = new Details();
        child.skill1();
        child.skill2();
        child.skill3();
    }
}