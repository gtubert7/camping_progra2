package prog2.model;

public class Glamping extends Casa {
    private String material;
    private boolean casaMascota;

    public Glamping(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                    String material, boolean casaMascota){
        super(nom_, idAllotjament_, 5, 3, mida, habitacions, placesPersones);

        setMaterial(material);
        setCasaMascota(casaMascota);
    }

    public String getMaterial(){return material;}
    public void setMaterial(String material){this.material = material;}

    public boolean isCasaMascota(){return casaMascota;}
    public void setCasaMascota(boolean casaMascota){this.casaMascota = casaMascota;}

    public boolean correcteFuncionament() {
        return isCasaMascota();
    }

    public String getString(){
        return super.toString() + "Glamping{material=" + getMaterial() + ", casaMascota=" + isCasaMascota() +"}";
    }
}
