import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class checki extends JFrame{
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private javax.swing.JPanel JPanel;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;


    public checki(){
        btnOrder.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
            double sum =0;
            if(cPizza.isSelected()) sum+= 100;
            if(cBurger.isSelected()) sum+= 80;
            if(cFries.isSelected()) sum+= 65;
            if(cSoftDrinks.isSelected()) sum += 55;
            if(cTea.isSelected()) sum += 50;
            if(cSundae.isSelected()) sum += 40;

            if(sum == 0){
                JOptionPane.showMessageDialog(null, "Check an option first before ordering!");
                return;
            }
            double order;
            if(rbNone.isSelected()) order = sum;
            else if(rb5.isSelected()) order = sum *0.95;
            else if(rb10.isSelected()) order = sum * 0.90;
            else order = sum* 0.85;

            JOptionPane.showMessageDialog(null, "The total price is Php " + order);


        }
        });
    }

    public static void main(String[] args) {
        checki app = new checki();

        app.setContentPane(app.JPanel);
        app.setSize(700, 700);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Food Ordering System");
        app.setVisible(true);
    }
}
