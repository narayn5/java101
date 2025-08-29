package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class PointOfSale implements Sale{

    int id;
    String item;
    int qty;
    int price;

    public PointOfSale(int id, String item, int qty, int price) {
        this.id = id;
        this.item = item;
        this.qty = qty;
        this.price = price;
    }

    public String getSale() {
        return "\nItem: " + this.item +
                "\nQty: " + this.qty +
                "\nPrice: $" + this.price + ".00";
    }

    public void setSale(int id, String item, int qty, int price){
        this.id = id;
        this.item = item;
        this.qty = qty;
        this.price = price;
    }

    public static void main(String[] args) {
        PointOfSale newSale = new PointOfSale(23,"Snickers Bar", 2, 3);
        System.out.println(newSale.getSale());
    }
}
