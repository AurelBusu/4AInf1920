import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Hotel {
    public static final String PATH_FILE = "G:\\4AINF\\EserciziJava\\037_hotelXml\\xml\\hotel.xml";
    public static final String PATH_FILE_WRITE = "G:\\4AINF\\EserciziJava\\037_hotelXml\\xml\\marshaller.xml";

    private String name;
    private List<Camera> lCamera;

    public Hotel(){
        this.name = "";
        this.lCamera = new ArrayList<Camera>();
    }

    public void addCamera(Camera camera){
        this.lCamera.add(camera);
    }

    public String getName() {
        return name;
    }

    @XmlAttribute
    public void setName(String name) {
        this.name = name;
    }

    public List<Camera> getlCamera() {
        return lCamera;
    }

    @XmlElement
    public void setlCamera(List<Camera> lCamera) {
        this.lCamera = lCamera;
    }

    public void unMarshallXml(){
        try {
            File file = new File(PATH_FILE);
            JAXBContext jaxbContext = JAXBContext.newInstance(Hotel.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Hotel hotel = (Hotel) jaxbUnmarshaller.unmarshal(file);

            System.out.println(hotel.toString());

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public void marshallXml(){
        File file = new File(PATH_FILE_WRITE);
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Hotel.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            //this: è il riferimento alla classe attuale
            jaxbMarshaller.marshal (this, file);
            jaxbMarshaller.marshal (this, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public void simula(){
        Camera aCamera = new Camera("crm", "2", "si", "mare");
        this.addCamera(aCamera);
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", lCamera=" + lCamera +
                '}';
    }

    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        //hotel.unMarshallXml();

        hotel.simula();
        hotel.marshallXml();
    }
}
