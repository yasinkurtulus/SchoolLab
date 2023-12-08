import java.util.Scanner;

public class Lab9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
    int staffArray=3;
    int[] array=new int[staffArray];
    boolean exit=false;
    int numberEnter;
    int countnumber=0;
    int maxvalue;
    int minvalue;
    while (!exit){
        if (countnumber<array.length) {
            System.out.println();
            System.out.println("Enter an integer, Exit Press 0:");
            numberEnter = input.nextInt();
            if (numberEnter!=0){
            array[countnumber]=numberEnter;
            countnumber++;
                for (int i = 0; i < countnumber; i++)
                    System.out.print(array[i] + (i <= (countnumber - 1) ? ", " : ""));

                System.out.print("] --- ");
                minmax(array,countnumber);
            }
            else {
                exit=true;
            }

        }
        else {
            System.out.println();
            System.out.println("Enter an integer, Exit Press 0:");
            numberEnter = input.nextInt();
            if (numberEnter!=0){
               array=arrayCopy(array);
               array[countnumber]=numberEnter;
               countnumber++;
                System.out.print("Array: [");
                for (int i = 0; i < countnumber; i++)
                    System.out.print(array[i] + (i <= (countnumber - 1) ? ", " : ""));

                System.out.print("] --- ");
                minmax(array,countnumber);
            }
            else exit=true;

        }

    }
    }
    public static  int[] arrayCopy(int[] array1){
        int[] newArray=new int[array1.length+1];
        for (int i=0;i<array1.length;i++){
            newArray[i]=array1[i];
        }
        return newArray;
    }
    public static void minmax(int[] array,int counter){
        int min=999999999;
        int max=0;
        for(int i=0;i<counter;i++){
            if (array[i]>max)
                max=array[i];
            if (array[i]<min)
                min=array[i];
    }
        System.out.println("Min:"+min+" Max:"+max);
  }
}
