import java.io.*;

interface Vehicle{
    void changeGear(int a);
    void speedUp(int b);
    void applybrakes(int a);
}
class Bike implements Vehicle{
    int speed;
    int gear;
    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }

    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }

    @Override 
    public void applybrakes(int decrement){
        speed = speed - decrement;
    }
    public void displayStates(){
        System.out.println("Speed : "+ speed + " Gear :"+ gear);
    }
}

public class interfaces{
    public static void main(String args[]){
        Bike yamaha = new Bike();
        yamaha.changeGear(1);
        yamaha.speedUp(20);
        yamaha.applybrakes(10);

        System.out.println("Bike state :");
        yamaha.displayStates();
    }
}