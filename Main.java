 class student{
    String name;
    int rollno;
    void getmethod(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    void printmethod(){
        System.out.println("name:"+name+" rollno:"+rollno);
    }
};
public class Main
{
	public static void main(String[] args) {
		student obj=new student();
		obj.getmethod("Ram",25);
		obj.printmethod();
	}
}