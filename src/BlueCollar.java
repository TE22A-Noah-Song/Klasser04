public class BlueCollar extends Worker{
    //methods

    //constructor
    public BlueCollar(String name, int age){
        super(name, age);
    }


    protected void build(){
        System.out.println("Worker builds a house!");
    }

    protected void repair(){
        System.out.println("Worker repairs a broken house!");

    }

    protected void destroy(){
        System.out.println("Worker destroys a house!");

    }
}

