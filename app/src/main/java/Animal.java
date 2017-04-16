/**
 * Created by Nila Elumalai on 4/15/2017.
 */

public class Animal {

    //for now, this is a pig haha

    //health represents the percentage of the budget that has already been used
    private int health;

    public Animal(){
        health = 100;
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int h){
        health = h;
        determineState();
    }

    public void determineState(){

    }


}
