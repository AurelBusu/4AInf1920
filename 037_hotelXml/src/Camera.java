import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Camera {
    private String nome;
    private String letto;
    private String bagno;
    private String vista;

    public Camera(String nome, String letto, String bagno, String vista) {
        this.nome = nome;
        this.letto = letto;
        this.bagno = bagno;
        this.vista = vista;
    }

    public Camera() {
    }

    public String getNome() {
        return nome;
    }

    @XmlAttribute
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLetto() {
        return letto;
    }

    @XmlElement
    public void setLetto(String letto) {
        this.letto = letto;
    }

    public String getBagno() {
        return bagno;
    }

    @XmlElement
    public void setBagno(String bagno) {
        this.bagno = bagno;
    }

    public String getVista() {
        return vista;
    }

    @XmlElement
    public void setVista(String vista) {
        this.vista = vista;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "nome='" + nome + '\'' +
                ", letto='" + letto + '\'' +
                ", bagno='" + bagno + '\'' +
                ", vista='" + vista + '\'' +
                '}';
    }
}
