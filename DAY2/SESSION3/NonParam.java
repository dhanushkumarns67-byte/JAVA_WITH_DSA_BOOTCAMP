package DAY2.SESSION3;

class Book{

    String title;
    double price;
    Book(){
        this.title = "Wings Of Fire";
        this.price = 200;
    }
}
public class NonParam {
    public static void main(String[] args) {
        Book b = new Book();
        System.out.println(" title : " + b.title + " price " );
        System.out.println(" price : " + b.price);
    }
    
}