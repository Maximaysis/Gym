import MembersAndTrainers.Сatalog;
import MembersAndTrainers.Member;
import MembersAndTrainers.Trainer;

import java.util.ArrayList;
import java.util.List;

class ArraysTAndM {
    private static List<Trainer> trainers = new ArrayList<>();
    private static List<Member> members = new ArrayList<>();
    private static boolean start1 = true; //Две переменные вводятся предотвращают повторное создание массива.
    private static boolean start2 = true;

    public static List<Trainer> getTrainers() {
        if(start1) {
            trainers.add(new Trainer("Борис Елисеев", 28, 6));
            trainers.add(new Trainer("Анна Лябедева", 27, 3));
            trainers.add(new Trainer("Артём Шноль", 29, 2));
            trainers.add(new Trainer("Даниил Сафонов", 23, 4));
            trainers.add(new Trainer("Хабиб Малышев", 32, 9));
            start1 = false;
        }
        return trainers;
    }

    //Заполняет массив клиентов и проставляет им тренировки
    public static List<Member> getMembers() {
        if (start2) {
            members.add(new Member("Дмитрий Голубев", 21, getTrainers().get(0)));
            members.get(0).addSportActivities(Сatalog.YOGA, 3);
            members.get(0).addSportActivities(Сatalog.SWIMMING, 2);

            members.add(new Member("Лера Пумба", 21, getTrainers().get(0)));
            members.get(1).addSportActivities(Сatalog.YOGA, 3);

            members.add(new Member("Евгений Кочин", 21, getTrainers().get(0)));
            members.get(2).addSportActivities(Сatalog.SWIMMING, 2);
            members.get(2).addSportActivities(Сatalog.YOGA, 3);

            members.add(new Member("Авраам Линкольн", 21, getTrainers().get(1)));
            members.get(3).addSportActivities(Сatalog.BOXING, 2);

            members.add(new Member("Салам Голубям", 21, getTrainers().get(2)));
            members.get(4).addSportActivities(Сatalog.YOGA, 3);

            members.add(new Member("Олег Жемчужный", 21, getTrainers().get(2)));
            members.get(5).addSportActivities(Сatalog.BOXING, 2);
            members.get(5).addSportActivities(Сatalog.SWIMMING, 2);

            members.add(new Member("Стас Антонов", 21, getTrainers().get(1)));
            members.get(6).addSportActivities(Сatalog.BOXING, 3);

            members.add(new Member("Лев Странный", 21, getTrainers().get(3)));
            members.get(7).addSportActivities(Сatalog.SWIMMING, 2);

            members.add(new Member("Арматура Колесникова", 21, getTrainers().get(4)));
            members.get(8).addSportActivities(Сatalog.YOGA, 3);

            members.add(new Member("Светлана Лежнова", 21, getTrainers().get(4)));
            members.get(9).addSportActivities(Сatalog.SWIMMING, 2);

            members.add(new Member("Сергей Тесёлкин", 31, getTrainers().get(4)));
            members.get(10).addSportActivities(Сatalog.YOGA, 3);
            members.get(10).addSportActivities(Сatalog.SWIMMING, 2);
            members.get(10).addSportActivities(Сatalog.BOXING, 1);

            start2 = false;
        }

        return members;
    }
}
