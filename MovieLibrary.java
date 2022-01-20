
/**
 * MovieLibrary.java
 *
 * Sara Gurnett
 * Creates, adds, and removes movies based on user input
 * and stores them in the movie library array.
 */

import java.util.Scanner;
import java.util.ArrayList;

public class MovieLibrary
{
   ArrayList<MovieLibrary> movies = new ArrayList<>();
   //************************************************************************
   private final String TITLE;
   private final String GENRE;
   private final String STAR;
   private final int YEAR;
   
   public MovieLibrary(String title, String genre, String star, int year)
   {
       this.TITLE = title;
       this.GENRE = genre;
       this.STAR = star;
       this.YEAR = year;
   }
   //************************************************************************
   
   // Add to the movie library.
   public void addUserSpecifiedMovies(int num)
   {
       for (int i = 0; i < num; i++)
       {
           movies.add(getUserSpecifiedMovies());
       }
   } // End addUserSpecifiedMovies
   //************************************************************************
   
   // User input to add to movie library with specified number of movies.
   private MovieLibrary getUserSpecifiedMovies()
   {
       Scanner stdIn = new Scanner(System.in);
       String title, genre, star;
       int year;
       
       System.out.println("Enter movie title: ");
       title = stdIn.nextLine();
       System.out.println("Enter movie genre: ");
       genre = stdIn.nextLine();
       System.out.println("Enter name of movie starring actor: ");
       star = stdIn.nextLine();
       System.out.println("Enter year movie was made: ");
       year = stdIn.nextInt();
       return new MovieLibrary(title, genre, star, year);
   } // End getUserSpecifiedMovies
   //************************************************************************
   
   // Remove movies from movie library.
   public void removeUserSpecifiedMovies(String title, ArrayList<MovieLibrary> movies)
   {
       Scanner stdIn = new Scanner(System.in);
       System.out.println("Enter title of movie to be removed: ");
       String remTitle = stdIn.nextLine();
       
       for (int i = 0; i < movies.size(); i++)
       {
           if (remTitle.equals(title))
           {
               movies.remove(i);
               System.out.println(title + " removed.");
           }
       }
   } // End removeUserSpecifiedMovies
} // End class MovieLibrary
