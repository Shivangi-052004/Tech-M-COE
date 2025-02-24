package sample;

import java.sql.*;
import java.util.*;

public class JDBCExample {

    private static final String URL = "jdbc:mysql://localhost:3306/your_database";
    private static final String USER = "your_username";
    private static final String PASSWORD = "your_password";

    // Task 1: Recursively insert multiple rows into the table
    public static void insertRows(List<String> data) {
        String sql = "INSERT INTO your_table (column_name) VALUES (?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            for (String value : data) {
                pstmt.setString(1, value);
                pstmt.executeUpdate();
            }
            System.out.println("Rows inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Task 2: Update row dynamically using Scanner
    public static void updateRow(int id, String newValue) {
        String sql = "UPDATE your_table SET column_name = ? WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newValue);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            System.out.println("Row updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Task 3: Delete a row using Scanner
    public static void deleteRow(int id) {
        String sql = "DELETE FROM your_table WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Row deleted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Task 4: Select a row from the table
    public static void selectRow(int id) {
        String sql = "SELECT * FROM your_table WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Column: " + rs.getString("column_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Task 5: Menu-driven program
    public static void menuDrivenProgram() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert a new Row");
            System.out.println("2. Update a Row");
            System.out.println("3. Delete a Row");
            System.out.println("4. Select a Row");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    String value = scanner.nextLine();
                    insertRows(Collections.singletonList(value));
                    break;
                case 2:
                    System.out.print("Enter ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new value: ");
                    String newValue = scanner.nextLine();
                    updateRow(updateId, newValue);
                    break;
                case 3:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = scanner.nextInt();
                    deleteRow(deleteId);
                    break;
                case 4:
                    System.out.print("Enter ID to select: ");
                    int selectId = scanner.nextInt();
                    selectRow(selectId);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static void main(String[] args) {
        menuDrivenProgram();
    }
}
