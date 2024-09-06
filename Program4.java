//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner;

class Program4{
    public static void main(String [] args){
        //make scanner
        Scanner myScanner = new Scanner(System.in);
        //create variables 
        int num1=0;
        int num2=0;
        int num3=0;
        int num4=0;
        int sum=0;
        double avrg=0.00; 
        //sk for input and store
        System.out.println("Enter Number 1: ");
        num1= myScanner.nextInt();
        System.out.println("Enter Number 2: ");
        num2= myScanner.nextInt();
        System.out.println("Enter Number 3: ");
        num3= myScanner.nextInt();
        System.out.println("Enter Number 4: ");
        num4= myScanner.nextInt();
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
Enter Number 1: 
475
Enter Number 2: 
821
Enter Number 3: 
369
Enter Number 4: 
562
The sum of the 4 numbers is 2227

The average of the 4 numbers is 556.75
*/
