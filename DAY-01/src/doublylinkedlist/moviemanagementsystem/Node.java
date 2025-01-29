package doublylinkedlist.moviemanagementsystem;

class Node {
    String title;
    String director;
    int yearOfRelease;
    double rating;
    Node next;
    Node prev;

    Node(String title,String director,int yearOfRelease,double rating){
        this.title = title;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}
