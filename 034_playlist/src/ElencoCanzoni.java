import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "elencoCanzoni")
public class ElencoCanzoni extends ArrayList<Canzone> {

    public List<Canzone> getLista(){return this;}

    @XmlElement(name = "Canzone")
    public void setLista(List<Canzone> lista){
        this.clear();
        this.addAll(lista);
    }
}
