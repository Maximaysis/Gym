package MembersAndTrainers;

import SportActivities.*;

public class Member implements Info, Coast {
    private String name;
    private int age;
    private double coast = 0;
    private Trainer trainer;

    public Member(String name, int age, Trainer trainer) {
        this.name = name;
        this.age = age;
        this.trainer = trainer;
    }

    //Добавляет клиенту зала определённую тренировку и количество посящений на неё.
    //Также изменяет кол-во проведённых тренером тренировок.
    public void addSportActivities(Сatalog сatalog, int visits) {
        switch (сatalog) {
            case YOGA:
                Yoga yoga = new Yoga(visits,trainer);
                coast += yoga.calculateCost();
                break;
            case SWIMMING:
                Swimming swimming = new Swimming(visits, trainer);
                coast += swimming.calculateCost();
                break;
            case BOXING:
                Boxing boxing = new Boxing(visits, trainer);
                coast += boxing.calculateCost();
                break;
        }
        trainer.setCountWorkouts(visits);
    }

    @Override
    public void showInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Тренер: " + trainer.getName());
        System.out.printf("Стоимость тренировок составляет: %.2fр. %n%n", calculateCost());
    }

    @Override
    public double calculateCost() {
        return coast;
    }
}
