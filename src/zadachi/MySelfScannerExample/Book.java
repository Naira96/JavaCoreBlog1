package zadachi.MySelfScannerExample;

public class Book {
    private String title;
    private String authorName;
    private int count;
    private double price;

    public Book(String title, String authorName, int count, double price) {
        this.title = title;
        this.authorName = authorName;
        this.count = count;
        this.price = price;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String surname) {
        this.authorName = surname;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (count != book.count) return false;
        if (Double.compare(book.price, price) != 0) return false;
        if (title != null ? !title.equals(book.title) : book.title != null) return false;
        return authorName != null ? authorName.equals(book.authorName) : book.authorName == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = title != null ? title.hashCode() : 0;
        result = 31 * result + (authorName != null ? authorName.hashCode() : 0);
        result = 31 * result + count;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", count=" + count +
                ", price=" + price +
                '}';
    }
}
