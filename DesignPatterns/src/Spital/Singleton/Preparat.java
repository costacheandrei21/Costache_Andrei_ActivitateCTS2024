package Spital.Singleton;

public class Preparat {
    private String denumirePreparat;
    private int timpAlocat;
    private int gradeGatire;

    public Preparat(String denumirePreparat, int timpAlocat, int gradeGatire) {
        this.denumirePreparat = denumirePreparat;
        this.timpAlocat = timpAlocat;
        this.gradeGatire = gradeGatire;
    }
    public String getDenumirePreparat() {
        return denumirePreparat;
    }

    public int getTimpAlocat() {
        return timpAlocat;
    }

    public int getGradeGatire() {
        return gradeGatire;
    }

    @Override
    public String toString() {
        return "Preparat{" +
                "denumirePreparat='" + denumirePreparat + '\'' +
                ", timpAlocat=" + timpAlocat +
                ", gradeGatire=" + gradeGatire +
                '}';
    }
}
