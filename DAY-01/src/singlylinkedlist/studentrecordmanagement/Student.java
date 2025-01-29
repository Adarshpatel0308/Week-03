package singlylinkedlist.studentrecordmanagement;

class Student {
    public Node head;

    public void addAtBeginning(String name,int age,int rollNumber,String grade){
        Node newNode = new Node(name,age,rollNumber,grade);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addAtEnd(String name,int age,int rollNumber,String grade){
        Node newNode = new Node(name,age,rollNumber,grade);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        newNode.next = null;
    }
    public void addAtSpecificPosition(int position,String name,int age,int rollNumber,String grade){
        Node newNode = new Node(name,age,rollNumber,grade);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        int i=1;
        while(i < (position-1)){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void deleteByRollNumber(int rollNumber){
        Node current = head;
        while(current != null && current.next!=null){
            if(current.next.rollNumber == rollNumber) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
        if(head.next == null && head.rollNumber == rollNumber) {
            head = null;
        }
        System.out.println("Roll  number not found. ");
    }
    public void searchByRollNumber(int rollNumber){
        Node current = head;
        while(current != null){
                if(current.rollNumber == rollNumber) {
                    System.out.println("Name of Student : "+current.name);
                    System.out.println("Age of Student : "+current.age);
                    System.out.println("Roll Number of Student : "+current.rollNumber);
                    System.out.println("Grade of Student : "+current.grade);
                }
            current = current.next;
            }

            System.out.println("Roll  number not found. ");
        }
    public void updateGrade(int rollNumber, String newGrade) {
        Node temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Record not found");
    }
    public void displayRecords() {
        if (head == null) {
            System.out.println("No records to display");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println("Roll Number: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }
}
