package academy.mate;
// Студенти повинні вміти обрати Старосту за особистими якостями одногрупників (правила відбору визначаєте Ви).
// Програма повинна виводити Старосту групи в консоль;

public class Student {
    private String name;
    private String surname;
    private boolean senior;
    private int IQ;

    public Student(String name, String surname, int IQ) {
        this.name = name;
        this.surname = surname;
        this.IQ = IQ;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public boolean getSenior() {
        return senior;
    }

    public void setSenior(boolean senior) {
        this.senior = senior;
    }

    public int getIQ() {
        return IQ;
    }
}
