package prog2.model;

public abstract class Allotjament implements InAllotjament{
    private String nom;
    private String idAllotjament;
    private long estadaMinimaBAIXA;
    private long estadaMinimaALTA;

    public Allotjament(String nom, String idAllotjament, long estadaMinimaALTA, long estadaMinimaBAIXA){
        setNom(nom);
        setId(idAllotjament);
        this.estadaMinimaBAIXA = estadaMinimaBAIXA;
        this.estadaMinimaALTA = estadaMinimaALTA;
    }

    public String getNom(){return nom;}
    public void setNom(String nom){this.nom = nom;}

    public String getId() {return idAllotjament;}
    public void setId(String id){idAllotjament = id;}

    public long getEstadaMinima(Temp temp){
        switch (temp.ordinal()){
            case(0):
                return estadaMinimaALTA;
            case(1):
                return estadaMinimaBAIXA;
        }
        return -1;
    }
    public void setEstadaMinima(long estadaMinimaALTA_, long estadaMinimaBAIXA_){
        this.estadaMinimaALTA = estadaMinimaALTA_;
        this.estadaMinimaBAIXA = estadaMinimaBAIXA_;
    }

    public String toString(){
        return ("Nom="+ getNom() + ", Id=" + getId() + ", estada mínima en temp ALTA: "+ getEstadaMinima(Temp.ALTA) + ", estada mínima en temp BAIXA: " + getEstadaMinima(Temp.BAIXA) + ".");
    }
}