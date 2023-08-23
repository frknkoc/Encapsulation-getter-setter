
public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Suç ve Ceza", -704);

        b1.setPageNumber(233);
        b1.setName("Pinokyo");
        System.out.println(b1.getName() + " kitabı " + b1.getPageNumber() + " sayfadır.");
    }
}