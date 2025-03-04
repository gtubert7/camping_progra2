package prog2.model;

public abstract class Allotjament implements InAllotjament{
    private String nom;
    private String idAllotjament;
    private long estadaMinimaBAIXA;
    private long estadaMinimaALTA;

    public Allotjament(String nom, String idAllotjament){
        setNom(nom);
        setId(idAllotjament);
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
        return 0;
    }
    public void setEstadaMinima(long estadaMinimaALTA_, long estadaMinimaBAIXA_){
        this.estadaMinimaALTA = estadaMinimaALTA_;
        this.estadaMinimaBAIXA = estadaMinimaBAIXA_;
    }

}