
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Finestra extends JFrame implements ActionListener {

    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;

    public Finestra()
    {
        setSize(300,300);
        setLocation(200, 200);
        setTitle("tris");
        initComponets();
        setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void initComponets() {
        this.setLayout(new GridLayout(3,3));
        button1 = new JButton();
        this.add(button1);
        button1.addActionListener(this);
        button2 = new JButton();
        this.add(button2);
        button2.addActionListener(this);
        button3 = new JButton();
        this.add(button3);
        button3.addActionListener(this);
        button4 = new JButton();
        this.add(button4);
        button4.addActionListener(this);
        button5 = new JButton();
        this.add(button5);
        button5.addActionListener(this);
        button6 = new JButton();
        this.add(button6);
        button6.addActionListener(this);
        button7 = new JButton();
        this.add(button7);
        button7.addActionListener(this);
        button8 = new JButton();
        this.add(button8);
        button8.addActionListener(this);
        button9 = new JButton();
        this.add(button9);
        button9.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String txt = "";
        Object source = actionEvent.getSource();
        if (button1.equals(source)) {
            txt = button1.getText();
            if (txt.equalsIgnoreCase("x")) {
                txt = "O";
            } else {
                txt = "X";
            }
            button1.setText(txt);
        }
        if (button2.equals(source)) {
            txt = button2.getText();
            if (txt.equalsIgnoreCase("x")) {
                txt = "O";
            } else {
                txt = "X";
            }
            button2.setText(txt);
        }
        if (button3.equals(source)) {
            txt = button3.getText();
            if (txt.equalsIgnoreCase("x")) {
                txt = "O";
            } else {
                txt = "X";
            }
            button3.setText(txt);
        }
        if (button4.equals(source)) {
            txt = button4.getText();
            if (txt.equalsIgnoreCase("x")) {
                txt = "O";
            } else {
                txt = "X";
            }
            button4.setText(txt);
        }
        if (button5.equals(source)) {
            txt = button5.getText();
            if (txt.equalsIgnoreCase("x")) {
                txt = "O";
            } else {
                txt = "X";
            }
            button5.setText(txt);
        }
        if (button6.equals(source)) {
            txt = button6.getText();
            if (txt.equalsIgnoreCase("x")) {
                txt = "O";
            } else {
                txt = "X";
            }
            button6.setText(txt);
        }
        if (button7.equals(source)) {
            txt = button7.getText();
            if (txt.equalsIgnoreCase("x")) {
                txt = "O";
            } else {
                txt = "X";
            }
            button7.setText(txt);
        }
        if (button8.equals(source)) {
            txt = button8.getText();
            if (txt.equalsIgnoreCase("x")) {
                txt = "O";
            } else {
                txt = "X";
            }
            button8.setText(txt);
        }
        if (button9.equals(source)) {
            txt = button9.getText();
            if (txt.equalsIgnoreCase("x")) {
                txt = "O";
            } else {
                txt = "X";
            }
            button9.setText(txt);
        }
    }

    public static void main(String[] args) {
        Finestra finestra = new Finestra();
    }

}
