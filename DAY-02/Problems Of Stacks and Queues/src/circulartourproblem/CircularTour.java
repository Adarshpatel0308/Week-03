package circulartourproblem;

import java.util.Queue;
import java.util.LinkedList;

class CircularTour {

        public static int findStartPoint(PetrolPump[] pumps, int n) {
            Queue<Integer> queue = new LinkedList<>();
            int start = 0;
            int extraPetrol = 0;
            int lessPetrol = 0;

            for (int i = 0; i < n; i++) {
                extraPetrol += pumps[i].petrol - pumps[i].distanceToNextPump;
                queue.add(i);

                // If extraPetrol petrol is negative, reset the queue
                if (extraPetrol < 0) {
                    start = i + 1;  // Move start to next pump
                    lessPetrol += extraPetrol;  // Track lessPetrol
                    extraPetrol = 0;  // Reset extraPetrol
                    queue.clear();  // Reset queue
                }
            }

            return (extraPetrol + lessPetrol >= 0) ? start : -1;
        }
    }
