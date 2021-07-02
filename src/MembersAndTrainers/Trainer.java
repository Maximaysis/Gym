package MembersAndTrainers;


public class Trainer implements Info {
    private String name;
    private int age;
    private int experience; //Если тренер отработал 4 лет и более, его зарплата возрастает, также возрастает и стоимость тренировок.
    private int countWorkouts = 0;
    private double salary;


    public Trainer(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }


    //Без модификатора доступа, так как доступ нужен только в класс Member
    void setCountWorkouts(int countWorkouts) {
        this.countWorkouts += countWorkouts;
    }

    public int getExperience() {
        return experience;
    }

    public String getName() {
        return name;
    }

    //Рассчитывает зарплату тренера взависимости от  количества проведённых трениров и опыта.
    public double calculateSalary() {
        salary = 450 * countWorkouts;

        if (experience >= 4) {
            return salary * 1.6;
        } else {
            return salary;
        }
    }


    @Override
    public void showInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Стаж: " + experience + " лет");
        System.out.printf("Зарплата: %.2fр. %n%n", calculateSalary());
    }
}
