//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner;

class Program4{
    public static void main(String [] args){
        //make scanner
        Scanner myScanner = new Scanner(System.in);
        //create variables 
        int num1=475;
        int num2=821;
        int num3=369;
        int num4=562;
        int sum=0;
        double avrg=0.00;         
        //Calculate
        sum= num1+num2+num3+num4;
        avrg= sum/4.0;
        //print output
        System.out.println("The sum of the 4 numbers is " + sum);
        System.out.println();
        System.out.print("The average of the 4 numbers is " + avrg);
    }
}

//Paste console output below:
/*
The sum of the 4 numbers is 2227

The average of the 4 numbers is 556.75
*/

