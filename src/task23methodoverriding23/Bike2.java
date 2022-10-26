package task23methodoverriding23;

public class Bike2 extends Vehicle{
    public void run(){
        System.out.println("Bike is running");}

        public static void main(String [] args){
            Bike2 obj= new Bike2();
            obj.run();


        }

    }
