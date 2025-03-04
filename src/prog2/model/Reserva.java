package prog2.model;

import java.time.LocalDate;

public class Reserva {
    private Allotjament allotjament;
    private Client client;
    LocalDate dataEntrada;
    LocalDate dataSortida;

    public Reserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida){
        this.allotjament = allotjament;
        this.client = client;
        this.dataEntrada = dataEntrada;
        this.dataSortida = dataSortida;
    }

    public Allotjament getAllotjament(){return allotjament;}
    public void setAllotjament(Allotjament allotjament){this.allotjament = allotjament;}

    public Client getClient(){return client;}
    public void setClient(Client client){this.client = client;}

    public LocalDate getDataEntrada(){return dataEntrada;}
    public void setDataEntrada(LocalDate dataEntrada){this.dataEntrada = dataEntrada;}

    public LocalDate getDataSortida(){return dataSortida;}
    public void setDataSortida(LocalDate dataSortida){this.dataSortida = dataSortida;}

}
