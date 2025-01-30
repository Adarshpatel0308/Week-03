package implementacustomhashmap;

import java.util.LinkedList;

    class CustomHashMap {
        // Node class representing key-value pairs
        private static class Node {
            int key;
            int value;

            Node(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        private LinkedList<Node>[] table;  // Array of LinkedLists for separate chaining
        private static final int SIZE = 10;  // Fixed size of HashMap

        // Constructor to initialize the HashMap
        public CustomHashMap() {
            table = new LinkedList[SIZE];
            for (int i = 0; i < SIZE; i++) {
                table[i] = new LinkedList<>();
            }
        }

        // Hash function to map key to index
        private int getIndex(int key) {
            return key % SIZE;
        }

        // Insert a key-value pair
        public void put(int key, int value) {
            int index = getIndex(key);
            for (Node node : table[index]) {
                if (node.key == key) {  // Update value if key already exists
                    node.value = value;
                    return;
                }
            }
            table[index].add(new Node(key, value));  // Add new key-value pair
        }

        // Retrieve value by key
        public int get(int key) {
            int index = getIndex(key);
            for (Node node : table[index]) {
                if (node.key == key) {
                    return node.value;  // Return value if key is found
                }
            }
            return -1;  // Return -1 if key not found
        }

        // Remove a key-value pair
        public void remove(int key) {
            int index = getIndex(key);
            table[index].removeIf(node -> node.key == key);  // Remove if key matches
        }

        // Display all key-value pairs in the HashMap
        public void display() {
            System.out.println("HashMap Contents:");
            for (int i = 0; i < SIZE; i++) {
                if (!table[i].isEmpty()) {
                    System.out.print("Index " + i + ": ");
                    for (Node node : table[i]) {
                        System.out.print("(" + node.key + " -> " + node.value + ") ");
                    }
                    System.out.println();
                }
            }
        }
    }
