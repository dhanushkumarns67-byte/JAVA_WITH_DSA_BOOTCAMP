package DAY2.SESSION3;

class SingleLevelFather {
    public SingleLevelFather() {
    }


    void skill() {
        System.out.println("Riding a bike");
    }
}

class SingleLevelChild extends SingleLevelFather {

    @Override
    void skill() {
        System.out.println("Playing games");
    }
}

public class SingleLevel1 {

    public static void main(String[] args) {

        SingleLevelChild c = new SingleLevelChild();
        c.skill();

        SingleLevelFather f = new SingleLevelChild();
        f.skill();
    }
}