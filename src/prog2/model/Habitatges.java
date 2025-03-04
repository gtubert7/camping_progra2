package prog2.model;

public class Habitatges extends Allotjament{
    private String mida;
    private int habitacions;
    private int placesPersones;

    Habitatges(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones){
        super(nom_, idAllotjament_);

        setMida(mida);
        setHabitacions(habitacions);
        setPlacesPersones(placesPersones);

    }
    public String getMida(){return mida;}
    public void setMida(String mida){this.mida = mida;}

    public int getHabitacions(){return habitacions;}
    public void setHabitacions(int habitacions){this.habitacions = habitacions;}

    public int getPlacesPersones(){return placesPersones;}
    public void setPlacesPersones(int placesPersones){this.placesPersones = placesPersones;}
}
