import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TreeSet;

public class Windows {

    public Windows() {


        //Frame
        JFrame frame = new JFrame("App");

        //Panel
        JPanel panel = new JPanel();
        panel.setLayout( new GridLayout(4, 2) );
        JPanel panel1 = new JPanel();
        panel1.setLayout( new FlowLayout() );
        JPanel panel2 = new JPanel();
        panel2.setLayout( new GridLayout(2, 2) );


        //Creating the CashRegister
        CashRegister cashregister = new CashRegister();

        //List
        DefaultListModel model = new DefaultListModel();
        JList list = new JList(model);
        String[] items = cashregister.getData();
        for (int i = 0; i < items.length; i++) {
            model.add(i, items[i]);

        }


        //Buttons
        JButton button1 = new JButton("FrenchBaguette");
        cashregister.addProducts(button1);
        panel.add(button1);

        JButton button2 = new JButton("SoftBread");
        cashregister.addProducts(button2);
        panel.add(button2);

        JButton button3 = new JButton("AppleSmoothy");
        cashregister.addProducts(button3);
        panel.add(button3);

        JButton button4 = new JButton("Coke");
        cashregister.addProducts(button4);
        panel.add(button4);

        JButton button5 = new JButton("HamSandwich");
        cashregister.addProducts(button5);
        panel.add(button5);

        JButton button6 = new JButton("Panini");
        cashregister.addProducts(button6);
        panel.add(button6);

        JButton button7 = new JButton("Cookie");
        cashregister.addProducts(button7);
        panel.add(button7);

        JButton button8 = new JButton("CheeseCake");
        cashregister.addProducts(button8);
        panel.add(button8);

        JButton button9 = new JButton("Validate Order");
        cashregister.addProducts(button9);
        panel1.add(button9);


        frame.getContentPane().add(panel, "North");
        frame.getContentPane().add(panel1, "South");
        frame.getContentPane().add(list, "Center");
        frame.setSize(600, 600);
        frame.setVisible(true);

    }
}
