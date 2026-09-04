package DAY2.SESSION3;

class Father {
    public Father() {
    }

    void skill() {
        System.out.println("Riding a bike");
    }
}

class Child extends Father {
    String name;

    @Override
    void skill() {
        System.out.println("Playing games");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class GrandChild extends Child {
    @Override
    void skill() {
        System.out.println("Playing football");
    }
}

public class Multilevel {

    public static void main(String[] args) {

        Father f = new Father();
        f.skill();

        Child c = new Child();
        c.skill();

        GrandChild g = new GrandChild();
        g.skill();
    }
}