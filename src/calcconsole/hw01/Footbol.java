package calcconsole.hw01;

public class Footbol {
    public int getResultOfBettings(int firstTeamGoals, int secondTeamGoals, int userFirstGoal, int userSecondGoal) {
        return (firstTeamGoals == userFirstGoal && secondTeamGoals == userSecondGoal) ? 2 :
                (firstTeamGoals > secondTeamGoals && userFirstGoal > userSecondGoal) ||
                        (firstTeamGoals < secondTeamGoals && userFirstGoal < userSecondGoal) ? 1 : 0;
    }
}
