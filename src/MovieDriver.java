public class MovieDriver {
   public static void main(String[] args){
       //creating Movie object video1
       Movie video1 = new Movie();

       //setting and getting  Movie properties of Video1
       video1.setTitle("Malificent");
       video1.setDirector("Robert Stronmbert");
       video1.setReleaseYear(2014);
       video1.setDuration(97);
       video1.setRating(6.9);

       // getting movie properties of video1
       System.out.println("Movie1: ");
       System.out.println("Title: "+ video1.getTitle());
       System.out.println("Director: "+ video1.getDirector());
       System.out.println("Release Year: "+ video1.getReleaseYear());
       System.out.println("Duration Year: "+ video1.getDuration()+ " minutes");
       System.out.println("Rating:"+ video1.getRating());
       System.out.println("Is "+ video1.getTitle() + " a long movie? " + video1.isLongMovie());
       System.out.println("Is "+ video1.getTitle()+ " highly rate by viewers? " + video1.isHighlyRated());
       System.out.println();

       //creating Movie object video2
       Movie video2 = new Movie();

       //setting and getting  Movie properties of Video2
       video2.setTitle("Avengers: Infinity War");
       video2.setDirector("Anthony Russo, Joe Russo");
       video2.setReleaseYear(2018);
       video2.setDuration(149);
       video2.setRating(8.4);

       // getting movie properties of video2
       System.out.println("Movie2: ");
       System.out.println("Title: "+ video2.getTitle());
       System.out.println("Director: "+ video2.getDirector());
       System.out.println("Release Year: "+ video2.getReleaseYear());
       System.out.println("Duration Year: "+ video2.getDuration()+ " minutes");
       System.out.println("Rating:"+ video2.getRating());
       System.out.println("Is "+ video2.getTitle() + " a long movie? " + video2.isLongMovie());
       System.out.println("Is "+ video2.getTitle()+ " highly rate by viewers? " + video2.isHighlyRated());
       System.out.println();

       //creating Movie object video3
       Movie video3 = new Movie();

       //setting and getting  Movie properties of Video2
       video3.setTitle("Justice League");
       video3.setDirector("Zack Snyder");
       video3.setReleaseYear(2017);
       video3.setDuration(120);
       video3.setRating(6.1);

       // getting movie properties of video3
       System.out.println("Movie3: ");
       System.out.println("Title: "+ video3.getTitle());
       System.out.println("Director: "+ video3.getDirector());
       System.out.println("Release Year: "+ video3.getReleaseYear());
       System.out.println("Duration Year: "+ video3.getDuration() + " minutes");
       System.out.println("Rating:"+ video3.getRating());
       System.out.println("Is "+ video3.getTitle() + " a long movie? " + video3.isLongMovie());
       System.out.println("Is "+ video3.getTitle()+ " highly rate by viewers? " + video3.isHighlyRated());



   }


}
