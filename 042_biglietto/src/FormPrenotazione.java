import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FormPrenotazione extends JFrame implements ActionListener {

    JLabel cognome;
    JLabel nome;
    JLabel telefono;
    JLabel cittaPartenza;
    JLabel cittaDestinazione;
    JLabel data;

    JTextField tCognome;
    JTextField tNome;
    JTextField tTelefono;
    JTextField tPartenza;
    JTextField tDestinazione;
    JTextField tData;

    JButton conferma;
    JButton annulla;
    JButton stampa;
    JButton salva;

    private ArrayList<Prenotazione> prenotazioni;
    private int cnt = 0;
    public static final String FILE_PATH = "G:\\4AINF\\EserciziJava\\042_biglietto\\prenotazioni.csv";

    public FormPrenotazione(){
        prenotazioni = new ArrayList<Prenotazione>();
        setTitle("prenotazione biglietto");
        setSize(400, 300);
        setLocation(500,200);
        setResizable(false);
        initComponents();
        setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void initComponents() {
        JPanel finestra = new JPanel();
        finestra.setLayout(null);
        cognome = new JLabel("Cognome: ");
        finestra.add(cognome);
        tCognome = new JTextField();
        finestra.add(tCognome);
        nome = new JLabel("Nome: ");
        finestra.add(nome);
        tNome = new JTextField();
        finestra.add(tNome);
        telefono = new JLabel("Telefono: ");
        finestra.add(telefono);
        tTelefono = new JTextField();
        finestra.add(tTelefono);
        cittaPartenza = new JLabel("Partenza: ");
        finestra.add(cittaPartenza);
        tPartenza = new JTextField();
        finestra.add(tPartenza);
        cittaDestinazione = new JLabel("Arrivo: ");
        finestra.add(cittaDestinazione);
        tDestinazione = new JTextField();
        finestra.add(tDestinazione);
        data = new JLabel("Data: ");
        finestra.add(data);
        tData = new JTextField();
        finestra.add(tData);

        cognome.setBounds(60,30,60,15);
        nome.setBounds(60,50,60,15);
        telefono.setBounds(60,70,60,15);
        cittaPartenza.setBounds(60,90,60,15);
        cittaDestinazione.setBounds(60,110,60,15);
        data.setBounds(60,130,60,15);

        tCognome.setBounds(135,30,200,20);
        tNome.setBounds(135,50,200,20);
        tTelefono.setBounds(135,70,200,20);
        tPartenza.setBounds(135,90,200,20);
        tDestinazione.setBounds(135,110,200,20);
        tData.setBounds(135,130,200,20);


        JPanel bottoni = new JPanel();
        conferma = new JButton("Conferma");
        bottoni.add(conferma);
        conferma.addActionListener(this);
        annulla = new JButton("Annulla");
        bottoni.add(annulla);
        annulla.addActionListener(this);

        salva = new JButton("Salva");
        bottoni.add(salva);
        salva.addActionListener(this);
        stampa = new JButton("Stampa");
        bottoni.add(stampa);
        stampa.addActionListener(this);
        this.add(finestra, BorderLayout.CENTER);
        this.add(bottoni, BorderLayout.SOUTH);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == conferma){
            Prenotazione prenotazione = new Prenotazione();
            salvaInfo(prenotazione);
            prenotazioni.add(prenotazione);
            printMessage("Confermata la prenotazione");
        }
        if(actionEvent.getSource() == annulla){
            printMessage("Annullata la prenotazione");
        }
        if(actionEvent.getSource() == stampa){
            printPrenotazioni();
        }
        if(actionEvent.getSource() == salva){
            salvaCSV();
            reset();
        }
    }

    private void printPrenotazioni() {
        JPanel show = new JPanel();
        String[] options = {"< indietro", "avanti >"};
        String string = "";
        while(cnt<prenotazioni.size()){
            string = "Prenotazione "+ (cnt+1)+" " +prenotazioni.get(cnt).toString();
            int x = JOptionPane.showOptionDialog(null, string, null, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            if(x==0 && cnt>0){
                cnt--;
            }
            if(x==1){
                cnt++;
            }
            if(x== JOptionPane.CLOSED_OPTION){
                return;
            }
        }
    }


    private void printMessage(String stringa) {
        JOptionPane.showMessageDialog(this, stringa);
        reset();
    }


    private void reset() {
        tCognome.setText("");
        tNome.setText("");
        tTelefono.setText("");
        tPartenza.setText("");
        tDestinazione.setText("");
        tData.setText("");
    }


    public void salvaInfo(Prenotazione prenotazione){
        prenotazione.setCognome(tCognome.getText());
        prenotazione.setNome(tNome.getText());
        prenotazione.setTelefono(tTelefono.getText());
        prenotazione.setCittaPartenza(tPartenza.getText());
        prenotazione.setCittaDestinazione(tDestinazione.getText());
        prenotazione.setData(tData.getText());
    }

    public void salvaCSV() {
        BufferedWriter bw;
        try {
            bw= new BufferedWriter(new FileWriter(FILE_PATH, true));
            for(int cntPrenotazioni=0; cntPrenotazioni<prenotazioni.size(); cntPrenotazioni++)
            {
                Prenotazione pren = prenotazioni.get(cntPrenotazioni);
                System.out.println(pren.toString());
                bw.write(pren.toRowCSV());
                System.out.println("salvato!\n");
            }
            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        FormPrenotazione formPrenotazione = new FormPrenotazione();
    }

    @Override
    public String toString() {
        return "FormPrenotazione{" +
                "prenotazioni=" + prenotazioni +
                '}';
    }
}