package academy.mate;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    //group list
    public static void main(String[] args) {
        System.out.println("Сколько групп студентов вы хотите создать?");
        Scanner scanner = new Scanner(System.in);
        int groupCount = scanner.nextInt();
        Main main = new Main();
        ArrayList<Group> groups = main.createGroups(groupCount);
        for (int i = 0; i < groups.size(); i++) {
            Group group = groups.get(i);
            System.out.println("Группа № " + group.getGroupNumber());
            for (int j = 0; j < group.getStudentList().size(); j++) {
                System.out.println(group.getStudentList().get(i).getSurname()+ " " + group.getStudentList().get(i).getName() + " " + group.getStudentList().get(i).getIQ());
            }
        }

//        groups.forEach(group -> group.chooseRandomSenior(group.getStudentList())); //random senior
        groups.forEach(group -> group.chooseSeniorBiggerIQ(group.getStudentList())); //senior with bigger IQ


    }

    private ArrayList<Group> createGroups(int groupCount) {
        ArrayList<Group> groups = new ArrayList<>(groupCount);
        int defaultStudentsCount = new Random().nextInt(20) + 21;
        for (int i = 0; i < groupCount; i++) {
            Group group = new Group(i + 1, defaultStudentsCount);
        }
        return groups;
    }


}

