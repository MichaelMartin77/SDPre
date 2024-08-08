public class Objective5Lab3 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int userNum = keyboard.nextInt();

      System.out.println("Please enter a number: ");

      if(userNum >= 0) {
        System.out.println("The number is positive"); 
      } else {
        System.out.println("The number is negative"); 
      }

      scanner.close();
  }
}