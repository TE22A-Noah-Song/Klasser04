public class WhiteCollar extends Worker{
    //methods

    //constructor
    public WhiteCollar(String name, int age){
        super(name, age);
    }

    protected void drinkCoffee(){
        System.out.println("Worker drinks a nice coffee!");
    }

    protected void attendMeeting(){
        System.out.println("Worker attends a meeting!");
    }

    protected void doSpreadSheets(){
        System.out.println("Worker does a spreadsheet!");
    }
}
