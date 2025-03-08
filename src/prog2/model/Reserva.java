package prog2.model;

import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;

public class Reserva {
    private Allotjament allotjament;
    private Client client;
    LocalDate dataEntrada;
    LocalDate dataSortida;

    /**
     * Constructor de Reserva
     * @param allotjament l'allotjament que volem resevar
     * @param client El client que vol reservar
     * @param dataEntrada El primer dia de la reserva
     * @param dataSortida L'ultim dia de la reserva
     * @throws ExcepcioReserva si les dates de la reserva son incoherents
     */
    public Reserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {
        //Si les dates son cronologicament incoherents:
        if (dataEntrada.isAfter(dataSortida)) throw new ExcepcioReserva("Aquestes dates son incorrectes");
        Altrament:
        setAllotjament_(allotjament);
        setClient(client);
        setDataEntrada(dataEntrada);
        setDataSortida(dataSortida);
    }


    //Construim els getters i els setters
    public Allotjament getAllotjament_(){return allotjament;}
    public void setAllotjament_(Allotjament allotjament){this.allotjament = allotjament;}

    public Client getClient(){return client;}
    public void setClient(Client client){this.client = client;}

    public LocalDate getDataEntrada(){return dataEntrada;}
    public void setDataEntrada(LocalDate dataEntrada){this.dataEntrada = dataEntrada;}

    public LocalDate getDataSortida(){return dataSortida;}
    public void setDataSortida(LocalDate dataSortida){this.dataSortida = dataSortida;}

}
