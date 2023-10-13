public class Patente {
    private String scadPat;


    public Patente(String scadPat){
        this.scadPat = scadPat;
    }

    public Patente(Patente that){
        this.scadPat = that.scadPat;
    }

    public Patente(){
        this.scadPat = "1/1/2000";
    }


    public String getscadPat(){
        return this.scadPat;
    }

    public void setscadPat(){
        this.scadPat = scadPat;
    }
}