package SustinereExamane.Clase;

public class Student {
    private int id;
    private String nume;
    private int an;
    private String email;

    public Student(int id, String nume, String email, int an ) {
        this.id = id;
        this.nume = nume;
        this.an = an;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", an=" + an +
                ", email='" + email + '\'' +
                '}';
    }

}