public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        
        //Add books
        library.addBook(new Book("1984", "George Orwell", "123456789"));
        library.addBook(new Book("abifvfg", "Richard", "123456789"));
        library.addBook(new Book("bcfgtjhitjgk", "David", "123456789"));
        
        

        //Add users
        library.addUser(new User("Alice", "U1"));
        library.addUser(new User("Bob", "U2"));

        //List all books
        System.out.println("All books in the library");
        library.listBooks();
        
        //List all users
        System.out.println("\nAll users in the library");
        library.listUsers();

        //Borrow a book
        System.out.println("\nBorrowing books:");
        library.borrowBook("123456789", "U1");
        library.borrowBook("987654321", "U2");

        //List all books
        System.out.println("\nAll books in the library after borrowing");
        library.listBooks();

        //Return a book
        System.out.println("\nReturning Books");
        library.returnBook("123456789", "U1");

        //List all books again to see the return status
        System.out.println("\nAll books in the library after returning");
    }
}
