import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Library {
    private List<Book> books;
    private Map<String, User> users;

    public Library(){
        books = new ArrayList<>();
        users = new HashMap<>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void addUser(User user){
    users.put(user.getUserID(), user);
    }
    public Book findBookByISBN(String ISBN){
        for(Book book : books){
            if(book.getISBN().equals(ISBN)){
                return book;
            }
        }
        return null;
    }
    public User findUserById(String userID){
        return users.get(userID);
    }
    public boolean borrowBook(String ISBN, String userID){
        Book book = findBookByISBN(ISBN);
        User user = findUserById(userID);

        if(book != null && user != null && !book.isBorrowed()){
            book.borrowBook();
            System.out.println(user.getName() + "borrowed" + book.getTitle());
            return true;
        }
        return false;
    }
    public boolean returnBook(String ISBN, String userID){
       Book book = findBookByISBN(ISBN);
       User user = findUserById(userID);

       if(book != null && user != null && book.isBorrowed()){
           book.borrowBook();
           System.out.println(user.getName() + "returned" + book.getTitle());
           return true; 
       }
       return false;
    }
    public void listBooks(){
        for(Book book : books){
            System.out.println(book);
        }
    }
    public void listUsers(){
        for(User user : users.values()){
            System.out.println(user);
        }
    }
}
