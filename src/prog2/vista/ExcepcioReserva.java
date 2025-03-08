package prog2.vista;

/**
 * Subclasse ExcepcioReserva
 * @author FrexasLautaro
 * @author TubertGuillem
 */

public class ExcepcioReserva extends RuntimeException {
    //Creem el constructor d'ExcepcioReserva
    public ExcepcioReserva(String message) {
        super(message);
    }
}
