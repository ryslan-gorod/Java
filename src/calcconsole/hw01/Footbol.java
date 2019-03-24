package calcconsole.hw01;

public class Footbol {
    public int rezultRezultOfBettings(int firstGoal, int secondGoal, int userFirstGoal,int userSecondGoal){
        int rez;
        rez = (firstGoal == userFirstGoal && secondGoal == userSecondGoal) ? 2:
                (firstGoal > userFirstGoal && secondGoal > userSecondGoal) ||
                        (firstGoal < userFirstGoal && secondGoal < userSecondGoal) ? 1:0;
        return rez;
    }
}
