package doublylinkedlist.moviemanagementsystem;

public class ControlClass {
    public static void main(String[] args) {
        Movie movieList = new Movie();

        movieList.addMovieAtEnd("Sholay", "Ramesh Sippy", 1975, 9.2);
        movieList.addMovieAtBeginning("Dilwale Dulhania Le Jayenge", "Aditya Chopra", 1995, 8.9);
        movieList.addMovieAtEnd("Baahubali: The Beginning", "S.S. Rajamouli", 2015, 8.1);
        movieList.addMovieAtPosition("Lagaan", "Ashutosh Gowariker", 2001, 8.4, 1);

        System.out.println("Movies in Forward Order:");
        movieList.displayForward();

        System.out.println("-----------------------------------------------------------------");

        System.out.println("Movies in Reverse Order:");
        movieList.displayReverse();

        System.out.println("-----------------------------------------------------------------");

        System.out.println("Searching for movies by S.S. Rajamouli:");
        movieList.searchByDirector("S.S. Rajamouli");

        System.out.println("-----------------------------------------------------------------");

        System.out.println("Updating rating of 'Sholay' to 9.5:");
        movieList.updateRating("Sholay", 9.5);
        movieList.displayForward();

        System.out.println("-----------------------------------------------------------------");

        System.out.println("Removing 'Dilwale Dulhania Le Jayenge':");
        movieList.removeMovie("Dilwale Dulhania Le Jayenge");
        movieList.displayForward();
    }
}
