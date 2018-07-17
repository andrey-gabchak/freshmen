package academy.mate;

import java.util.ArrayList;

public class Professor {

    public void rollCall(Group group) {
        ArrayList<Student> list = group.getStudentList();
        System.out.println("Group number " + group.getGroupNumber() + "\n");
//        list.forEach(student -> System.out.println(student.getSurname() + " " + student.getName()));
        System.out.println(" Is presence today: \n");
        for (Student student : list) {
            if (student.isPresence()) System.out.println(student.getSurname() + " " + student.getName());
        }
        System.out.println("\n Is absent today: \n");
        list.forEach(student -> {
            if (!student.isPresence()) System.out.println(student.getSurname() + " " + student.getName());
        });
    }

}
