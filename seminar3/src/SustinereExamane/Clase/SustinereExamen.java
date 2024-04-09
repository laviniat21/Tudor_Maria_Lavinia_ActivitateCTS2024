package SustinereExamane.Clase;

import java.util.HashMap;
import java.util.Map;

public class SustinereExamen {
    private String numeExamen;
    Map<Integer, Student> listaStudenti=new HashMap<>();

    public SustinereExamen(String numeExamen) {
        this.numeExamen = numeExamen;
    }

    public String getNumeExamen() {
        return numeExamen;
    }

    public Map<Integer, Student> getListaStudenti() {
        return listaStudenti;
    }

    public void inregistrareStudent(Student student){
        if(listaStudenti.containsKey(student.getId())){
            System.out.println("Studentul " + student.getNume() + " nu are voie sa sustina examenul");
        } else {
            listaStudenti.put(student.getId(), student);
            System.out.println("Studentul " + student.getNume() + " sustine examenul acum");
        }
    }


}
