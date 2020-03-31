import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Lista extends JFrame implements ActionListener {

    JLabel lCognome;
    JLabel lNome;
    JTextField tCognome;
    JTextField tNome;;
    JButton bAggiungi;

    JList<String> listaPersone;
    DefaultListModel<String> listaModelPersone;
    JComboBox<String> comboBoxPersone;
    DefaultComboBoxModel<String> comboBoxModelPersone;

    ArrayList<String> persone;


    public Lista() {
        persone = new ArrayList<String>();
        setTitle("persone:");
        initComponents();
        setSize(400,350);
        setMinimumSize(new Dimension(400,350));
        setLocation(50,250);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void initComponents() {

        Container container = this.getContentPane();
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JPanel cognomePanel = new JPanel();
        cognomePanel.setLayout(new FlowLayout());
        lCognome = new JLabel("Cognome: ");
        tCognome = new JTextField(10);
        cognomePanel.add(lCognome);
        cognomePanel.add(tCognome);
        panel.add(cognomePanel);

        JPanel nomePanel = new JPanel();
        nomePanel.setLayout(new FlowLayout());
        lNome = new JLabel("Nome: ");
        tNome = new JTextField(10);
        nomePanel.add(lNome);
        nomePanel.add(tNome);
        panel.add(nomePanel);

        JPanel personePanel = new JPanel();
        personePanel.setLayout(new FlowLayout());

        listaModelPersone = new DefaultListModel<>();
        listaPersone = new JList<>(listaModelPersone);
        listaPersone.setPrototypeCellValue("                                          ");
        JScrollPane scrollList = new JScrollPane(listaPersone);
        personePanel.add(scrollList);

        comboBoxModelPersone = new DefaultComboBoxModel<>();
        comboBoxPersone = new JComboBox<>(comboBoxModelPersone);
        comboBoxPersone.setPrototypeDisplayValue("                                ");
        comboBoxPersone.setMaximumRowCount(7);
        JScrollPane scrollComboBox = new JScrollPane(comboBoxPersone);
        personePanel.add(scrollComboBox);

        panel.add(personePanel);

        JPanel button = new JPanel();
        button.setLayout(new FlowLayout());
        bAggiungi = new JButton("aggiungi");
        bAggiungi.addActionListener(this);
        bAggiungi.setAlignmentX(LEFT_ALIGNMENT);
        button.add(bAggiungi);
        panel.add(button);
        container.add(panel);
    }

    public void aggiungi() {
        persone.add(persone.size(), tCognome.getText() + " " + tNome.getText());
        listaModelPersone.add(listaModelPersone.getSize(), tCognome.getText() + " " + tNome.getText());
        comboBoxModelPersone.addElement(tCognome.getText() + " " + tNome.getText());
        tCognome.setText(" ");
        tNome.setText(" ");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bAggiungi) aggiungi();
    }


    public static void main(String[] args) {
        new Lista();
    }
}