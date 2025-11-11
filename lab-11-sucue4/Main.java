public class Main {
  public static void main(String[] args) {
    String[] contents = Utility.readFile("events.csv");
    Events events = Utility.generateEvents(contents);
    // TODO Add more events to the Events

    events.add(new MusicFestival("Glastonbury", "Worthy Farm; Pilton, England", "Jun 26 2024", "Jun 30 2024", new String[]{"Dua Lipa", "SZA", "Idris Elba", "Little Simz", "Shania Twain"}));
    events.add(new ArtExhibit("A Poem for Deep Thinkers", "Guggenheim Museum; New York", "Apr 18", "Jan 18 2026", new String[]{"Rashid Johnson"}));
    events.add(new TechConference("Oracle AI World", "Las Vegas", "Oct13", "Oct 16", new String[]{"Steve Miranda", "Clay Magouyrk", "Larry Ellison"}));
    events.add(new SportsEvent("NBA Finals", "Paycom Center; Oklahoma City", "Jun 05", "Jun 22", new String[]{"Indiana Pacers", "Oklahoma City Thunder"}));
    // TODO write the events back out to the events.csv file at the end

    String[] fileContents = Utility.createFileContents(events);
    Utility.writeFile("events.csv", fileContents);
  }
}
