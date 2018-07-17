package academy.mate;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Сколько групп студентов вы хотите создать?");
        Scanner scanner = new Scanner(System.in);
        int groupCount = scanner.nextInt();
        Main main = new Main();
        ArrayList<Group> groups = main.createGroups(groupCount);

        //test for filling of groups
        /*for (int i = 0; i < groups.size(); i++) {
            Group group = groups.get(i);
            System.out.println("Группа № " + group.getGroupNumber());
            for (int j = 0; j < group.getStudentList().size(); j++) {
                System.out.println(group.getStudentList().get(j).getSurname()+ " " + group.getStudentList().get(j).getName() + " " + group.getStudentList().get(j).getIQ());
            }
        }*/

//        groups.forEach(group -> group.chooseRandomClassPresident(group.getStudentList())); //random ClassPresident
        groups.forEach(group -> group.chooseClassPresidentIQ(group.getStudentList())); //ClassPresident with bigger IQ

        Professor professor = new Professor();

        for (Group group : groups) {
            int currentStudentCountInGroup = professor.rollCall(group);
            professor.isPrestentAll(group.getDefaultStudentsCount(), currentStudentCountInGroup);
        }
    }

    private ArrayList<Group> createGroups(int groupCount) {
        ArrayList<Group> groups = new ArrayList<>(groupCount);
        for (int i = 0; i < groupCount; i++) {
            groups.add(new Group(i + 1, new Random().nextInt(20) + 21));
        }
        return groups;
    }


}

