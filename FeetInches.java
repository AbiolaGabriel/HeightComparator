/**
 * Abiola Gabriel Olofin
 * 01/27/2020
 * This program is a Scanner that allows users to calculate the inequalities with ones
 * feet and inches and get whether the inequality is true 
 */
import java.util.Scanner;
public class FeetInches{
    public static void main(String[]args){
        FeetInches terminal= new FeetInches();
        terminal.run();
    }
    /**
     * This method run() allows user to input one's feet and inches and 
     * compare it to another measurement of feet and inches and determine, based on the operation,
     * whether the comparison is true/false
     * It uses try and catch
     */
    public void run(){
        Scanner read = new Scanner(System.in);
        int evaluate;
        float feet1, inch1, feet2, inch2;
        String x;
        try{
            System.out.print("How many inequalities do you wish to evaluate: ");
            //checks for user input
            evaluate = read.nextInt();
            System.out.println("Number of calulations: "+ evaluate);
            //evaluates the comparison - asking for feet and inches and operation
            for(int i = 0; i<evaluate; i++){
                System.out.print("First number: ");
                feet1 = read.nextFloat();
                System.out.println(feet1);
                feet1 = feet1*12;
                System.out.print("Second number: ");
                inch1 = read.nextFloat();
                System.out.println(inch1);
                inch1 = inch1+feet1;
                System.out.print("Operation: ");
                x =read.next();
                System.out.println(x);
                System.out.print("Third number: ");
                feet2 = read.nextFloat();
                System.out.println(feet2);
                feet2 = feet2*12;
                System.out.print("Fourth number: ");
                inch2 = read.nextFloat();
                System.out.println(inch2);
                inch2 = inch2+feet2;
                //prints out true or false based on comparing the 2 values 
                if(x.equals("gt")){
                    System.out.println(inch1>inch2);
                }
                else if(x.equals("lt")){
                    System.out.println(inch1<inch2);
                }
                else if(x.equals("gte")){
                    System.out.println(inch1>=inch2);
                }
                else if(x.equals("lte")){
                    System.out.println(inch1<=inch2);
                }
                else{
                    System.out.println("Error message - Undefined Operation");
                }
            }
        }//Prints out error if error is caught
        catch(Exception e){
            System.err.println("Exception occured "+ e);
        }
    }
}
                
        