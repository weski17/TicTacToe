import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Game game = new Game("Wael","Ali");
        Scanner scanner = new Scanner(System.in);

        int counter = 0 ;

      while (game.stopTheGame){
          System.out.println();
          System.out.println("Position");
          int position = scanner.nextInt();
          System.out.println( " X = 1 ");
          System.out.println(" O = 2");
          int element = scanner.nextInt();
          game.gameRules(position,element);


      }
        System.out.println();
        System.out.println("The Game is Over ");

    }
}