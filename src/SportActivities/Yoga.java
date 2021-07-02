package SportActivities;

import MembersAndTrainers.Trainer;

public class Yoga extends GroopActivities implements Coast {
    private double complexity = 1.1;//коэффициент сложности тренировки.

    public Yoga(int visits, Trainer trainer) {
        super(visits, trainer);
    }

    @Override
    public double calculateCost() {
        return getBasicCOAST() * complexity * getVisits();
    }
}
