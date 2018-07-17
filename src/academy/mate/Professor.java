package academy.mate;

// Професор має вміти провести перекличку та визначити, чи всі студенти присутні (результат виводиться в консоль);

import java.util.ArrayList;

public class Professor {

    public int rollCall (ArrayList<Student> list) {
        list.forEach(student -> System.out.println(student.getSurname() + " " + student.getName()));
        return list.size();
    }

    public boolean isPrestentAll (int defaultStudentsCount, int currentCount) {
        int numberOfAbsentees = defaultStudentsCount - currentCount;
        if (numberOfAbsentees == 0) {
            return true;
        }
        System.out.println("Number of absentees: " + numberOfAbsentees);
        return false;
    }
}
