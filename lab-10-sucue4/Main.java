public class Main {
 public static void main(String[] args) {
   String[] contents = Utility.readFile("users.csv");
   Company company = Utility.fillCompany(contents);
   System.out.println("Company:");
   System.out.println(company);
   Developer[] javaDevs = company.findDevelopersByLanguage("java");
   System.out.println("Java Developers:");
   for(Developer d : javaDevs){
     System.out.println(d);
   }
 } 
}
