
package prog2.vista;

import prog2.model.Camping;

import java.time.LocalDate;


/**
 * Classe per gestionar els allotjaments del Càmping del Mar.
 * @author lauraigual
 */
public class GestorCamping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Camping campingMar = new Camping("Camping del Mar");

        omplirDadesModel(campingMar);

        ferReserves(campingMar);



        // Calcular la mida total de les parcel·les (en M^2) del Càmping i mostrar un missatge de la següent manera:
        // >> La mida total de les parcel·les del Càmping del Mar és de X m^2)
        //--------------------------------------------------------------------------------------------------------------------
        // Per completar
        System.out.println("La mida total de les parcel·les del Càmping del Mar és de " + campingMar.calculMidaTotalParceles()+" m^2");

        // Mostrar el número total d'allotjaments del Càmping i el número d'allotjaments que estan operatius amb el següent missatge:
        // >> El número total d'allotjaments del Càmping és X dels quals X allotjaments estan operatius.
        //--------------------------------------------------------------------------------------------------
        // Per completar
        System.out.println("El número total d'allotjaments del Càmping és " + campingMar.getNumAllotjaments() + " dels quals " + campingMar.calculAllotjamentsOperatius() + " allotjaments estan operatius.");
        // Mostrar l'allotjament amb estada mínima de la temporada baixa més curta amb el següent missatge:
        // >> L'allotjament amb estada mínima de la temporada baixa més curta és el següent:
        //--------------------------------------------------------------------------------------------------
        // Per completar
        System.out.println("L'allotjament amb estada mínima de la temporada baixa més curta és el següent: " + campingMar.getAllotjamentEstadaMesCurta().getNom() );
    }

    /**
     * Mètode de classe per afegir parcel·les, bungalows, bungalows premium, glampings, mobil-home i clients al càmping.
     * @param camping L'objecte de tipus Camping que anem a omplir
     */
    private static void omplirDadesModel(Camping camping){


        // Afegir parcel·les:
        //------------------------------
        String nom = "Parcel·la Nord";
        String idAllotjament = "100P";
        float metres = 64.0f;
        boolean connexioElectrica = true;

        camping.afegirParcela(nom, idAllotjament, metres, connexioElectrica);

        nom = "Parcel·la Sud";
        idAllotjament = "101P";

        camping.afegirParcela(nom, idAllotjament, metres, connexioElectrica);


        // Afegir bungalows:
        //------------------------------
        nom = "Bungalow Est";
        idAllotjament = "102B";
        String mida = "Mitjana";
        int habitacions =2;
        int placesPersones = 6;
        int placesParquing = 1;
        boolean terrassa = true;
        boolean tv= true;
        boolean aireFred = true;

        camping.afegirBungalow(nom, idAllotjament, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred);

        nom = "Bungalow Oest";
        idAllotjament = "103B";
        mida = "Mitjana";
        habitacions =2;
        placesPersones = 4;
        placesParquing = 1;
        terrassa = true;
        tv= false;
        aireFred = false;

        camping.afegirBungalow(nom, idAllotjament, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred);

        // Afegir bungalows premium:
        //------------------------------
        nom = "Bungallow Nord";
        idAllotjament = "104BP";
        mida = "Gran";
        habitacions =2;
        placesPersones = 6;
        placesParquing = 2;
        terrassa = true;
        tv= false;
        aireFred = false;
        boolean serveisExtra = true;
        String codiWifi = "CampingDelMarBP1";

        camping.afegirBungalowPremium(nom, idAllotjament, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred, serveisExtra, codiWifi);

        nom = "Bungallow Sud";
        idAllotjament = "105BP";
        mida = "Gran";
        habitacions =2;
        placesPersones = 6;
        placesParquing = 1;
        terrassa = true;
        tv= false;
        aireFred = false;
        serveisExtra = true;
        codiWifi = "CampingDelMarBP2";

        camping.afegirBungalowPremium(nom, idAllotjament, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred, serveisExtra, codiWifi);

        // Afegir Glamping:
        //------------------------------

        nom = "Glamping Nord";
        idAllotjament = "106G";
        mida = "Petita";
        habitacions =1;
        placesPersones = 2;
        String material = "Tela";
        boolean casaMascota = true;

        camping.afegirGlamping(nom, idAllotjament, mida, habitacions, placesPersones, material, casaMascota);

        nom = "Glamping Sud";
        idAllotjament = "107G";
        mida = "Petita";
        habitacions =1;
        placesPersones = 2;
        material = "Tela";
        casaMascota = false;

        camping.afegirGlamping(nom, idAllotjament, mida, habitacions, placesPersones, material, casaMascota);

        // Afegir Mobil-Home:
        //------------------------------
        nom = "Mobil-Home Nord";
        idAllotjament = "108MH";
        mida = "Petita";
        habitacions =1;
        placesPersones = 2;
        boolean terrassaBarbacoa = true;

        camping.afegirMobilHome(nom, idAllotjament, mida, habitacions, placesPersones, terrassaBarbacoa);

        nom = "Mobil-Home Sud";
        idAllotjament = "109MH";
        mida = "Mitjana";
        habitacions =2;
        placesPersones = 4;
        terrassaBarbacoa = false;

        camping.afegirMobilHome(nom, idAllotjament, mida, habitacions, placesPersones, terrassaBarbacoa);


        // Afegir clients:
        //------------------------------
        String nomClient="Patricia Fernandez";
        String dni="12345678X";
        try {
            camping.afegirClient(nomClient, dni);
        } catch (ExcepcioReserva ex) {
            System.out.println(ex.getMessage());
        }

        nomClient = "Lluís Plans";
        dni="78659101A";
        try {
            camping.afegirClient(nomClient, dni);
        } catch (ExcepcioReserva ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Mètode per fer reserves d'allotjaments.
     * @param camping
     */
    private static void ferReserves(Camping camping){

        // Per completar:

        // 1. Afegeix una reserva pel client amb DNI "12345678X" de l'allotjament amb identificador "100P"
        // amb la data d'entrada 20 de Febrer del 2025 i data de sortida 28 de febrer del 2025.

        String idAllotjament, dni;
        idAllotjament = "100P"; dni = "12345678X";
        LocalDate dataEntrada = LocalDate.of(2025, 2, 20);
        LocalDate dataSortida = LocalDate.of(2025, 2, 28);
        try{
            camping.afegirReserva(idAllotjament, dni, dataEntrada, dataSortida);
        }
        catch(ExcepcioReserva e){
            System.out.println(e.getMessage());
        }
        // 2. Afegeix una reserva pel client amb DNI "78659101A" de l'allotjament amb identificador "100P"
        // amb la data d'entrada 25 de Febrer del 2025 i data de sortida 28 de febrer del 2025.
        idAllotjament = "100P"; dni = "78659101A";
        dataEntrada = LocalDate.of(2025, 2, 25);
        dataSortida = LocalDate.of(2025, 2, 28);
        try{
            camping.afegirReserva(idAllotjament, dni, dataEntrada, dataSortida);
        }
        catch(ExcepcioReserva e){
            System.out.println(e.getMessage());
        }

        // 3. Afegeix una reserva pel client amb DNI "789101A" de l'allotjament amb identificador "300S"
        // amb la data d'entrada 25 de Febrer del 2025 i data de sortida 28 de febrer del 2025.
        idAllotjament = "300S"; dni = "789101A";
        dataEntrada = LocalDate.of(2025, 2, 25);
        dataSortida = LocalDate.of(2025, 2, 28);
        try{
            camping.afegirReserva(idAllotjament, dni, dataEntrada, dataSortida);
        }
        catch(ExcepcioReserva e){
            System.out.println(e.getMessage());
        }
    }

}
