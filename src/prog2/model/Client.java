package prog2.model;
import prog2.vista.ExcepcioReserva;

public class Client {
    private String nom;
    private String dni;

    public Client(String nom, String dni){
        setNom(nom);
        setDni(dni);
    }

    public String getNom(){return nom;}
    public void setNom(String nom){this.nom = nom;}

    public String getDni(){return dni;}
    public void setDni (String dni) throws ExcepcioReserva{
        if (!dni.matches("\\S{9}") ) throw new ExcepcioReserva("El DNI no és vàlid.");
        this.dni = dni;

    }

    public String toString(){
        return "Nom: " + getNom() + ", DNI: " + getDni();
    }
}
