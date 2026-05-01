import java.util.*;

class LibraryManagement {

    static ArrayList<String> books = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Remove Book");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter book name: ");
                String book = sc.nextLine();
                books.add(book);
                System.out.println("Book added!");
            }

            else if (choice == 2) {
                System.out.println("Books in library:");
                for (String b : books) {
                    System.out.println(b);
                }
            }

            else if (choice == 3) {
                System.out.print("Enter book to remove: ");
                String book = sc.nextLine();
                books.remove(book);
                System.out.println("Book removed!");
            }

            else if (choice == 4) {
                break;
            }
        }
    }
}
