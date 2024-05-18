import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class AccountLoanOperations {
    public void showAccountDetails(Scanner scanner, Connection connection) {
        System.out.print("Enter Customer Number: ");
        String Cust_No = scanner.nextLine();

        String query = "SELECT a.Account_No, a.Type, a.Balance, a.Branch_Code, " +
                "b.Branch_Name, b.Branch_City, c.Cust_No, c.Name, c.Phone_No, c.City " +
                "FROM Account a " +
                "JOIN Depositor d ON a.Account_No = d.Account_No " +
                "JOIN Customer c ON d.Cust_No = c.Cust_No " +
                "JOIN Branch b ON a.Branch_Code = b.Branch_Code " +
                "WHERE c.Cust_No = ?";
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.printf("%-11s | %-10s | %-4s | %-8s | %-10s | %-20s | %-10s",
                "Customer_No","Account_No","Type","Balance","Branch_Code","Branch_Name","Branch_City\n");
        System.out.println("-----------------------------------------------------------------------------------------------");


        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, Cust_No);
            try (ResultSet rs = pstmt.executeQuery()) {

                while (rs.next()) {
                    System.out.printf("%-11s | %-10s | %-4s | %-7s | %-11s | %-20s | %-10s\n",
                            rs.getString("Cust_No"),
                            rs.getString("Account_No"),
                            rs.getString("Type"),
                            rs.getDouble("Balance"),
                            rs.getString("Branch_Code"),
                            rs.getString("Branch_Name"),
                            rs.getString("Branch_City"));
                }
            }
            System.out.println("-----------------------------------------------------------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void showLoanDetails(Scanner scanner, Connection connection) {
        System.out.print("Enter Customer Number: ");
        String Cust_No = scanner.nextLine();

        String query = "SELECT l.Loan_No, l.Amount, l.Branch_Code, " +
                "b.Branch_Name, b.Branch_City, c.Cust_No, c.Name, c.Phone_No, c.City " +
                "FROM Loan l " +
                "JOIN Customer c ON l.Cust_No = c.Cust_No " +
                "JOIN Branch b ON l.Branch_Code = b.Branch_Code " +
                "WHERE c.Cust_No = ?";

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.printf("%-11s | %-7s | %-8s | %-10s | %-20s | %-10s",
                "Customer_No","Loan_No","Amount","Branch_Code","Branch_Name","Branch_City\n");
        System.out.println("-------------------------------------------------------------------------------------");

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, Cust_No);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    System.out.printf("%-11s | %-7s | %-8s | %-11s | %-20s | %-10s\n",
                            rs.getString("Cust_No"),
                            rs.getString("Loan_No"),
                            rs.getDouble("Amount"),
                            rs.getString("Branch_Code"),
                            rs.getString("Branch_Name"),
                            rs.getString("Branch_City"));
                }
            }
            System.out.println("-------------------------------------------------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void depositMoney(Scanner scanner, Connection connection) {
        System.out.print("Enter Account Number: ");
        String Account_No = scanner.nextLine();
        System.out.print("Enter Amount to Deposit: ");
        double Balance = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        String query = "UPDATE Account SET Balance = Balance + ? WHERE Account_No = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setDouble(1, Balance);
            pstmt.setString(2, Account_No);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Deposit successful.");
            } else {
                System.out.println("Account not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void withdrawMoney(Scanner scanner, Connection connection) {
        System.out.print("Enter Account Number: ");
        String Account_No = scanner.nextLine();
        System.out.print("Enter Amount to Withdraw: ");
        double Balance = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        // Check if sufficient balance is available
        String checkBalanceQuery = "SELECT Balance FROM Account WHERE Account_No = ?";
        try (PreparedStatement checkStmt = connection.prepareStatement(checkBalanceQuery)) {
            checkStmt.setString(1, Account_No);
            try (ResultSet rs = checkStmt.executeQuery()) {
                if (rs.next() && rs.getDouble("Balance") >= Balance) {
                    String query = "UPDATE Account SET Balance = Balance - ? WHERE Account_No = ?";
                    try (PreparedStatement pstmt = connection.prepareStatement(query)) {
                        pstmt.setDouble(1, Balance);
                        pstmt.setString(2, Account_No);
                        int rowsAffected = pstmt.executeUpdate();
                        if (rowsAffected > 0) {
                            System.out.println("Withdrawal successful.");
                        } else {
                            System.out.println("Account not found.");
                        }
                    }
                } else {
                    System.out.println("Insufficient balance.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
