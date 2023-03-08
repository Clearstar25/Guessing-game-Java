import java.util.Scanner; 

class Main {
  public static void main( final String[] args) {
  Scanner input = new Scanner(System.in);

int count = 0;
int min = 1, max = 20;
    int rand = (int)(Math.random() * max) + min;


       boolean check1 = false;
   do{ 
  
     boolean check2 = false;
     int number;
  do{
     System.out.println("Please enter a number between 1 - 20");
     number = input.nextInt();
    if (number >= 1 && number <= 20){
      check2 = true;
    }
    } while (!check2);
    count++;
     
    if(number > rand){
      System.out.println("The number is lower");
    }
   else if(number < rand){
      System.out.println("The number is higher");
    }   
  else{
       check1 = true;
     }
  } while (check1 == false && count < 5);

input.close();
    
    if(!check1){
      System.out.println("The number was " + rand + "\nYou took too many tries, better luck next time");
    }
    else{
      System.out.println("Congrats, you guessed the number");
    }
  }
}