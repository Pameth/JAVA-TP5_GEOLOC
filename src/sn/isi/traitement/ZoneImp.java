package sn.isi.traitement;

import sn.isi.entities.Zone;

import java.util.Scanner;

public class ZoneImp implements IZone {
    Scanner sc= new Scanner(System.in);
    @Override
    public Zone saisie() {
        Zone z = new Zone();
        System.out.println("ID de la zone:" );
        z.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("NOM de la zone");
        z.setNom(sc.nextLine());
        System.out.println("LATITUDE de la zone");
        z.setLatitude(Double.parseDouble(sc.nextLine()));
        System.out.println("LONGITUDE de la zone ");
        z.setLongitude(Double.parseDouble(sc.nextLine()));
        return z;
    }

    @Override
    public void afichage(Zone zone) {
        System.out.println("l'ID de la zone: " + zone.getId());
        System.out.println("le nom de la zone: " +zone.getNom());
        System.out.println("la latitude de la zone: " +zone.getLatitude());
        System.out.println("la longitude la zone est :" +zone.getLongitude());
    }
}
