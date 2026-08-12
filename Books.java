package module1;
import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("-----------------------------");
    }
}

public class Books {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details for Book 1:");
        System.out.print("Title: ");
        String title1 = sc.nextLine();
        System.out.print("Author: ");
        String author1 = sc.nextLine();
        System.out.print("Price: ");
        double price1 = sc.nextDouble();
        sc.nextLine(); 
        Book book1 = new Book(title1, author1, price1);
        System.out.println("\nEnter details for Book 2:");
        System.out.print("Title: ");
        String title2 = sc.nextLine();
        System.out.print("Author: ");
        String author2 = sc.nextLine();
        System.out.print("Price: ");
        double price2 = sc.nextDouble();
        Book book2 = new Book(title2, author2, price2);
        System.out.println("\nBook Details:");
        book1.displayInfo();
        book2.displayInfo();

        sc.close();
    }
}


