import java.io.PrintStream;
import java.util.Scanner;

public class StringGame {
   public StringGame() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Please Enter your name: ");
      String var2 = var1.nextLine();
      if (var2.isEmpty()) {
         System.out.println("Name cannot be empty!");
      } else {
         System.out.println("Hello " + var2 + "!");
         System.out.println("Number of characters: " + var2.length());
         System.out.println("First character: " + var2.charAt(0));
         PrintStream var10000 = System.out;
         char var10001 = var2.charAt(var2.length() - 1);
         var10000.println("Last character: " + var10001);
         if (var2.toLowerCase().contains("a")) {
            System.out.println("Your name contains the letter 'a' or 'A'.");
         } else {
            System.out.println("No 'a' or 'A' found in your name.");
         }

         String var3 = var2.replaceAll("(?i)[aeiou]", "*");
         System.out.println("Name with vowels replaced: " + var3);
         System.out.println("Name staircase:");

         int var4;
         for(var4 = 1; var4 <= var2.length(); ++var4) {
            System.out.println(var2.substring(0, var4));
         }

         for(var4 = 1; var4 <= var2.length(); ++var4) {
            if (var4 != 3) {
               if (var4 == 5) {
                  break;
               }

               System.out.println("Counting " + var4);
            }
         }

         System.out.printf("Thanks, %s, for playing the String Steps Game!\n", var2);
         System.out.print("Enter a second word: ");
         String var6 = var1.nextLine();
         if (var2.equals(var6)) {
            System.out.println("The words are the same.");
         } else {
            System.out.println("The words are different.");
         }

         String var5 = var2.concat(var6);
         System.out.println("Combined words: " + var5);
         var1.close();
      }
   }
}
