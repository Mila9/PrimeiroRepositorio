package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {
        SimpleDateFormat data = new SimpleDateFormat("DD/MM/YYYY");
        Date datab = data.parse("19/08/1976");
        Date datad = data.parse("20/05/2000");
        Date datac = data.parse("13/11/1980");

        Brasileiro brasileiro = new Brasileiro("José das Neves","488.390.887-87",datab,"casado" );
        Dinamarques dinamarques = new Dinamarques("Lars Ulrich","456.920.256-29", datad, "solteiro");
        Chines chines= new Chines("Sheng Long","490.390.590-25",datac,"viúvo");

        brasileiro.DizerOla(chines);
        dinamarques.Acenar(brasileiro);
        chines.ComparaIdade(dinamarques);

    }
}
