package academy.mate;

import java.util.ArrayList;
import java.util.Random;

public class Group {

    private int groupNumber;
    private int defaultStudentsCount;
    private ArrayList<Student> studentList;

    public Group(int groupNumber, int defaultStudentsCount) {
        this.groupNumber = groupNumber;
        this.defaultStudentsCount = defaultStudentsCount;
        this.studentList = generateStudentsList(defaultStudentsCount);
    }

    private ArrayList<Student> generateStudentsList(int studentsCount) {
        ArrayList<Student> studentList = new ArrayList<>(studentsCount);
        for (int i = 0; i < studentsCount; i++) {
            String name = ConstantsNames.nameList[new Random().nextInt(ConstantsNames.nameList.length)];
            String surname = ConstantsNames.surnamesList[new Random().nextInt(ConstantsNames.surnamesList.length)];
            studentList.add(new Student(name, surname, new Random().nextInt(70) + 100));
        }
        return studentList;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int getDefaultStudentsCount() {
        return defaultStudentsCount;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    Student chooseRandomSenior(ArrayList<Student> list) {
        int seniorNumber = new Random().nextInt(list.size() + 1);
        Student student = list.get(seniorNumber);
        student.setSenior(true);
        System.out.println("Senior of group " + groupNumber + " is " + list.get(seniorNumber).getSurname() + " " + list.get(seniorNumber).getName());
        return student;
    }

    Student chooseSeniorBiggerIQ(ArrayList<Student> list) {
        int biggerIQ = 0;
        int seniorNumber = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIQ() > biggerIQ) {
                biggerIQ = list.get(i).getIQ();
                seniorNumber = i;
            }
        }
        list.get(seniorNumber).setSenior(true);
        System.out.println("Senior (IQ) of group " + groupNumber + " is " + list.get(seniorNumber).getSurname() + " " + list.get(seniorNumber).getName());
        return list.get(seniorNumber);
    }
}
