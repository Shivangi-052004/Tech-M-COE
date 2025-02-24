import java.sql.*;
import java.util.*;

public class JDBCExample {

    private static final String URL = "jdbc:mysql://localhost:3306/database";
    private static final String USER = "root";
    private static final String PASSWORD = "Dayaa@123";

    // Task 1: Insert multiple rows into the student table with sample data
    public static void insertSampleData() {
        List<String> sampleData = Arrays.asList(
            "Alice,20", "Bob,22", "Charlie,21", "David,23", "Eve,19"
        );
        insertRows(sampleData);
    }

    public static void insertRows(List<String> data) {
        String sql = "INSERT INTO student (name, age) VALUES (?, ?)";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "Dayaa@123");
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            for (String value : data) {
                String[] parts = value.split(",");
                pstmt.setString(1, parts[0]);
                pstmt.setInt(2, Integer.parseInt(parts[1]));
                pstmt.executeUpdate();
            }
            System.out.println("Rows inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Task 2: Update row dynamically using Scanner
    public static void updateRow(int id, String newName, int newAge) {
        String sql = "UPDATE student SET name = ?, age = ? WHERE id = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "Dayaa@123");
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newName);
            pstmt.setInt(2, newAge);
            pstmt.setInt(3, id);
            pstmt.executeUpdate();
            System.out.println("Row updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Task 3: Delete a row using Scanner
    public static void deleteRow(int id) {
        String sql = "DELETE FROM student WHERE id = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "Dayaa@123");
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
        String sql = "SELECT * FROM student WHERE id = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "Dayaa@123");
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Age: " + rs.getInt("age"));
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
            System.out.println("1. Insert Sample Data");
            System.out.println("2. Insert a new Row");
            System.out.println("3. Update a Row");
            System.out.println("4. Delete a Row");
            System.out.println("5. Select a Row");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    insertSampleData();
                    break;
                case 2:
                    System.out.print("Enter Name and Age (comma-separated): ");
                    String value = scanner.nextLine();
                    insertRows(Collections.singletonList(value));
                    break;
                case 3:
                    System.out.print("Enter ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new Age: ");
                    int newAge = scanner.nextInt();
                    updateRow(updateId, newName, newAge);
                    break;
                case 4:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = scanner.nextInt();
                    deleteRow(deleteId);
                    break;
                case 5:
                    System.out.print("Enter ID to select: ");
                    int selectId = scanner.nextInt();
                    selectRow(selectId);
                    break;
                case 6:
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
