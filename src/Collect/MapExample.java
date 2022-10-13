package Collect;


import java.util.HashMap;
import java.util.Map;

class Book {
    int id, quantity;
    String author, name;

    Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

}
public class MapExample {
    public static void main(String[] args) {
        HashMap<Integer, Book> map = new HashMap<Integer, Book>();
        Book b1 = new Book(101, "Let Us C", "Yashwant", 8);
        Book b2 = new Book(102, "Let Us C++", "Yashwant Kanetkar", 18);
        map.put(1, b1);
        map.put(2, b2);

        for (Map.Entry<Integer, Book> m: map.entrySet()) {
//            System.out.println(m.getKey() + " " + m.getValue());
            int key = m.getKey();
            Book b  = m.getValue();

            System.out.println(key + " Details: ");
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.quantity);
        }

    }

}
