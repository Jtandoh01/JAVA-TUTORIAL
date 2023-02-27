public class Driver{
    public static void main(String[] args){
        //creating book1 and book2 objects and setting properties
        Book book1 = new Book();
        book1.setTitle("Things Fall Apart");
        book1.setAuthor("Chinua Achebe");
        book1.setISBN("0435905252");
        book1.setPublicationDate("1958-06-17");
        book1.setNumberOfPages(148);

        //getting the properties of book1 and checking if it is long, and also checking if it is recent
        System.out.println("Book1: ");
        System.out.println("Title: "+ book1.getTitle());
        System.out.println("Author "+ book1.getAuthor());
        System.out.println("ISBN: "+ book1.getISBN());
        System.out.println("Publication Date: "+ book1.getPublicationDate());
        System.out.println("Page Count: "+ book1.getNumberOfPages());
        System.out.println( "Is " + book1.getTitle() + " long book? " + book1.isBookLong());
        System.out.println( "Is "+ book1.getTitle() + "  a recently published text? " + book1.isRecentBook());
        System.out.println();

        // creating book2 and setting its properties
                Book book2 = new Book();
                book2.setTitle("Thomas' Calculus");
                book2.setAuthor("Joel Hass, Christopher Heil, Maurice Weir");
                book2.setISBN("978-0134438986");
                book2.setPublicationDate("2017-03-13");
                book2.setNumberOfPages(1224);


        //getting the properties of book2 and checking if it is long, and also checking if it is recent
        System.out.println("Book2: ");
        System.out.println("Title: "+ book2.getTitle());
        System.out.println("Author "+ book2.getAuthor());
        System.out.println("ISBN: "+ book2.getISBN());
        System.out.println("Publication Date: "+ book2.getPublicationDate());
        System.out.println("Page Count: "+ book2.getNumberOfPages());
        System.out.println(book2.getTitle() + " is such a long book: " + book2.isBookLong());
        System.out.println(book2.getTitle() + " is  recent: " + book2.isRecentBook());
    }
}









