package SportActivities;

import MembersAndTrainers.Trainer;

//Класс описывающий тренировочные секции
public class GroopActivities {
    private int visits;
    private Trainer trainer;
    private final int COAST1 = 500; //Базовая стоимость тренировки
    private final int COAST2 = 800; //Базовая стоимость тренировки

    public GroopActivities(int visits, Trainer trainer) {
        this.visits = visits;
        this.trainer = trainer;
    }

    int getBasicCOAST() {
        if (trainer.getExperience() < 5) {
            return COAST1;
        } else {
            return COAST2;
        }
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public int getVisits() {
        return visits;
    }
}
