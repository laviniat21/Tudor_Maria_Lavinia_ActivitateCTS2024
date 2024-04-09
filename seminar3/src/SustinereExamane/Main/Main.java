package SustinereExamane.Main;

import SustinereExamane.Clase.Student;
import SustinereExamane.Clase.SustinereExamen;

public class Main {
    public static void main(String[] args) {
        Student student1=new Student(1,"Albert", "Albert1",2);
        Student student2=new Student(2,"Ioana","Ioana2",2);
        Student student3=new Student(3,"Ionescu", "Ionescu3",2);
        Student student4=new Student(4,"Popa","Popa4",2);

        SustinereExamen poo=new SustinereExamen("POO");
        SustinereExamen cts=new SustinereExamen("CTS");

        poo.inregistrareStudent(student1);
        poo.inregistrareStudent(student2);
        poo.inregistrareStudent(student1);
        poo.inregistrareStudent(student3);
        poo.inregistrareStudent(student4);

        cts.inregistrareStudent(student3);
        cts.inregistrareStudent(student4);
        cts.inregistrareStudent(student1);
        cts.inregistrareStudent(student3);
    }
}