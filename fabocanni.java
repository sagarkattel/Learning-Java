public class fabocanni {
    public static void main(String[] args){
        int a=0;
        int b=1,s;
        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);
        for (int i=1;i<=10;i++)
        {
            s=a+b;
            System.out.print(" ");
            System.out.print(s);
            a=b;
            b=s;

        }
    }
}
