package guru.springframework.spring5webapp.model;

public class Author {
    private String firstName;
    private String lastName;
    private String books;

    public Author() {
    }

    public Author(String firstName, String lastName, String books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }


}
