public class CheckAnswer {
    public static void main(String[] args) {
        char[] key={'D','B','D','C','C','D','A','E','A','D'};
        char[][]answer={{'A','B','A','C','C','D','E','E','A','D'},
                        {'D','B','A','B','C','A','E','E','A','D'},
                        {'E','D','D','A','C','B','E','E','A','D'},
                        {'C','B','E','A','D','C','E','E','A','D'},
                        {'A','B','D','C','C','D','E','E','A','D'},
                        {'B','B','E','C','C','D','E','E','A','D'},
                        {'B','B','A','C','C','D','E','E','A','D'},
                        {'E','B','E','C','C','D','E','E','A','D'},
        };
        int count;
        int correctAnswersCount[]=new int[10];
        for (int i=0;i<answer.length;i++){
            count=0;
            for (int j=0;j<answer[i].length;j++){
                if (key[j]==answer[i][j]){
                    count++;
                }

            }
            System.out.println("student:"+(i+1)+" correct answer is:"+count);
        }
        System.out.println("**********************************************************");
       for (int i=0;i<correctAnswersCount.length;i++){
           for (int j=0;j<answer.length;j++){
               if (answer[j][i]==key[i]){
                   correctAnswersCount[i]++;
               }
           }
           System.out.println(correctAnswersCount[i]+ " student answered "+(i+1)+".question correctly");
       }

    }
}
