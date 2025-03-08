package prog2.model;

import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class LlistaReserves implements InLlistaReserves{
    private ArrayList <Reserva> llistaReserves = new ArrayList<Reserva>();

    /**
     * Metode que crea una reserva al camping i l'afegeix a la llista de reserves
     * @param allotjament L'allotjament que volem reservar
     * @param client El client que vol reservar l'allotjament
     * @param dataEntrada El primer dia de la reserva
     * @param dataSortida L'ultim dia de la reserva
     * @throws ExcepcioReserva Si l'allotjament esta ocupat o si no s'intenta reservar l'estada minima
     */
    public void afegirReserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {
        //Si l'allotjament no esta disponible a la data indicada
        if (!allotjamentDisponible(allotjament, dataEntrada, dataSortida)) throw new ExcepcioReserva("L’allotjament amb identificador " + allotjament.getId() + " no està disponible en la data demanada " + dataEntrada.toString() + " pel client "+ client.getNom() + " amb DNI: " + client.getDni() + ".");
        //
        if (!isEstadaMinima(allotjament, dataEntrada, dataSortida)) throw new ExcepcioReserva("Les dates sol·licitades pel client " + client.getNom() + " amb DNI: " + client.getDni() + " no compleixen l'estada mínima per l'allotjament amb identificador " + allotjament.getId() + ".");
        //Si es pot reservar, creem la reserva i la afegim a la llista
        Reserva reserva = new Reserva(allotjament, client, dataEntrada, dataSortida);
        llistaReserves.add(reserva);
    }

    /**
     * Metode qe comprova si l'allotjament esta disponible
     * @param allotjament L'allotjament que volem revisar
     * @param dataEntrada El primer dia de la reserva
     * @param dataSortida L'ultim dia de la reserva
     * @return True si esta disponible, fals si no
     */
    public boolean allotjamentDisponible(Allotjament allotjament, LocalDate dataEntrada, LocalDate dataSortida){
        for (Reserva reserves : llistaReserves) {
            if (reserves.getAllotjament_().getId().equals(allotjament.getId())) { //Busquem reserves del mateix allotjament
                //Si qualsevol de les dues condicions es certa retprna veritat
                return (reserves.getDataEntrada().isAfter(dataSortida) || (reserves.getDataSortida().isBefore(dataEntrada)));
            }
        }
        return true;
    }

    /**
     * Metode comprova si la reserva dura el minim requerit
     * @param allotjament Allotjament el minim del qual volem revisar
     * @param dataEntrada El primer dia de la reserva
     * @param dataSortida L'ultim dia de la reserva
     * @return True si la reserva supera l'estada minima, fals si no
     */
    public boolean isEstadaMinima(Allotjament allotjament, LocalDate dataEntrada, LocalDate dataSortida){
        long estada = ChronoUnit.DAYS.between(dataEntrada, dataSortida); //Calculem els dies entre el principi i la fi de l'estada
        long estadaMinima =  allotjament.getEstadaMinima(Camping.getTemporada(dataEntrada)); //Mirem l'estada mínima
        return estadaMinima <= estada;
    }

    /**
     * Metode que retorna el nombre total de reserves
     * @return el nombre total de reserves
     */
    public int getNumReserves(){
        return llistaReserves.size();
    }
}
