import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class BankingManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerOperations customerOps = new CustomerOperations();
        AccountLoanOperations accountLoanOps = new AccountLoanOperations();
        Connection connection = null;

        try {
            connection = DBConnection.getConnection();
            boolean running = true;

            while (running) {
                System.out.println("\n\n***** Banking Management System *****");
                System.out.println("1. Show Customer Records");
                System.out.println("2. Add Customer Record");
                System.out.println("3. Delete Customer Record");
                System.out.println("4. Update Customer Information");
                System.out.println("5. Show Account Details of a Customer");
                System.out.println("6. Show Loan Details of a Customer");
                System.out.println("7. Deposit Money to an Account");
                System.out.println("8. Withdraw Money from an Account");
                System.out.println("9. Exit");
                System.out.print("Enter your choice (1-9): ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        customerOps.showCustomerRecords(connection);
                        break;
                    case 2:
                        customerOps.addCustomerRecord(scanner, connection);
                        break;
                    case 3:
                        customerOps.deleteCustomerRecord(scanner, connection);
                        break;
                    case 4:
                        customerOps.updateCustomerRecord(scanner, connection);
                        break;
                    case 5:
                        accountLoanOps.showAccountDetails(scanner, connection);
                        break;
                    case 6:
                        accountLoanOps.showLoanDetails(scanner, connection);
                        break;
                    case 7:
                        accountLoanOps.depositMoney(scanner, connection);
                        break;
                    case 8:
                        accountLoanOps.withdrawMoney(scanner, connection);
                        break;
                    case 9:
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
