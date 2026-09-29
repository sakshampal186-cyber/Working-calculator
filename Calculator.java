import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {


         Scanner input = new Scanner(System.in);

        String choice = "yes";
        while (choice.equalsIgnoreCase("yes")){

        
       

        

        System.out.print("Enter first number : ");
        double num1 = input.nextDouble();

        System.out.print("Enter operation (+ , - , * , / , %) : ");
        String operation = input.next();

        System.out.print("Enter second number : ");
        double num2 = input.nextDouble();

        if(operation.equals("+")){
            double result = num1 + num2;
            System.out.println("Result = "+ result);


        }else if(operation.equals("-")){
                double result = num1-num2;
                System.out.println("Result = "+ result);


        }else if (operation.equals ("*")){
            double result = num1 * num2;
            System.out.println("Result = " + result);

        }else if (operation.equals ("/")){
            if(num2 == 0){
                System.out.println("Cannot divide by zero!");

            } else {

            
            
            
            
            double result = num1 / num2;
            System.out.println("Result =" + result);
            }



        } else if (operation.equals("%")){
            double result = num1/100 * num2;
            System.out.println("Result =" + result);
        }
          else{
                    System.out.println("Invalid operation!");

                
            } 
            System.out.print("Do you want another calculation? (yes/no): ");
            choice = input.next();
        }
        System.out.print("Thank you for using my calculator!");

                input.close();
                

            }
;        }

        


    