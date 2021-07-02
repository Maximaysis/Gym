package SportActivities;

import MembersAndTrainers.Trainer;

public class Swimming extends GroopActivities implements Coast {
    private double complexity = 1.2;//коэффициент сложности тренировки.

    public Swimming(int visits, Trainer trainer) {
        super(visits, trainer);
    }

    @Override
    public double calculateCost() {
        return getBasicCOAST() * complexity * getVisits();
    }
}
