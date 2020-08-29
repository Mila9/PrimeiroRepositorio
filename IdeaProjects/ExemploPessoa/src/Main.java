import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static  void main(String[] args) throws Exception{
        SimpleDateFormat data = new SimpleDateFormat("DD/MM/YYYY");
        Date datab = data.parse("19/08/1976");
        Date datad = data.parse("04/03/2000");
        Date datac = data.parse("27/05/1996");

        Brasileiro brasileiro = new Brasileiro("José das Neves", "654.890.657-67",
                datab,"casado");

        Dinamarques dinamarques = new Dinamarques("Lars Ulrich","878.234.980-87",
                datad,"solteiro");

        Chines chines = new Chines("Cheng Long", "765.098.378-09",
                datac,"divorciado");


        brasileiro.ComparaIdade(chines);
        dinamarques.DizerOla(chines);
        chines.Acenar(brasileiro);


    }
}
