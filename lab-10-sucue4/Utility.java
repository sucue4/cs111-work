import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Utility {
  // read all the lines of the file and return in a string array
  public static String[] readFile(String filename){
    // stringbuilder will help help hold the contents of the file
    StringBuilder sb = new StringBuilder();
    File f = new File(filename);

    try {
      // keep reading all lines in the file and catch if there is no file found
      Scanner sc = new Scanner(f);
      while(sc.hasNextLine()) {
        sb.append(sc.nextLine()).append("\n");
      }
      sc.close();
    } catch (FileNotFoundException e) {
      System.out.println("File not found!");
      return new String[0];
    }

    return sb.toString().split("\n");
  }
  
  // company object based on array of employee info
  public static Company fillCompany(String[] contents){
    Company c = new Company(contents.length);

    for(String s : contents){
      // skip empty lines
      if(s.isEmpty()){
        continue;
      }
      
      //split the line by commas into different sections
      String[] parts = s.split(",");
      String name = parts[0];
      String id = parts[1];
      String type = parts[2].toLowerCase(); // if they are employee manager or developer
      
      // create correct type of employee based on their type
      if (type.equals("employee")) {
        Employee e = new Employee(name, id);
        c.add(e);

      } else if (type.equals("manager")) {
        String department = parts[3];
        Manager m = new Manager(name,id, department);
        c.add(m);

      } else if (type.equals("developer")){
        String[] languages = parts[3].split("-");
        Developer d = new Developer(name, id, languages);
        c.add(d);
      } 
    }
    
    return c;
  }
}
