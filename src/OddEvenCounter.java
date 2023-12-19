import java.sql.SQLOutput;
import java.util.Scanner;

public class OddEvenCounter {
    public static void main(String[] args) {
        int firstnumber;
        int secondnumber;
        int smallnumber;
        int largenumber;
        int choice;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number:");
        firstnumber=input.nextInt();
        System.out.println("Enter the second number:");
        secondnumber=input.nextInt();
        if (firstnumber<secondnumber){
            smallnumber=firstnumber;
            largenumber=secondnumber;
        } else if (firstnumber>secondnumber) {
            smallnumber=secondnumber;
            largenumber=firstnumber;
        }
        else{
            largenumber=secondnumber;
            smallnumber=secondnumber;
        }
        System.out.println("If you want to count numbers press 1 for odd, press 2 for even numbers");
        choice=input.nextInt();
        LoopBased(smallnumber,largenumber,choice);
        System.out.println();
        MathBased(smallnumber,largenumber,choice);

    }

    public static void LoopBased(int smallnumber, int largenumber, int choice) {
        int evencounter=0;
        int oddcounter=0;
        for (int i=smallnumber;i<=largenumber;i++){
            if(Math.abs(i%2)==0){
                evencounter++;
            }
            else oddcounter++;
        }
        if (choice==1){
            System.out.printf("loop based result: The number of odd in range [%d,%d]="+oddcounter,smallnumber,largenumber);
        } else if (choice==2) {
            System.out.printf("loop based result: The number of even in range [%d,%d]="+evencounter,smallnumber,largenumber);
        }
        else System.out.println("Please press 1 or 2");
    }
    public static void MathBased(int smallnumber,int largenumber,int choice){
        int firstnumber=Math.abs(smallnumber);
        int secondnumber=Math.abs(largenumber);
        int oddcounter=0;
        int evencounter=0;
        if(firstnumber%2==0&&secondnumber%2==0){
            oddcounter=(largenumber-smallnumber)/2;
            evencounter=oddcounter+1;
        } else if (firstnumber%2==0&&secondnumber%2!=0) {
            evencounter=(largenumber-smallnumber)/2+1;
            oddcounter=evencounter;
        } else if (firstnumber%2!=0&&secondnumber%2!=0) {
            evencounter=(largenumber-smallnumber)/2;
            oddcounter=evencounter+1;
        }
        else  {
            evencounter=(largenumber-smallnumber)/2+1;
            oddcounter=evencounter;
        }

        if (choice==1){
            System.out.printf("math based result: The number of odd in range [%d,%d]="+oddcounter,smallnumber,largenumber);
        } else if (choice==2) {
            System.out.printf("math based result: The number of even in range [%d,%d]="+evencounter,smallnumber,largenumber);
        }
        else System.out.println("Please press 1 or 2");
    }

}
