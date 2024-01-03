import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class BugTrackingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BugRepository bugRepository = new BugRepository();

        while (true) {
            System.out.println("\nBug Tracking System Menu:");
            System.out.println("1. Add Bug");
            System.out.println("2. Update Bug Status");
            System.out.println("3. View All Bugs");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Bug ID: ");
                    int bugId = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    System.out.print("Enter Bug Description: ");
                    String description = scanner.nextLine();

                    System.out.print("Enter Bug Status: ");
                    String status = scanner.nextLine();

                    System.out.print("Enter Bug Priority: ");
                    String priority = scanner.nextLine();

                    Bug newBug = new Bug(bugId, description, status, priority);
                    bugRepository.addBug(newBug);
                    System.out.println("Bug added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Bug ID to update status: ");
                    int bugIdToUpdate = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    System.out.print("Enter new Bug Status: ");
                    String newStatus = scanner.nextLine();

                    bugRepository.updateBugStatus(bugIdToUpdate, newStatus);
                    break;

                case 3:
                    List<Bug> allBugs = bugRepository.getAllBugs();
                    System.out.println("\nAll Bugs:");
                    for (Bug bug : allBugs) {
                        System.out.println(bug);
                    }
                    break;

                case 4:
                    System.out.println("Exiting Bug Tracking System. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
