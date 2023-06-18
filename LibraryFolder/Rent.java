import java.util.Scanner;
public class Rent {

	public static void main(String[] args) {
		
		Book b1 = new Book("System Analysis and Design", "Gary B. Shelly", 2001, 2);
        Book b2 = new Book("Android Application", "Corinne Hoisington", 2002, 3);
        Book b3 = new Book("Programming Concepts and Logic Formulation", "Rosauro E. Manuel", 2003, 4);
 
        
        List Rental = new List();
        Rental.addBook(b1);
        Rental.addBook(b2);
        Rental.addBook(b3);
        
        Scanner sc = new Scanner(System.in);
        while (true) {
            Rental.printAvailableBooks();   // print the available books

            System.out.println("**************************************");
            System.out.print("CHOOSE A NUMBER TO RENT YOUR FAVORITE BOOK: "); // prompt the user to select a book
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("n")) {
                System.out.println("Program end.");
                break; // exit the loop and end the program
            } else {
                try {
                    int choice = Integer.parseInt(input);
                    if (choice > 0 && choice <= Rental.getNumBooks()) {
                        Book chosenBook = Rental.getBook(choice - 1);
                        System.out.println("You have rented \"" + chosenBook.getTitle() + "\" by " + chosenBook.getAuthor());
                        System.out.print("Do you want to rent another book? (y/n): ");
                        String answer = sc.nextLine();
                        if (answer.equalsIgnoreCase("n")) {
                            System.out.println("Program end.");
                            break; // exit the loop and end the program
                        }
                    } else {
                        System.out.println("Invalid choice.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number or \"n\" to exit.");
                }
            }
       }
	}
}


