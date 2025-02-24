import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentCRUD {

    // Database connection details
    private static final String URL = "jdbc:mysql://localhost:3306/school_db";
    private static final String USER = "root";
    private static final String PASSWORD = "Dayaa@123";

    // Establishing connection
    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "Dayaa@123");
    }

    // CREATE Operation
    public static void createStudent(String name, int age, String email) {
        String query = "INSERT INTO students (name, age, email) VALUES (?, ?, ?)";
        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement(query)) {

            stmt.setString(1, name);
            stmt.setInt(2, age);
            stmt.setString(3, email);

            int rowsInserted = stmt.executeUpdate();
            System.out.println(rowsInserted + " student(s) added successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ Operation
    public static void readStudents() {
        String query = "SELECT * FROM students";
        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String email = rs.getString("email");

                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Email: " + email);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE Operation
    public static void updateStudent(int id, String newName, int newAge, String newEmail) {
        String query = "UPDATE students SET name = ?, age = ?, email = ? WHERE id = ?";
        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement(query)) {

            stmt.setString(1, newName);
            stmt.setInt(2, newAge);
            stmt.setString(3, newEmail);
            stmt.setInt(4, id);

            int rowsUpdated = stmt.executeUpdate();
            System.out.println(rowsUpdated + " student(s) updated successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE Operation
    public static void deleteStudent(int id) {
        String query = "DELETE FROM students WHERE id = ?";
        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement(query)) {

            stmt.setInt(1, id);

            int rowsDeleted = stmt.executeUpdate();
            System.out.println(rowsDeleted + " student(s) deleted successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Main method to test CRUD operations
    public static void main(String[] args) {
        // CREATE
       StudentCRUD. createStudent("John Doe", 20, "john@example.com");
        StudentCRUD.createStudent("Jane Smith", 22, "jane@example.com");

        // READ
        System.out.println("Current Students:");
        StudentCRUD.readStudents();

        // UPDATE
       StudentCRUD. updateStudent(1, "John Updated", 21, "john_updated@example.com");

        // READ after update
        System.out.println("Students After Update:");
       StudentCRUD. readStudents();

        // DELETE
        StudentCRUD.deleteStudent(2);

        // READ after delete
        System.out.println("Students After Deletion:");
        StudentCRUD.readStudents();
    }
}
