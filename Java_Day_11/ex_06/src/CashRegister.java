import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JList;
import javax.swing.table.DefaultTableModel;


public class CashRegister {


    private ArrayList<String> order = new ArrayList<>();
    private String[] data = new String[]{};



    public String[] getData() {
        for(int i = 0; i<this.order.size(); i++){
            this.data[i] = this.order.get(i);
        }
        return data;
    }


    public ArrayList<String>getOrder() {
        return order;
    }

    public void addProducts(JButton button){
       if(button.getText() == "FrenchBaguette"){
           button.addActionListener(
                   new ActionListener(){
                       public void actionPerformed(ActionEvent e) {
                           Bread frenchBaguette = new FrenchBaguette();
                           System.out.println(frenchBaguette);
                           order.add(button.getText());
                       }
                   });
       }
       else if(button.getText() == "SoftBread"){
           button.addActionListener(
                   new ActionListener(){
                       public void actionPerformed(ActionEvent e) {
                           Bread softBread = new SoftBread();
                           System.out.println(softBread);
                           order.add(button.getText());
                       }
                   });
       }
       else if(button.getText() == "AppleSmoothy"){
           button.addActionListener(
                   new ActionListener(){
                       public void actionPerformed(ActionEvent e) {
                           Drink appleSmoothy = new AppleSmoothy();
                           System.out.println(appleSmoothy);
                           order.add(button.getText());

                       }
                   });
       }else if(button.getText() == "Coke"){
           button.addActionListener(
                   new ActionListener(){
                       public void actionPerformed(ActionEvent e) {
                           Drink coke = new Coke();
                           System.out.println(coke);
                           order.add(button.getText());

                       }
                   });
       }else if(button.getText() == "HamSandwich"){
           button.addActionListener(
                   new ActionListener(){
                       public void actionPerformed(ActionEvent e) {
                           Sandwich hamSandwich = new HamSandwich();
                           System.out.println(hamSandwich);
                           order.add(button.getText());

                        }
                   });
       }else if(button.getText() == "Panini"){
           button.addActionListener(
                   new ActionListener(){
                       public void actionPerformed(ActionEvent e) {
                           Sandwich panini = new Panini();
                           System.out.println(panini);
                           order.add(button.getText());

                       }
                   });
       }else if(button.getText() == "Cookie"){
           button.addActionListener(
                   new ActionListener(){
                       public void actionPerformed(ActionEvent e) {
                           Dessert cookie = new Cookie();
                           System.out.println(cookie);
                           order.add(button.getText());

                       }
                   });
       }else if(button.getText() == "CheeseCake"){
           button.addActionListener(
                   new ActionListener(){
                       public void actionPerformed(ActionEvent e) {
                           Dessert cheeseCake = new CheeseCake();
                           System.out.println(cheeseCake);
                           order.add(button.getText());

                       }
                   });
       }else if(button.getText() == "Validate Order"){
           button.addActionListener(
                   new ActionListener(){
                       public void actionPerformed(ActionEvent e) {
                           System.out.println(order);
                       }
                   });
       }

       }
}
