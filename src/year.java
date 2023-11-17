import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class year extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;
    private JPanel Jpanel;

    public year() {

        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int yuh = 0;
                try {
                     yuh = Integer.parseInt(tfYear.getText());
                } catch (Exception a){
                    JOptionPane.showMessageDialog(null, "Make sure it is proper year Number");
                    return;
                }
                if (yuh % 400 == 0)
                    JOptionPane.showMessageDialog(null,"Is a Leap Year");
                else if (yuh % 100 == 0)
                    JOptionPane.showMessageDialog(null,"Not a leap year");
                else if (yuh % 4 == 0)
                    JOptionPane.showMessageDialog(null,"Leap year");
                else
                    JOptionPane.showMessageDialog(null,"Not a leap year");
            }
        });
    }
    public static void main(String[] args) {
        year app = new year();

        app.setContentPane(app.Jpanel);
        app.setSize(1000, 400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Leap Year Checker");
        app.setVisible(true);



    }
}
