import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import java.util.Objects;

public class Canzone {
    private int id;
    private String nomeAutore;
    private String nomeCanzone;

    public Canzone(int id, String nomeAutore, String nomeCanzone) {
        this.id = id;
        this.nomeAutore = nomeAutore;
        this.nomeCanzone = nomeCanzone;
    }

    public int getId() {
        return id;
    }
    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    public String getNomeAutore() {
        return nomeAutore;
    }
    @XmlAttribute
    public void setNomeAutore(String nomeAutore) {
        this.nomeAutore = nomeAutore;
    }

    public String getNomeCanzone() {
        return nomeCanzone;
    }
    @XmlAttribute
    public void setNomeCanzone(String nomeCanzone) {
        this.nomeCanzone = nomeCanzone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Canzone canzone = (Canzone) o;
        return id == canzone.id &&
                Objects.equals(nomeAutore, canzone.nomeAutore) &&
                Objects.equals(nomeCanzone, canzone.nomeCanzone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomeAutore, nomeCanzone);
    }

    public String toXml() {
        return "\t<id=\"" + id + "\">\n" +
                "\t\t<nomeAutore>" + nomeAutore + "</nomeAutore>\n" +
                "\t\t<nomeCanzone>" + nomeCanzone + "</nomeCanzone>\n" +
                "\t</id>\n";
    }
}
