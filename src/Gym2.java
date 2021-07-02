import MembersAndTrainers.Member;
import MembersAndTrainers.Trainer;

import java.util.List;

/*Программа учёта трениров и клиентов, может присваивать клиентам тренировки представленные в каталоге зала,
* также рассчитывать общую стоимость для определённого клиента и зарплату для определённого тренера.
* При приобретении новых видов тренировок, программу очень легко модернизировать, путём
* наследования от класса GroopActivities.
*
* Добавить тренеров или клиентов можно в классе ArraysTAndM, также в этом классе можно добавить тренировки клиентам.
*
* Далее планируется сделать считку данных из excel таблиц*/

public class Gym2 {

    public static void main(String[] args) {
        getInfoMembers(ArraysTAndM.getMembers()); //Эти два метода вызывать только в таком порядке, иначе не происходит записи
        getInfoTrainers(ArraysTAndM.getTrainers()); //тренировок для тренеров
        getGymProfit(ArraysTAndM.getTrainers(), ArraysTAndM.getMembers());
    }

    //Выводит общую информацию всех тренеров
    public static void getInfoTrainers(List<Trainer> trainers) {
        System.out.println("Тренерский состав зала:\n");

        for (Trainer trainer : trainers) {
            trainer.showInfo();
        }

        System.out.println("-------------------------------------------------");
    }

    //Выводит общую информацию всех клиентов
    public static void getInfoMembers(List<Member> members) {
        System.out.println("Информация о клентах:\n");

        for (Member member : members) {
            System.out.println("ID: " + members.indexOf(member));
            member.showInfo();
        }

        System.out.println("-------------------------------------------------");
    }

    //Выводит доходы, расходы и прибыль зала
    public static void getGymProfit(List<Trainer> trainers, List<Member> members) {
        double costs = 0;
        double income = 0;

        for (Trainer trainer : trainers) {
            costs += trainer.calculateSalary();
        }
        for (Member member : members) {
            income += member.calculateCost();
        }

        double profit = income - costs;
        System.out.printf("Доходы зала: %.2f%nРасходы зала: %.2f%nПрибыль: %.2f%n%n", income, costs, profit);
    }

}


