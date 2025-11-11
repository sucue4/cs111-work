import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

  private static HashSet<Character> getNonDuplicatingCharacters(String line){
    HashSet<Character> characters = new HashSet<>();
    for (int i = 0; i < line.length(); i++) {
      characters.add(line.charAt(i));
    }
    return characters;
  }

  private static HashMap<Character, Integer> getCounts(String line){
    HashMap<Character, Integer> counts = new HashMap<>();
    for (int i = 0; i < line.length(); i++) {
      char c = line.charAt(i);

      counts.put(c, counts.getOrDefault(c, 0) + 1);
    }

    return counts;
  }

  private static char mostCommonLetter(HashMap<Character, Integer> counts){
    int mostCommon = 0;
    char letter = ' ';

    for (char c : counts.keySet()) {
      if (counts.get(c) > mostCommon) {
        mostCommon = counts.get(c);
        letter = c;
      }
    }

    return letter;
  }


  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String line = input.nextLine();

    HashSet<Character> characters = getNonDuplicatingCharacters(line);
    HashMap<Character, Integer> counts = getCounts(line);
    char mostCommon = mostCommonLetter(counts);
    System.out.println(characters);
    System.out.println(counts);
    System.out.println(mostCommon + " at " + counts.get(mostCommon) + " times");
    input.close();
  }
}
