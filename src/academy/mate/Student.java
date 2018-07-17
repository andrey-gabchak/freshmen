package academy.mate;
// Студенти повинні вміти обрати Старосту за особистими якостями одногрупників (правила відбору визначаєте Ви).
// Програма повинна виводити Старосту групи в консоль;

public class Student {
    private String name;
    private String surname;
    private boolean classPresident;
    private int IQ;
    private boolean presence;

    public Student(String name, String surname, int IQ, boolean presence) {
        this.name = name;
        this.surname = surname;
        this.IQ = IQ;
        this.presence = presence;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public boolean isClassPresident() {
        return classPresident;
    }

    public void setClassPresident(boolean classPresident) {
        this.classPresident = classPresident;
    }

    public int getIQ() {
        return IQ;
    }

    public boolean isPresence() {
        return presence;
    }
}
