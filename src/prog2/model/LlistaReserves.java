package prog2.model;

import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class LlistaReserves implements InLlistaReserves{
    private ArrayList <Reserva> llistaReserves;

    public void afegirReserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {
        if (!allotjamentDisponible(allotjament, dataEntrada, dataSortida)) throw new ExcepcioReserva("L’allotjament amb identificador " + allotjament.getId() + " no està disponible en la data demanada " + dataEntrada.toString() + " pel client "+ client.getNom() + " amb DNI: " + client.getDni() + ".");
        if (!isEstadaMinima(allotjament, dataEntrada, dataSortida) throw new ExcepcioReserva("Estada massa curta per el ti")
    }

    public boolean allotjamentDisponible(Allotjament allotjament, LocalDate dataEntrada, LocalDate dataSortida){
        for (Reserva reserves : llistaReserves) {
            if (reserves.getAllotjament().getId().equals(allotjament.getId())) {
                return (reserves.getDataEntrada().isAfter(dataSortida) || (reserves.getDataSortida().isBefore(dataEntrada)));
            }
        }
        return true;
    }

    public boolean isEstadaMinima(Allotjament allotjament, LocalDate dataEntrada, LocalDate dataSortida){
        long estada = ChronoUnit.DAYS.between(dataEntrada, dataSortida);
        long estadaMinima =  allotjament.getEstadaMinima(Camping.getTemporada(dataEntrada));
        return estadaMinima <= estada;
    }
}
