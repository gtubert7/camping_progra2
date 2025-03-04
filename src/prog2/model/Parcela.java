package prog2.model;

public class Parcela extends Allotjament{
    private float metres;
    private boolean connexioElectrica;

    public Parcela(String nom_, String idAllotjament_, float metres, boolean connexioElectrica){
        super(nom_, idAllotjament_);
        setMetres(metres);
        setConnexioElectrica(connexioElectrica);
    }

    public float getMetres(){return metres;}
    public void setMetres(float metres){this.metres = metres;}

    public boolean getConnexioElectrica(){return connexioElectrica;}
    public void setConnexioElectrica(boolean connexioElectrica){this.connexioElectrica = connexioElectrica;}

    public boolean correcteFuncionament(){
        return getConnexioElectrica();
    }
}

