import java.util.ArrayList;
import java.util.List;

/**
 * Created by inf.busua0409 on 23/11/2019.
 */
public class Frantoio {
    private List<Oliva> listaOlive;

    //List è un'interfaccia di ArrayList<E>
    //ArrayList<E>
    public Frantoio(){}

    public Frantoio(List<Oliva> listaOlive) {
        this.listaOlive = new ArrayList<Oliva>();
    }
}
