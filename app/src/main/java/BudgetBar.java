/**
 * Created by Nila Elumalai on 4/15/2017.
 */

public class BudgetBar {
    //this budgetbar is going to be represented on the left hand side of the borderpane

    private int budget;
    private int lastMonth;
    public BudgetBar(){

    }

    public int getBudget(){
        return budget;
    }

    public void setBudget(int num){
        budget = lastMonth;
        budget = num;

    }
}
