import java.util.*;

class number_game{
  public static void main(String[] args){
    int guess, r;
    Scanner sc = new Scanner(System.in);
    r = (int) (Math.random() * (100 - 10)) + 10;
    do{
      System.out.println("Guess the random number: ");
      guess = sc.nextInt();
      if(guess == r)
        System.out.println("Exact guess!");
      if(guess < r)
        System.out.println("Too low");
      if(guess > r)
        System.out.println("Too high");
    }while(guess != r);
  }
}