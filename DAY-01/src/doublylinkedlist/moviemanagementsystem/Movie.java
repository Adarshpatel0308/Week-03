package doublylinkedlist.moviemanagementsystem;

class Movie {

    public Node head;
    public Node tail;

        public void addMovieAtBeginning(String title, String director, int yearOfRelease, double rating) {
            Node newMovie = new Node(title, director, yearOfRelease, rating);
            if (head == null) {
                head = tail = newMovie;
            } else {
                newMovie.next = head;
                head.prev = newMovie;
                head = newMovie;
            }
        }

        public void addMovieAtEnd(String title, String director, int yearOfRelease, double rating) {
            Node newMovie = new Node(title, director, yearOfRelease, rating);
            if (tail == null) {
                head = tail = newMovie;
            } else {
                tail.next = newMovie;
                newMovie.prev = tail;
                tail = newMovie;
            }
        }

        public void addMovieAtPosition(String title, String director, int yearOfRelease, double rating, int position) {
            if (position <= 0) {
                addMovieAtBeginning(title, director, yearOfRelease, rating);
                return;
            }
            Node newMovie = new Node(title, director, yearOfRelease, rating);
            Node temp = head;
            for (int i = 0; temp != null && i < position - 1; i++) {
                temp = temp.next;
            }
            if (temp == null || temp.next == null) {
                addMovieAtEnd(title, director, yearOfRelease, rating);
            } else {
                newMovie.next = temp.next;
                temp.next.prev = newMovie;
                temp.next = newMovie;
                newMovie.prev = temp;
            }
        }

        public void removeMovie(String title) {
            Node temp = head;
            while (temp != null) {
                if (temp.title.equalsIgnoreCase(title)) {
                    if (temp == head) {
                        head = temp.next;
                        if (head != null) head.prev = null;
                    } else if (temp == tail) {
                        tail = temp.prev;
                        if (tail != null) tail.next = null;
                    } else {
                        temp.prev.next = temp.next;
                        temp.next.prev = temp.prev;
                    }
                    return;
                }
                temp = temp.next;
            }
        }

        public void searchByDirector(String director) {
            Node temp = head;
            while (temp != null) {
                if (temp.director.equalsIgnoreCase(director)) {
                    System.out.println(temp.title + " (" + temp.yearOfRelease + ") - Rating: " + temp.rating);
                }
                temp = temp.next;
            }
        }

        public void searchByRating(double rating) {
            Node temp = head;
            while (temp != null) {
                if (temp.rating == rating) {
                    System.out.println(temp.title + " (" + temp.yearOfRelease + ") - Director: " + temp.director);
                }
                temp = temp.next;
            }
        }

        public void updateRating(String title, double newRating) {
            Node temp = head;
            while (temp != null) {
                if (temp.title.equalsIgnoreCase(title)) {
                    temp.rating = newRating;
                    return;
                }
                temp = temp.next;
            }
        }

        public void displayForward() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.title + " | " + temp.director + " | " + temp.yearOfRelease + " | " + temp.rating);
                temp = temp.next;
            }
        }

        public void displayReverse() {
            Node temp = tail;
            while (temp != null) {
                System.out.println(temp.title + " | " + temp.director + " | " + temp.yearOfRelease + " | " + temp.rating);
                temp = temp.prev;
            }
        }
    }


