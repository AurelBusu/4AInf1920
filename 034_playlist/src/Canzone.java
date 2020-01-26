import javax.xml.bind.annotation.XmlAttribute;

public class Canzone {
    private String nome;
    private String autore;
    private int anno;

    public Canzone(String nome, String autore, int anno) {
        this.nome = nome;
        this.autore = autore;
        this.anno = anno;
    }

    public Canzone() {
    }

    public String getNome() {
        return nome;
    }

    @XmlAttribute
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutore() {
        return autore;
    }

    @XmlAttribute
    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getAnno() {
        return anno;
    }

    @XmlAttribute
    public void setAnno(int anno) {
        this.anno = anno;
    }

    @Override
    public String toString() {
        return "Canzone{" +
                "nome='" + nome + '\'' +
                ", autore='" + autore + '\'' +
                ", anno=" + anno +
                '}';
    }
}
