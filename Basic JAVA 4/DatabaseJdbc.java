package JDBC;

import java.sql.*;
import java.util.Scanner;

public class DatabaseJdbc  {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String pass = "Vyanktesh@08";

        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(url, user, pass);

            while (true)  {

                System.out.println("\n---- STUDENT MENU ----");
                System.out.println("1. Insert Student");
                System.out.println("+" + "2. Update Student");
                System.out.println("3. Delete Student");
                System.out.println("4. Exit");
                System.out.println("5. Show All Students");
                System.out.println("6. Search Student by ID");
                System.out.print("Enter choice: ");

                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Enter Student ID: ");
                        int id = sc.nextInt();

                        sc.nextLine();
                        System.out.print("Enter Student Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Student Age: ");
                        int age = sc.nextInt();

                        String insertSql = "INSERT INTO student (id, name, age) VALUES (?, ?, ?)";
                        PreparedStatement ps1 = con.prepareStatement(insertSql);
                        ps1.setInt(1, id);
                        ps1.setString(2, name);
                        ps1.setInt(3, age);


                        ps1.executeUpdate();
                        System.out.println("Student Inserted Successfully");
                        break;

                    case 2:
                        System.out.print("Enter Student ID to Update: ");
                        id = sc.nextInt();

                        sc.nextLine();
                        System.out.print("Enter New Name: ");
                        name = sc.nextLine();

                        System.out.print("Enter New Age: ");
                        age = sc.nextInt();

                        String updateSql ="UPDATE student SET name=?, age=? WHERE id=?";
                        PreparedStatement ps2 = con.prepareStatement(updateSql);
                        ps2.setString(1, name);
                        ps2.setInt(2, age);
                        ps2.setInt(3, id);

                        int rowsUpdated = ps2.executeUpdate();
                        if (rowsUpdated > 0)
                            System.out.println("Student Updated");
                        else
                            System.out.println("Student Not Found");
                        break;

                    case 3:
                        System.out.print("Enter Student ID to Delete: ");
                        id = sc.nextInt();

                        String deleteSql ="DELETE FROM student WHERE id=?";
                        PreparedStatement ps3 = con.prepareStatement(deleteSql);
                        ps3.setInt(1, id);

                        int rowsDeleted = ps3.executeUpdate();
                        if (rowsDeleted > 0)
                            System.out.println("Student Deleted");
                        else
                            System.out.println("Student Not Found");
                        break;
                    case 4:
                        System.out.println("Exiting Program...");
                        con.close();
                        sc.close();
                        return;

                    case 5:
                        String showSql = "SELECT * FROM student";
                        PreparedStatement ps4 = con.prepareStatement(showSql);
                        ResultSet rs = ps4.executeQuery();

                        System.out.println("\n--- STUDENT LIST ---");
                        boolean found = false;

                        while (rs.next()) {
                            found = true;
                            System.out.println(
                                            "ID: " + rs.getInt("id") +
                                            " | Name: " + rs.getString("name") +
                                            " | Age: " + rs.getInt("age")
                            );
                        }

                        if (!found)
                            System.out.println("No Students Found");
                        break;

                    case 6:
                        System.out.print("Enter Student ID to Search: ");
                        id = sc.nextInt();

                        String searchSql ="SELECT * FROM student WHERE id=?";
                        PreparedStatement ps5 = con.prepareStatement(searchSql);
                        ps5.setInt(1, id);

                        ResultSet rs2 = ps5.executeQuery();

                        if (rs2.next()) {
                            System.out.println(
                                    "ID: " + rs2.getInt("id") +
                                            " | Name: " + rs2.getString("name") +
                                            " | Age: " + rs2.getInt("age")
                            );
                        } else {
                            System.out.println("Student Not Found");
                        }
                        break;

                    default:
                        System.out.println("Invalid Choice");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

