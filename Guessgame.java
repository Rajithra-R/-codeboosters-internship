import java.util.*;

public class Guessgame {
    public static void main(String[] args) {
    Random ran = new Random();
    int randomno= ran.nextInt(100)+1;
   // System.out.println("Random Number : "+randomno);
    
   System.out.println("************************************************************************");
   System.out.println("********************* Welcome To The Guess Game *************************");
   System.out.println("************************************************************************");

   System.out.println("You have 3 attempts to rock............");
    Scanner input=new Scanner(System.in);
    int b=2;
    for(int i=0;i<3;i++)
    {
    System.out.println("Enter the Guess number : ");
    int guessno=input.nextInt();
    if(randomno==guessno)
    {
        System.out.println("************************************************************************");
        System.out.println("Correct Guess....!");  
        System.out.println("Congratulations...You win....!");
        System.out.println("************************************************************************");
        break;
    }
    else if(randomno>guessno)
    {
        System.out.println("************************************************************************");
        System.out.println("The guess number is lower than the random number....");
        System.out.println("Kindly enter another guess.....");
        System.out.println("************************************************************************");
    }
    else
    {
        System.out.println("************************************************************************");
        System.out.println("The guess number is higher than the random number....");
        System.out.println("Kindly enter another guess.....");
        System.out.println("************************************************************************");
    }
    System.out.println("------------------------Attempts remaining : "+b--+"--------------------------");
    }
    System.out.println("**********************Attempts over....!******************************");

    }
}
