package circulartourproblem;

public class ControlClass {
    public static void main(String[] args) {

        PetrolPump[] pumps = {
                new PetrolPump(4, 6),
                new PetrolPump(6, 5),
                new PetrolPump(7, 3),
                new PetrolPump(4, 5),
                new PetrolPump(6, 2)
        };

        int n = pumps.length;
        int startPoint = CircularTour.findStartPoint(pumps, n);

        if (startPoint == -1) {
            System.out.println("There is no valid starting point.");
        } else {
            System.out.println("The starting point for the circular tour is pump " + startPoint);
        }
    }
}
