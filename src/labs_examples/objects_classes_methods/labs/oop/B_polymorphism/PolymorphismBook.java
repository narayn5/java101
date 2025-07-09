package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class PolymorphismBook implements BooksConfig {

    @Override
    public String BookTitle(String title) {
        return title;
    }

    @Override
    public void BookDetails() {
        System.out.println("Here is the book details:");
    }

    public String BookDetails(String bookDetails) {
        return bookDetails;
    }

    @Override
    public int BookOrder(int price, int quantity) {
        return price*quantity;
    }

    @Override
    public void ISBNDetails() {
        BooksConfig.super.ISBNDetails();
        System.out.println("ISBN: 34FG463546-34");
    }

    public static void main(String[] args) {
        PolymorphismBook newBook = new PolymorphismBook();

        System.out.println(newBook.BookTitle("Cessna - A table book on short range AirCraft"));
        newBook.BookDetails();
        System.out.println(newBook.BookDetails("A picturesque book on evolution and capabiilites of Cessna"));
        System.out.println("Total order amount is $"+newBook.BookOrder(50, 123));
        newBook.ISBNDetails();
    }
}
