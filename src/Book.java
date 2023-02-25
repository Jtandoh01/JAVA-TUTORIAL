
import java.time.LocalDate;
public class Book{
    // instances field
    private String Title;
    private String Author;
    private String ISBN;
    private String publicationDate;
    private int numberOfPages;

    // Getter methods
    public String getTitle(){
        return Title;
    }

    public String getAuthor(){
        return Author;
    }

    public String getISBN(){
        return ISBN;
    }

    public String getPublicationDate(){
        return publicationDate;
    }

    public int getNumberOfPages(){
        return numberOfPages;
    }


        //setter methods
    public void setTitle(String Title){
        this.Title = Title;
    }
    public void setAuthor(String Author){
        this.Author = Author;
    }
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

            //checking if book is long
    public boolean isBookLong(){
        return numberOfPages > 500;
    }

            //  checking if book is recent
    public boolean isRecentBook(){
       LocalDate currentDate = LocalDate.now();
       LocalDate publication = LocalDate.parse(publicationDate);
       LocalDate fiveYearsAgo = currentDate.minusYears(5);
       return publication.isAfter(fiveYearsAgo);

    }

}


