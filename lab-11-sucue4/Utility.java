import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Utility {
  public static String[] readFile(String filename){
    StringBuilder str = new StringBuilder();
    File f = new File(filename);
    try {
      Scanner s = new Scanner(f);
      while(s.hasNextLine()){
        str.append(s.nextLine()).append("\n");
      }
      s.close();
    } catch(FileNotFoundException e){
      System.out.println("File not found");
    }
    return str.toString().split("\n");
  }

  public static Events generateEvents(String[] contents){
    Events events = new Events();
    for(String line : contents){
      String[] parts = line.split(",");
      String type = parts[0];
      String name = parts[1];
      String venue = parts[2];
      String startDate = parts[3];
      String endDate = parts[4];
      String[] internal = parts[5].split("-");
      if(type.equals("music")){
        events.add(new MusicFestival(name, venue, startDate, endDate, internal));
      } else if(type.equals("tech")){
        events.add(new TechConference(name, venue, startDate, endDate, internal));
      } else if(type.equals("art")){
        events.add(new ArtExhibit(name, venue, startDate, endDate, internal));
      } else if(type.equals("sports")){
        events.add(new SportsEvent(name, venue, startDate, endDate, internal));
      }
    }
    return events;
  }

  public static String[] createFileContents(Events events){
    return events.toFileString().split("\n");
  }

  public static void writeFile(String filename, String[] contents){
    try{
      FileWriter f = new FileWriter(filename);

      for (String line : contents){
        f.write(line);
       f.write("\n");
      }
      f.close();
      
    } catch(IOException e){
      System.out.println("File not found");
    }
  }
  
}
