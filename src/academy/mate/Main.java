package academy.mate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Сколько групп студентов вы хотите создать?");
        Scanner scanner = new Scanner(System.in);
        int groupCount = scanner.nextInt();
        Main main = new Main();
        ArrayList<Group> groups = main.createGroups(groupCount);

//        groups.forEach(group -> group.chooseRandomClassPresident(group.getStudentList())); //random ClassPresident
        groups.forEach(group -> group.chooseClassPresidentIQ(group.getStudentList())); //ClassPresident with bigger IQ

        Professor professor = new Professor();
        groups.forEach(professor::rollCall);

    }

    private ArrayList<Group> createGroups(int groupCount) {
        ArrayList<Group> groups = new ArrayList<>(groupCount);
        for (int i = 0; i < groupCount; i++) {
            groups.add(new Group(i + 1, new Random().nextInt(20) + 21));
        }
        for (Group group : groups) {
            group.getStudentList().sort(Comparator.comparing(Student::getSurname));
        }
        return groups;
    }


}

