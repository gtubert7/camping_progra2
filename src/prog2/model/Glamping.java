package prog2.model;

public class Glamping extends Habitatges{
    private String material;
    private boolean casaMascota;

    public Glamping(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                    String material, boolean casaMascota){
        super(nom_, idAllotjament_, mida, habitacions, placesPersones);

        setMaterial(material);
        setCasaMascota(casaMascota);
    }

    public String getMaterial(){return material;}
    public void setMaterial(String material){this.material = material;}

    public boolean getCasaMascota(){return casaMascota;}
    public void setCasaMascota(boolean casaMascota){this.casaMascota = casaMascota;}

    public boolean correcteFuncionament() {
        return getCasaMascota();
    }
}
