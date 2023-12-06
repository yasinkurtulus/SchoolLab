public class fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int total=1;
        int c=0;
        System.out.println(a);
        System.out.println(b);
        for (int i=2;i<9;i++){;
            total=a+b;
            a=b;
            b=total;
            System.out.println(total);

        }
    }


}
