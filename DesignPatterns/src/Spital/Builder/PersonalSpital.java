package Spital.Builder;

public class PersonalSpital extends APersonalSpital{
    public PersonalSpital(String numePersonal, ETipPersonal tipPersonal) {
        super(numePersonal, tipPersonal);
    }

    @Override
    public String toString() {
        return "PersonalSpital{}";
    }
}
