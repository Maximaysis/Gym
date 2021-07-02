package SportActivities;

import MembersAndTrainers.Trainer;

public class Boxing extends GroopActivities implements Coast  {
    private double complexity = 1.5;//коэффициент сложности тренировки.

    public Boxing(int visits, Trainer trainer) {
        super(visits, trainer);
    }

    @Override
    public double calculateCost() {
        return getBasicCOAST() * complexity * getVisits();
    }
}
