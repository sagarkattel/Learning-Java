import java.util.Scanner;
public class areacircle {
    public static void main(String[] args){
    final float pi=3.14f;
    Scanner sc = new Scanner(System.in);
    System.out.println("ENter the radius");
    float r=sc.nextFloat();
    float a=pi*r*r;
    System.out.println("The area of circle is "+a);
}
}

