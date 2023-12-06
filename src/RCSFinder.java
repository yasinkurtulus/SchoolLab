import java.util.Scanner;

public class RCSFinder {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int counter=0;
        String line;
        System.out.println("Enter text: ");
        line=input.nextLine();
       // line = line.toLowerCase();
        String vowels = "aeiuoAEIUO";
        String constant = "bcdfghjklmnprstvyzxwqBCDFGHJKLMNPRSTVYUZXWQ";
        String currentline;
        int firstIndex;
        int secondIndex=0;
        int currentIndex = 0;
        for (int a = 0; a < line.length() - 1; a++) {
            String newline = line.substring(a);
          //  System.out.println(newline);
            for (int b = 0; b < newline.length(); b++) {
                // String ch= String.valueOf(newline.charAt(b));
                char ch = newline.charAt(b);
                if (b+1< newline.length())
                secondIndex=b+1;
               // System.out.println(ch);
                    if (vowels.contains(String.valueOf(ch))) {
                        if (constant.contains(String.valueOf(newline.charAt(secondIndex)))) {
                            if (newline.substring(0,secondIndex+1).length()>=3){
                                if (newline.charAt(0)=='i'){
                                    System.out.println("I"+newline.substring(1,secondIndex+1).toLowerCase());
                                counter++;}
                                else {
                                System.out.println(newline.substring(0,1).toUpperCase()+newline.substring(1,secondIndex+1).toLowerCase());
                               // System.out.println(newline.substring(0,secondIndex+1));
                                counter++;}
                            }
                        }
                        else {
                            break;
                        }
                        // System.out.println("sesli harf");
                    } else if (constant.contains(String.valueOf(ch))) {
                        if (vowels.contains(String.valueOf(newline.charAt(secondIndex)))){
                            if (newline.substring(0,secondIndex+1).length()>=3){
                                if (newline.charAt(0)=='i'){
                                    System.out.println("I"+newline.substring(1,secondIndex+1).toLowerCase());
                                    counter++;}
                                else {
                                    System.out.println(newline.substring(0,1).toUpperCase()+newline.substring(1,secondIndex+1).toLowerCase());
                                    // System.out.println(newline.substring(0,secondIndex+1));
                                    counter++;}
                            }
                        }
                        else {
                            break;
                        }
                        // System.out.println("Sessiz harf");
                    } else break;
                }
            }
        System.out.println("*"+counter+" RCS are found *");
        }
    }
