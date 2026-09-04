package DAY3.SESSION2;

class Name{

    interface window{
        void onClose();
        
}
}
class app implements Name.window{
    @Override
    public void onClose() {
        System.out.println("Window is closed");
    }
}
public class NestedInterFace {
    public static void main(String[] args) {
        Name.window obj = new app();
        obj.onClose();
    }
}
