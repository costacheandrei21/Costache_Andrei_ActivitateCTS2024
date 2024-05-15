package Spital.Singleton;

import java.util.ArrayList;
import java.util.List;

public class Cuptor {
    private static Cuptor instance = null;
    private List<Preparat> listaAsteptare = null;
    private int gradeMaxim;
    private Cuptor(int gradeMaxim){
        this.listaAsteptare = new ArrayList<>();
        this.gradeMaxim = gradeMaxim;
    }
    public static Cuptor getInstance(int gradeMaxim){
        if(instance == null){
            instance = new Cuptor(gradeMaxim);
        }
        return instance;
    }
    public void addPreparat(Preparat preparat){
        if(preparat != null){
            this.listaAsteptare.add(preparat);
        }
    }

    @Override
    public String toString() {
        return "Cuptor{" +
                "listaAsteptare=" + listaAsteptare +
                ", gradeMaxim=" + gradeMaxim +
                '}';
    }
}
