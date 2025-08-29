package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class CheckInventory implements Inventory{
    int id;
    String item;
    int qty;

    public CheckInventory(int id, String item, int qty) {
        this.id = id;
        this.item = item;
        this.qty = qty;
    }

    @Override
    public String getInventory(){
        return "\nItem Id: "+this.id+"\nName: "+this.item+"\nQuantity: "+this.qty;
    }

    @Override
    public void setInventory(int id, String item, int qty){
        this.id = id;
        this.item = item;
        this.qty = qty;
    }

    public static void main(String[] args) {
        CheckInventory ChickenInventory = new CheckInventory(24,"British Chicken",5);
        System.out.println(ChickenInventory.getInventory());

        ChickenInventory.setInventory(24, "Alabama Chicken",5);
        System.out.println(ChickenInventory.getInventory());
    }
}
