package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public abstract class MeatProduct implements Product {
    String name;
    int id;
    String category;

    public MeatProduct(String meatName, int meatId, String meatCat) {
        this.name = meatName;
        this.id = meatId;
        this.category = meatCat;
    }

    @Override
    public abstract String getProduct();

    public abstract void setProduct(String name, int id, String category);
}

