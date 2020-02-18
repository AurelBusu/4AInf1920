import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calcolatrice extends JFrame implements ActionListener {

    JLabel numero1;
    JLabel numero2;
    JTextField tNum1;
    JTextField tNum2;
    JButton somma;
    JButton sottrazione;
    JButton moltiplicazione;
    JButton divisione;
    JLabel risultato;

    public Calcolatrice(){
        setSize(400, 200);
        setLocation(200, 200);
        setTitle("calcolatrice");
        initComponents();
        setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void initComponents() {
        this.setLayout(new FlowLayout());
        numero1 = new JLabel("numero1: ");
        this.add(numero1);
        tNum1 = new JTextField(10);
        this.add(tNum1);
        numero2 = new JLabel("numero2: ");
        this.add(numero2);
        tNum2 = new JTextField(10);
        this.add(tNum2);
        somma = new JButton("somma");
        this.add(somma);
        sottrazione = new JButton("differenza");
        this.add(sottrazione);
        moltiplicazione = new JButton("moltiplicazione");
        this.add(moltiplicazione);
        divisione = new JButton("divisione");
        this.add(divisione);
        risultato = new JLabel("risultato: ");
        this.add(risultato);
        somma.addActionListener(this);
        sottrazione.addActionListener(this);
        moltiplicazione.addActionListener(this);
        divisione.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == somma){
            risultato.setText(String.valueOf((Double.parseDouble(tNum1.getText())) + (Double.parseDouble(tNum2.getText()))));
        }
        if(actionEvent.getSource() == sottrazione){
            risultato.setText(String.valueOf((Double.parseDouble(tNum1.getText())) - (Double.parseDouble(tNum2.getText()))));
        }
        if(actionEvent.getSource() == moltiplicazione){
            risultato.setText(String.valueOf((Double.parseDouble(tNum1.getText())) * (Double.parseDouble(tNum2.getText()))));
        }
        if(actionEvent.getSource() == divisione){
            risultato.setText(String.valueOf((Double.parseDouble(tNum1.getText())) / (Double.parseDouble(tNum2.getText()))));
        }

    }

    public static void main(String[] args) {
        Calcolatrice calcolatrice = new Calcolatrice();
    }
}