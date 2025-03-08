package prog2.model;
import prog2.vista.ExcepcioReserva;

/**
 * Classe Client
 * @author FrexasLautaro
 * @author TubertGuillem
 */

public class Client {
    private String nom;
    private String dni;

    //Constructor de Client
    public Client(String nom, String dni){
        setNom(nom);
        setDni(dni);
    }

    //Construim els getters i els setters
    public String getNom(){return nom;}
    public void setNom(String nom){this.nom = nom;}

    public String getDni(){return dni;}
    public void setDni (String dni) throws ExcepcioReserva{
        if (dni.length() != 9) throw new ExcepcioReserva("El DNI ha de tenir 9 caràcters.");
        this.dni = dni;

    }
    /**
     * Metode que retorna la informacio de l'objecte
     * @return String amb informacio sobre el client
     */
    public String toString(){
        return "Nom: " + getNom() + ", DNI: " + getDni();
    }
}
