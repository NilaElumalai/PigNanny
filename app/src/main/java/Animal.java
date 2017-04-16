/**
 * Created by Nila Elumalai on 4/15/2017.
 */
import android.view.View;
import android.widget.ImageView;
import android.R.id;

import com.example.nilaelumalai.pignanny.R;

public class Animal{
    //for now, this is a pig haha

    //health represents the percentage of the budget that has already been used
    private int health;
    private final int HEALTH1 = 25;
    private final int HEALTH2 = 50;
    private final int HEALTH3 = 75;
    private final int HEALTH4 = 100;
    private final int SICK1 = 110;
    private final int SICK2 = 120;
    private final int SICK3 = 130;

    private String name;

    public int getHealth(){
        return health;
    }

    public void setHealth(int h){
        health = h;
    }

    public Animal(){
        health = 0;

        ImageView theImageView = (ImageView) mainscreen.findViewById(R.id.imageView2);

        theImageView.setImageDrawable(R.drawable.healthypig1);
    }

    public void determineState(){
        ImageView theImageView = (ImageView) view.findViewById(R.id.imageView2);

        if(health <= HEALTH1){
            theImageView.setImageDrawable(R.drawable.healthypig1);
        } else if(health <= HEALTH2){
            theImageView.setImageDrawable(R.drawable.healthypig2);
        } else if(health <= HEALTH3){
            theImageView.setImageDrawable(R.drawable.healthypig3);
        } else if(health <= HEALTH4){
            theImageView.setImageDrawable(R.drawable.healthypig4);
        } else if(health <= SICK1){
            theImageView.setImageDrawable(R.drawable.sickpig1);
        } else if(health <= SICK2){
            theImageView.setImageDrawable(R.drawable.sickpig2);
        } else if(health <= SICK3){
            theImageView.setImageDrawable(R.drawable.sickpig3);
        }
    }

    public void setName(String toSet){
        name = toSet;
    }

    public String returnName(){
        return name;
    }
}