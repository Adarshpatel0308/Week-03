package implementaqueueusingstacks;

public class ControlClass {
    public static void main(String[] args) {
        Queue obj = new Queue();
        obj.addElement(1);
        obj.addElement(2);
        obj.addElement(3);
        obj.addElement(4);
        obj.addElement(5);

        while(!Queue.isEmpty()){
            int result = obj.removeElement();
            System.out.println("This is the resultant queue : "+result);
        }
    }
}
