package dominio;
import java.util.stream.Stream;


public class ej14_2 {
    public static int suma(int[]lista) {
        return Stream.iterate(0,i->i+1).limit(lista.length).map(i->lista[i]).reduce(0,(a,b)->a+b);

    }

}
