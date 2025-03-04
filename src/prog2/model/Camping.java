package prog2.model;

import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;
import java.util.ArrayList;

public class Camping implements InCamping{

    private String nom;
    private ArrayList<Allotjament> llistaAllotjaments;
    private ArrayList<Client> llistaClients;
    private LlistaReserves llistaReserves;

    public String getNom(){
        return nom;
    }

    public LlistaReserves getLListaReserves(){
        return llistaReserves;
    }

    public ArrayList<Allotjament> getLlistaAllotjaments(){
        return llistaAllotjaments;
    }

    public ArrayList<Client> getLlistaClients(){
        return llistaClients;
    }

    public int getNumAllotjaments(){
        return getLlistaAllotjaments().size();
    }

    int getNumReserves();

    public int getNumClients(){
        return getLlistaClients().size();
    }

    public void afegirClient(String nom_, String dni_) throws ExcepcioReserva{

        Client client = new Client(nom_, dni_);
        llistaClients.add(client);
    };

    public void afegirParcela(String nom_, String idAllotjament_, float metres, boolean connexioElectrica){
        Parcela parcela = new Parcela(nom_, idAllotjament_, metres, connexioElectrica);
        llistaAllotjaments.add(parcela);
    }

    public void afegirBungalow(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                        int placesParquing, boolean terrassa, boolean tv, boolean aireFred){
        Bungalow bungalow = new Bungalow(nom_, idAllotjament_, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred);
        llistaAllotjaments.add(bungalow);
    }

    public void afegirBungalowPremium(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                               int placesParquing, boolean terrassa, boolean tv, boolean aireFred,
                               boolean serveisExtra, String codiWifi){
        BungalowPremium bungalowPremium = new BungalowPremium(nom_, idAllotjament_, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred, serveisExtra, codiWifi);
        llistaAllotjaments.add(bungalowPremium);
    }

    public void afegirGlamping(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                        String material, boolean casaMascota){
        Glamping glamping = new Glamping(nom_, idAllotjament_, mida, habitacions, placesPersones, material, casaMascota);
        llistaAllotjaments.add(glamping);
    }

    public void afegirMobilHome(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                         boolean terrassaBarbacoa){
        MobilHome mobilHome = new MobilHome(nom_, idAllotjament_, mida, habitacions, placesPersones, terrassaBarbacoa);
        llistaAllotjaments.add(mobilHome);
    }

    void afegirReserva(String id_, String dni_, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva;

    float calculMidaTotalParceles();

    int calculAllotjamentsOperatius();

    Allotjament getAllotjamentEstadaMesCurta();

    public static InAllotjament.Temp getTemporada(LocalDate data){
        int dia = data.getDayOfMonth();
        int mes = data.getMonthValue();

        if (4 <= mes && mes <= 7) return InAllotjament.Temp.values()[0];
        else if (mes == 3 && dia > 21) return InAllotjament.Temp.values()[0];
        else return InAllotjament.Temp.values()[1];
    }
}
