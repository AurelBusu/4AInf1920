import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Playlist {
    public static final String FILE_NAME = "G:\\4AINF\\EserciziJava\\035_playlistXml\\src\\canzoni.xml";
    private List<Canzone> playlist;

    public Playlist(){
        super();
        playlist = new ArrayList<Canzone>();
    }

    public void addCanzone(Canzone canzone){
        playlist.add(canzone);
    }

    public List<Canzone> getPlaylist(){
        return playlist;
    }

    public void setPlaylist(List<Canzone> playlist){
        this.playlist = playlist;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "playlist=" + playlist +
                '}';
    }

    public String toXml(){
        String xml = "";
        for(Canzone canzone : this.playlist){
            xml += canzone.toXml();
        }
        xml = "<playlist>\n" + xml + "</playlist>";
        return xml;
    }

    public void scriviXml() {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(FILE_NAME));
            bw.write(this.toXml());
            System.out.println(this.toXml());
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void marshallingXml(){
        try {
            File file = new File(Playlist.FILE_NAME);
            JAXBContext jaxbContext = JAXBContext.newInstance(Playlist.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(this, file);
            jaxbMarshaller.marshal(this, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public void unmarshallingXml() {
        try {
            File file = new File(Playlist.FILE_NAME);
            JAXBContext jaxbContext = JAXBContext.newInstance(Playlist.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Playlist playlist = (Playlist) jaxbUnmarshaller.unmarshal(file);
            System.out.println(playlist);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

    private void simulaPlaylist(){
        Canzone canzone1 = new Canzone(1, "Ultimo", "Pianeti");
        this.addCanzone(canzone1);
        Canzone canzone2 = new Canzone(2, "Ultimo", "Sogni Appesi");
        this.addCanzone(canzone2);
        Canzone canzone3 = new Canzone(3, "Ultimo", "Giusy");
        this.addCanzone(canzone3);
        Canzone canzone4 = new Canzone(4, "Ultimo", "Mille Universi");
        this.addCanzone(canzone4);
    }

    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.simulaPlaylist();
        playlist.scriviXml();
       //playlist.marshallingXml();
      // playlist.unmarshallingXml();
    }

    public void caricaTabella(DefaultTableModel tableModelCanzoni){
        for(Canzone canzone : this.playlist){
            tableModelCanzoni.addRow(new Object[]{canzone.getId(), canzone.getNomeAutore(), canzone.getNomeCanzone()});
        }
    }

    }
