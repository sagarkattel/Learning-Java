import java.util.Scanner;



public class Mainn

{

 public static void main(String[]args)

 {



Scanner obj = new Scanner(System.in);

int size;



System.out.print("Enter the size of array :- ");

size = obj.nextInt();

int i;

int array[]= new int[size];





for(i=0; i<array.length; i++)

{

System.out.print("Enter the "+ i +"th element :- ");

array[i] = obj.nextInt();



}



int no;

int pos = -1;



System.out.print("Enter the no u want to search :- ");

no = obj.nextInt();



for(i=0; i<array.length; i++)

{

if(no == array[i])

{

pos =i;



}

}



System.out.println("Output = " +pos);

  

}



}