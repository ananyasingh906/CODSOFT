import java.util.*;

class number_game{
  void game(int r){
    int guess, count_tries = 0;
    Scanner sc = new Scanner(System.in);
    do{
      System.out.println("Guess the random number(You'll only get 3 tries): ");
      guess = sc.nextInt();
      count_tries++;
      if(count_tries == 3){
        System.out.println("Better luck next time");
        break;
      }
      if(guess == r)
        System.out.println("Exact guess!");
      if(guess < r)
        System.out.println("Too low");
      if(guess > r)
        System.out.println("Too high");
    }while(guess != r);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    number_game obj=new number_game();
    int r = (int) (Math.random() * (100 - 10)) + 10;
    int choice;
    do{
      obj.game(r);
      System.out.println("Do you want to play again? [1/0]: ");
      choice = sc.nextInt();
    }while(choice != 0);
    
  }
}