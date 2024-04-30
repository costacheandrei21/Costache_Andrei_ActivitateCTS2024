public class Program {
    public static void main(String[]args){
        PacientBuilder pacientBuilder = new PacientBuilder();
        Pacient pacient = pacientBuilder.setNumePacient("Cristi").setHalat(true).setMicDejun(true).setPatRabatabil(false)
                .setPapuci(true).build();
        System.out.println(pacient);

    }
}
