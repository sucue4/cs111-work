public class Main {
  public static void main(String[] args) {
    Library l = new Library(10);
    l.add(new Movie("Oppenheimer", 180, "Biographical Thriller", 8.3, 100000000, 2023));
    l.add(new TVShow("Peaky Blinders", 60, "Period Crime", 8.7, 6, 36));
    l.add(new Movie("Toy Story", 81, "Adventure Comedy", 8.3, 30000000, 1996));
    l.add(new TVShow("Arcane", 45, "Steampunk Action Adventure", 9.0, 2, 18));
    l.add(new Movie("Seven", 130, "Crime Horror", 8.6, 30000000, 1995)); 
    l.add(new TVShow("Stranger Things", 61, "Horror", 8.5, 5, 34));
    l.add(new Movie("How to Lose a Guy in 10 Days", 110, "Comedy Romance", 6.5, 50000000, 2003));
    l.add(new TVShow("South Park", 23, "Comedy", 8.7, 28, 334));
    l.add(new Movie("Final Destination", 98, "Horror Fantasy", 6.7, 23000000, 2000));
    l.add(new Movie("Superbad", 119, "Comedy Teen", 7.6, 20000000, 2007));

    System.out.println(l);

    System.out.println();
    System.out.println("Best rated media: ");
    System.out.println(l.findBest());

    System.out.println("Most expensive movie: ");
    System.out.println(l.mostExpensive());

    System.out.println("Longest tv show: ");
    System.out.println(l.longestShow());
  } 
}
