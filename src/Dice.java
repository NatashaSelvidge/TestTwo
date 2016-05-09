import java.util.Random; 

public class Dice {
 public static void main (){}
 public static int throwDice(int userInput){
  Random randomGenerator = new Random();
  int diceValue = 0;
  int i = 0;
  while (i < userInput){
  diceValue = diceValue + randomGenerator.nextInt(5) + 1; 
  i++;
   
  }
  return diceValue;
 }
   
}
