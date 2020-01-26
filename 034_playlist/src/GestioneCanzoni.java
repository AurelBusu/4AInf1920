import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class GestioneCanzoni {
    public static void main(String[] args) {
        try{
            ElencoCanzoni elenco = new ElencoCanzoni();

            Canzone c1 = new Canzone();
            c1.setNome("mall");
            c1.setAutore("fabio");
            c1.setAnno(2012);

            Canzone c2 = new Canzone();
            c2.setNome("pool");
            c2.setAutore("marco");
            c2.setAnno(2000);

            elenco.add(c1);
            elenco.add(c2);

            File file = new File();
            JAXBContext jaxbContext = JAXBContext.newInstance(ElencoCanzoni.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(elenco, file);
            jaxbMarshaller.marshal(elenco, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
