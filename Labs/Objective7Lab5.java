import java.util.Scanner; 
public class Objective7Lab5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while (true) {
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      System.out.println();

      selection = scanner.nextInt();

       if(selection == 1) {
<<<<<<< HEAD
          System.out.print("Hello Human\n"); 
        } else if(selection == 2) {
          System.out.print("Apple, Banana, Coconut\n");
=======
          System.out.println("Hello Human"); 
        } else if(selection == 2) {
          System.out.println("Apple, Banana, Coconut");
>>>>>>> f98970c7c10dbf36dd716f23de9ce01dbc2dc452
        } else if(selection == 3) {
          System.out.println("Goodbye\n");
          break; 
          
        } 
    }

    scanner.close();
  }



}



}
