import java.util.Scanner;

public class Game {
    int x = 1 ;
    int o = 2;
    int counter;
    private String playerName1;
    private String playerName2;
    private int[] array = new int[9];
    boolean stopTheGame = true;

    public Game (String newName1, String newName2){
        this.playerName1 = newName1;
        this.playerName2 = newName2;
        gameFeld();
    }
    private boolean isVoll(){
        int counter1 = 0;
        boolean voll = true;
        for (int i = 0 ; i < array.length; i++ ){
             if (array[i] != 0){
                 counter1++;
             }
        }
        if (counter1 == 9){
           voll = false;
           stopTheGame = false;
        }
        return voll;
    }
    public void gameRules(int position , int element){

        for (int i = 0 ; i < array.length ; i++ ){
            if(array[position] == 0){
                if (element==x){
                    array[position]=x;
                }
                else {
                    array[position]= o;
                }
            }
        }if (isVoll()){
      if ((array[0] == x && array[1] == x && array[2] == x) || (array[3] == x && array[4] == x && array[5]== x)
              ||(array[6] == x && array[7] == x && array[8]== x)||(array[0] == x && array[3] == x && array[6]== x)||
              (array[1] == x && array[4] == x && array[7]== x)||
              (array[2] == x && array[5] == x && array[8]== x)||(array[0] == x && array[4] == x && array[8]== x)||
              (array[2] == x && array[4] == x && array[6]== x) ){
          System.out.println("X WON THE Game");
          stopTheGame = false ;
      }
        if ((array[0] == o && array[1] == o && array[2] == o) || (array[3] == o && array[4] == o && array[5]== o)
                ||(array[6] == o && array[7] == o && array[8]== o)||(array[0] == o && array[3] == o && array[6]== o)||
                (array[1] == o && array[4] == o && array[7]== o)||
                (array[2] == o && array[5] == o && array[8]== o)||(array[0] == o && array[4] == o && array[8]== o)||
                (array[2] == o && array[4] == o && array[6]== o) ){
            System.out.println("O WON THE Game");
            stopTheGame = false;
        }
        }
        printarray();
    }
    public void printarray(){
        for (int i = 0 ; i < array.length ; i++){
            if (i == 2 || i== 5|| i == 8){
                if (array[i] == x){
                    System.out.print(" X");
                }
                else if (array[i] == o){
                    System.out.print(" O");
                } else {
                    System.out.print("__");
                }
            }
            else {
                if(i == 3 || i == 6){
                    System.out.println();
                }

                if (array[i] == x){
                    System.out.print("X |");
                }
                if(array[i] == o){
                    System.out.print("O |");
                }
                if (array[i] == 0){
                    System.out.print("__|");
                }

            }
        }
    }

    private void gameFeld() {
        for (int i = 0 ; i < array.length ; i++){
            if (i == 2 || i== 5|| i == 8){
                System.out.print("__");
            }
            else {
                if (i == 3 || i == 6){
                    System.out.println();
                    System.out.print("__|");
                }
                else {
                    System.out.print("__|");
                }
            }
        }

    }
}
