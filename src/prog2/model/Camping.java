package prog2.model;

import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;
import java.util.ArrayList;

public class Camping implements InCamping{

    private String nom;
    private ArrayList<Allotjament> llistaAllotjamentsDisponibles;
    private ArrayList<Client> llistaClients;
    private LlistaReserves llistaReserves;

    public String getNom(){
        return nom;
    }

    LlistaReserves getLListaReserves(){
        return llistaReserves;
    }

    ArrayList<Allotjament> getLlistaAllotjaments(){
        return llistaAllotjamentsDisponibles;
    }

    ArrayList<Client> getLlistaClients(){
        return llistaClients;
    }

    int getNumAllotjaments();

    int getNumReserves();

    int getNumClients(){
        return llistaClients.size();
    }

    void afegirClient(String nom_, String dni_) throws ExcepcioReserva{

        Client cli = new Client()
        llistaClients.add()
    };

    void afegirParcela(String nom_, String idAllotjament_, float metres, boolean connexioElectrica);

    void afegirBungalow(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                        int placesParquing, boolean terrassa, boolean tv, boolean aireFred);

    void afegirBungalowPremium(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                               int placesParquing, boolean terrassa, boolean tv, boolean aireFred,
                               boolean serveisExtra, String codiWifi);

    void afegirGlamping(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                        String material, boolean casaMascota);

    void afegirMobilHome(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                         boolean terrassaBarbacoa);

    void afegirReserva(String id_, String dni_, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva;

    float calculMidaTotalParceles();

    int calculAllotjamentsOperatius();

    Allotjament getAllotjamentEstadaMesCurta();
}
