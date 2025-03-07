package prog2.model;

import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;

public class Reserva {
    private Allotjament allotjament;
    private Client client;
    LocalDate dataEntrada;
    LocalDate dataSortida;

    public Reserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {
        if (dataEntrada.isAfter(dataSortida)) throw new ExcepcioReserva("Aquestes dates son incorrectes");

        setAllotjament_(allotjament);
        setClient(client);
        setDataEntrada(dataEntrada);
        setDataSortida(dataSortida);
    }

    public Allotjament getAllotjament_(){return allotjament;}
    public void setAllotjament_(Allotjament allotjament){this.allotjament = allotjament;}

    public Client getClient(){return client;}
    public void setClient(Client client){this.client = client;}

    public LocalDate getDataEntrada(){return dataEntrada;}
    public void setDataEntrada(LocalDate dataEntrada){this.dataEntrada = dataEntrada;}

    public LocalDate getDataSortida(){return dataSortida;}
    public void setDataSortida(LocalDate dataSortida){this.dataSortida = dataSortida;}

}
