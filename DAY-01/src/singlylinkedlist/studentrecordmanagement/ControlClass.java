package singlylinkedlist.studentrecordmanagement;

public class ControlClass {
    public static void main(String[] args) {
        // Main method to test the implementation
            Student student = new Student();

            // Adding student records
            student.addAtEnd("Yogesh", 22, 20, "A");
            student.addAtEnd("Deepanshu", 23, 21, "B");
            student.addAtEnd("Satyam", 21, 22, "C");

            System.out.println("All records:");
            student.displayRecords();
        System.out.println("-------------------------------------------------------------");
            // Adding at the beginning
            student.addAtBeginning("Avinesh", 23, 19, "A+");
            System.out.println("After adding at the beginning:");
            student.displayRecords();
        System.out.println("-------------------------------------------------------------");
            // Adding at a specific position
            student.addAtSpecificPosition(3, "Rohit", 24, 23, "B+");
            System.out.println("After adding at position 3:");
            student.displayRecords();
        System.out.println("-------------------------------------------------------------");
            // Searching for a student record
            System.out.println("Searching for roll number 21:");
            student.searchByRollNumber(21);
        System.out.println("-------------------------------------------------------------");
            // Updating a grade
            System.out.println("Updating grade for roll number 21:");
            student.updateGrade(21, "A+");
            student.displayRecords();
        System.out.println("-------------------------------------------------------------");
            // Deleting a record
            System.out.println("Deleting record with roll number 20:");
            student.deleteByRollNumber(20);
            student.displayRecords();
        }
    }
