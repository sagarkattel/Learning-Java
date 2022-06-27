import java.util.Scanner;
public class linearsearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int[] a=new int[size];
        for(int j=0;j<size;j++)
        {
            System.out.println("ENter the element at array "+j);
            a[j]=sc.nextInt();
        }
        System.out.println("ENter the no to be searched ");
        int x=sc.nextInt();
        int c=0;
        for(int i=0;i<size;i++)
        {
            if (a[i]==x){
                System.out.println("THe elemenet is found at index "+i);
                c++;
                break;
            }
        }
        if (c==0){
            System.out.println("The element Cannot be found");
        }
    }
}
