import javax.swing.*;
import java.util.Scanner;

public class lab6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String line="12321";
        line=input.nextLine();
        line=line.toUpperCase();
        int lenght=line.length();
        boolean polindrom=true;
        for (int i=0;i<lenght;i++){
            if (i<lenght-(i+1)) {
                if (line.charAt(i)==line.charAt(lenght-(i+1))){
                    polindrom=true;
                }
                else {
                    polindrom=false;
                    break;
                }
            }
            else {
                break;
            }
        }
        System.out.println(line+" "+" is a polindrom:"+polindrom);
        System.out.println(line+" "+" is a polindrom:"+polindrom);

    }
}
