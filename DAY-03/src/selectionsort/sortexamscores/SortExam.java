package selectionsort.sortexamscores;

public class SortExam {

        // Function to implement Selection Sort
        public static void selectionSort(int[] scores) {
            int n = scores.length;

            // Loop to iterate through the array
            for (int i = 0; i < n - 1; i++) {
                int min = i; //Initialise the min by the first element of the array
                for (int j = i + 1; j < n; j++) {
                    if (scores[j] < scores[min]) {
                        min = j;
                    }
                }

                // If we found the another element which is more minimum tha the (min)
                //then we swap this element with the (min)
                int temp = scores[min];
                scores[min] = scores[i];
                scores[i] = temp;
            }
        }

        // Function to print the sorted array
        public static void printArray(int[] scores) {
            for (int score : scores) {
                System.out.print(score + " ");
            }
            System.out.println();
        }
        //Main method
        public static void main(String[] args) {
            int[] scores = {98,56,23,13,37,67,88,99};

            System.out.println("Original Array :");
            printArray(scores);

            // call the function
            selectionSort(scores);

            System.out.println("Sorted Array :");
            printArray(scores);
        }
    }
