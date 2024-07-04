package basic;

/*
Consider below mentioned scenario
Requirements for the Book class:
With variable as title, author, and typeOfBook
Default Constructor: Create a default constructor that initializes a book with default values for title, author, and typeOfBook.
Parameterized Constructor with Title and Author: Create a parameterized constructor that takes the title and author as parameters and initializes the book with the provided title and author. The typeOfBook is set to a default value.
Parameterized Constructor with Title, Author, and typeOfBook: Create another parameterized constructor that takes the title, author, and typeOfBook as parameters and initializes the book with the provided values.
The task is to implement the Book class based on the requirements above. Additionally, write a simple program to demonstrate the functionality of the different constructors by creating several instances of the Book class and printing their details.
For Default Value put title as "Java", author "Gemini Solutions" and type of Book as "Learning"

 */
class Book{
    private String title;
    private String author;;
    private String typeOfBook;

    public Book(){
        this.title = "Java";
        this.author = "Gemini Solutions";
        this.typeOfBook = "Learning";
    }

    public Book(String title, String author){
        this.title = title;
        this.author=author;
        this.typeOfBook= "Learning";
    }

    public Book(String title, String author, String typeOfBook){
        this.title = title;
        this.author=author;
        this.typeOfBook= typeOfBook;
    }

    public String toString(){

        return "{" +title + "," +author + "," +typeOfBook +"}";

    }

}
public class ConstructorOverloading {

    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book bookTitleAuthor = new Book("Python","Google");
        Book completeBook = new Book("C#","Microsoft","Akhil");


        System.out.println(defaultBook.toString());
        System.out.println(bookTitleAuthor.toString());
        System.out.println(completeBook.toString());
    }
}
