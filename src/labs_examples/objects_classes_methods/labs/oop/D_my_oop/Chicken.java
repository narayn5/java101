package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

class Chicken extends MeatProduct {
    public Chicken(String name, int id, String category) {
        super(name, id, category);
    }

    @Override
    public String getProduct() {
        return "Name: "+this.name+ " Id: " + this.id + " Category: "+ this.category;
    }

    @Override
    public void setProduct(String name, int id, String category) {
        this.name = name;
        this.id = id;
        this.category = category;
    }
}