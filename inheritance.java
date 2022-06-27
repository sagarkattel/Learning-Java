class Car{  
    void drive(){System.out.println("driving...");}  
    }  
    class bus extends Car{  
    void stop(){System.out.println("stopping...");}  
    }  
    class inheritance{  
    public static void main(String args[]){  
    bus b=new bus();  
    b.drive();  
    b.stop();  
    }}  