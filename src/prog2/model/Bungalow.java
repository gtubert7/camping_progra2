package prog2.model;

public class Bungalow extends Habitatges{
    private int placesParquing;
    private boolean terrassa;
    private boolean tv;
    private boolean aireFred;

    public Bungalow(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                    int placesParquing, boolean terrassa, boolean tv, boolean aireFred){
        super(nom_, idAllotjament_, mida, habitacions, placesPersones);

        setPlacesParquing(placesParquing);
        setTerrassa(terrassa);
        setTv(tv);
        setAireFred(aireFred);
    }

    public int getPlacesParquing(){return placesParquing;}
    public void setPlacesParquing(int placesParquing){this.placesParquing = placesParquing;}

    public boolean getTerrassa(){return terrassa;}
    public void setTerrassa(boolean terrassa){this.terrassa = terrassa;}

    public boolean getTv(){return tv;}
    public void setTv(boolean tv){this.tv = tv;}

    public boolean getAireFred(){return aireFred;}
    public void setAireFred(boolean aireFred){this.aireFred = aireFred;}

    public boolean correcteFuncionament(){
        return getAireFred();
    }
}
