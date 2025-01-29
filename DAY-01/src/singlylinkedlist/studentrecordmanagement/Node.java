package singlylinkedlist.studentrecordmanagement;

class Node {
    String name;
    int age;
    int rollNumber;
    String grade;
    Node next;

    public Node(String name,int age,int rollNumber,String grade){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.next = null;
    }
}
