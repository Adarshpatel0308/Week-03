package implementacustomhashmap;

public class ControlClass {
    // Main method demonstrating all functionalities
    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();

        // Insert key-value pairs
        map.put(1, 10);
        map.put(2, 20);
        map.put(12, 50);
        map.put(3, 30);
        map.put(4, 40);
        map.put(14, 60);

        // Display HashMap after insertions
        map.display();

        // Retrieve values
        System.out.println("Value for key 1: " + map.get(1));
        System.out.println("Value for key 2: " + map.get(2));
        System.out.println("Value for key 12: " + map.get(12));
        System.out.println("Value for key 99 (not present): " + map.get(99));

        // Remove a key and check
        map.remove(1);
        System.out.println("After removing key 1:");
        map.display();
        System.out.println("Value for key 1: " + map.get(1));

        // Remove another key and check
        map.remove(14);
        System.out.println("After removing key 14:");
        map.display();
    }
}
