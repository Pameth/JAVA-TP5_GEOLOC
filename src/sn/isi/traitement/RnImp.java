package sn.isi.traitement;

import sn.isi.entities.Rn;
import sn.isi.entities.Zone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RnImp implements IRn{

    @Override
    public Rn saisie() {
        String rep =null;
        Scanner sc = new Scanner(System.in);
        List<Zone> zones = new ArrayList<Zone>();
        Rn rn = new Rn();
        //la saisie de la route
        System.out.println("ID de la route: ");
        rn.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("LATITUDE de la route: ");
        rn.setLatitude(Double.parseDouble(sc.nextLine()));
        System.out.println("LONGITUDE de la route: ");
        rn.setLongitude(Double.parseDouble(sc.nextLine()));
        do{
            //instanciation d'une nouvelle zone
            Zone zone = new Zone();
            IZone iz =new ZoneImp();
            zone=iz.saisie();
            zones.add(zone);
            System.out.println("Voulez-vous saisir une autre zone? o/n");
            rep =sc.nextLine();
        }while (rep.equalsIgnoreCase("o"));
        rn.setZones(zones);
        return rn;
    }

    @Override
    public void affichage(Rn rn) {
        System.out.println("-------Affichage des donnees de la RN --------------");
        System.out.println("l'id  de la route: " + rn.getId());
        System.out.println("la latitude de la route: " + rn.getLatitude());
        System.out.println("la longitude de la route: " + rn.getLongitude());
        System.out.println("-------Affichage de la Zone --------------");
        for (Zone z :rn.getZones())
        {
            new ZoneImp().afichage(z);
            System.out.println("");
        }
    }
}
