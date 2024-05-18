import java.sql.*;
import java.util.Scanner;

public class CustomerOperations {
    public void showCustomerRecords(Connection connection) {
        String query = "SELECT * FROM Customer";
        System.out.println("Customer Records: ");
        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("%-11s | %-20s | %-10s | %-10s\n","Customer_No","Name","Phone_No","City");
        System.out.println("-----------------------------------------------------------------------");
        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                System.out.printf("%-11s | %-20s | %-10s | %-10s\n",
                        rs.getString("Cust_No"),
                        rs.getString("Name"),
                        rs.getString("Phone_No") ,
                        rs.getString("City"));
            }
            System.out.println("-----------------------------------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addCustomerRecord(Scanner scanner, Connection connection) {
        System.out.print("Enter Customer Number: ");
        String Cust_No = scanner.nextLine();
        System.out.print("Enter Name: ");
        String Name = scanner.nextLine();
        System.out.print("Enter Phone Number: ");
        String Phone_No = scanner.nextLine();
        System.out.print("Enter City: ");
        String City = scanner.nextLine();

        String query = "INSERT INTO Customer (Cust_No, Name, Phone_No, City) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, Cust_No);
            pstmt.setString(2, Name);
            pstmt.setString(3, Phone_No);
            pstmt.setString(4, City);
            pstmt.executeUpdate();
            System.out.println("Customer added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteCustomerRecord(Scanner scanner, Connection connection) {
        System.out.print("Enter Customer Number to delete: ");
        String Cust_No = scanner.nextLine();

        String query = "DELETE FROM Customer WHERE Cust_No = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, Cust_No);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Customer deleted successfully.");
            } else {
                System.out.println("Customer not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateCustomerRecord(Scanner scanner, Connection connection) {
        System.out.print("Enter Customer Number to update: ");
        String Cust_No = scanner.nextLine();

        System.out.println("Enter 1: For Name 2: For Phone no 3: For City to update:");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String column = null;
        String newValue = null;

        switch (choice) {
            case 1:
                System.out.print("Enter new Name: ");
                newValue = scanner.nextLine();
                column = "Name";
                break;
            case 2:
                System.out.print("Enter new Phone Number: ");
                newValue = scanner.nextLine();
                column = "Phone_No";
                break;
            case 3:
                System.out.print("Enter new City: ");
                newValue = scanner.nextLine();
                column = "City";
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        String query = "UPDATE Customer SET " + column + " = ? WHERE Cust_No = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, newValue);
            pstmt.setString(2, Cust_No);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Customer information updated successfully.");
            } else {
                System.out.println("Customer not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
