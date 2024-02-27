import java.util.Scanner;

class calculation
{
    void Add(double n1,double n2)
    {
        double sum=0;
        sum=n1+n2;
        System.out.println("Addition of "+n1+" and "+n2+" can be given by :");
        System.out.println(n1+" + "+n2+" = "+sum);
    }
    void Sub(double n1,double n2)
    {
        double sub=0;
        if(n1>n2)
        {
            sub=n1-n2;
            System.out.println("Subtraction of "+n1+" and "+n2+" can be given by :");
            System.out.println(n1+" - "+n2+" = "+sub);
        }
        if(n2>n1)
        {
            sub=n1-n2;
            System.out.println("Subtraction of "+n1+" and "+n2+" can be given by :");
            System.out.println(n1+" - "+n2+" = "+sub); 
        }
     
    }
    void Multi(double n1,double n2)
    {
        double mul=1;
        mul=n1*n2;
        System.out.println("Multiplication of "+n1+" and "+n2+" can be given by :");
        System.out.println(n1+" * "+n2+" = "+mul); 
    }
    void Div(double n1,double n2)
    {
        double d;
        double r;
        d=n1/n2;
        r=n1%n2;
        if(n2==0)
        {
            try
            {
            throw new ArithmeticException("Cannot divide by zero...");
            }
            catch(ArithmeticException e)
            {
                System.out.println("Error : "+e.getMessage());
            }
        }
        else{
        System.out.println("Division of "+n1+" and "+n2+" can be given by :");
        System.out.println(n1+" / "+n2+" = "+d); 
        }



    }
}
class calculator
{
public static void main(String[] args) {

    calculation g=new calculation();

    Scanner input=new Scanner(System.in);

    int option;

    System.out.println("Enter the first number:");
    double number1=input.nextDouble();

   
    System.out.println("Enter the second number:");
    double number2=input.nextDouble();
    
   do{
  
    System.out.println("Enter 1 for addition...");
    System.out.println("Enter 2 for subtraction...");
    System.out.println("Enter 3 for multiplication...");
    System.out.println("Enter 4 for division...");
    System.out.println("Enter 5 to exit...");
    int choice = input.nextInt();

    switch(choice)
    {
        case 1:
            g.Add(number1,number2);
            break;
        case 2:
            g.Sub(number1,number2);
            break;
         case 3:
            g.Multi(number1,number2);
            break;
        case 4:
            g.Div(number1,number2);
            break; 
        case 5:
            System.out.println("Program exited successfully...!");
            break;
            
    }
    System.out.println("Enter 0 to continue....");
    option = input.nextInt();
}while(option==0);
    input.close();

}
}
