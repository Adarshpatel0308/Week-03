package countingsort.sortstudentages;

class StudentAges {

        //Function for the counting sort
        public static void countingSort(int[] array) {

                int max = array[0];
                for (int i = 1; i < array.length; i++) {
                    if (array[i] > max) {
                        max = array[i];
                    }
                }

             //Create the count array to count the frequencies of size(max+1)
            int[] count = new int[max + 1];

            //Store the frequencies of the elements
            for (int num : array) {
                count[num]++;
            }

            // Upgrade the original array according to the frequencies
            int index = 0;
            for (int i = 0; i < count.length; i++) {
                while (count[i] > 0) {
                    array[index++] = i;
                    count[i]--;
                }
            }
        }

        // Function to print the array
        public static void printArray(int[] array) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            int[] array = {23,87,54,12,98,65,90,34,54,23,11};

            System.out.println("Original Array:");
            printArray(array);

            // Sort the array using Counting Sort
            countingSort(array);

            System.out.println("Sorted Array:");
            printArray(array);
        }
    }
