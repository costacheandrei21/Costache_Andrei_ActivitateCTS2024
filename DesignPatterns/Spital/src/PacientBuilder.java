public class PacientBuilder implements IBuilder{
    private Pacient pacient;
    public PacientBuilder(){
        pacient = new Pacient("Cristi",false,false,false,false);
    }
    @Override
    public Pacient build() {
        return pacient;
    }
    public PacientBuilder setNumePacient(String numePacient){
        this.pacient.setNumePacient(numePacient);
        return this;
    }
    public PacientBuilder setPatRabatabil(boolean patRabatabil){
        this.pacient.setPatRabatabil(patRabatabil);
        return this;
    }
    public PacientBuilder setMicDejun(boolean micDejun){
        this.pacient.setMicDejun(micDejun);
        return this;
    }
    public PacientBuilder setPapuci(boolean papuci){
        this.pacient.setPapuci(papuci);
        return this;
    }
    public PacientBuilder setHalat(boolean halat){
        this.pacient.setHalat(halat);
        return this;
    }
}
