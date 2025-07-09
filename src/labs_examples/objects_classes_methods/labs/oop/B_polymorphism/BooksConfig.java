package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public interface BooksConfig {
    public String BookTitle(String title);
    public void BookDetails();
    public int BookOrder(int price, int quantity);
    public default void ISBNDetails() {
        System.out.println("Not required at this stage of registration");
    }
}

