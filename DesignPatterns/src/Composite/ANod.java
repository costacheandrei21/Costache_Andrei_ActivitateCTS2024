package Composite;

public abstract class ANod {
    public abstract String getDenumire();
    public abstract int getPret();
    public String getInfo(){
        return this.getDenumire() + " " + this.getPret();
    }
    public void adaugaNod(ANod elemStructura){
        throw new UnsupportedOperationException();
    }
    public void stergeNod(ANod elemStructura){
        throw new UnsupportedOperationException();
    }
    public ANod getNod(int i){
        throw new UnsupportedOperationException();
    }
}
