import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc extends JFrame{


    private JPanel JPanel;
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JTextField lblResult;
    private JComboBox cbOperations;
    private JButton btnCompute;

    public Calc(){
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tfNumber1.getText().equals("") || tfNumber2.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please fill in Every Box ");
                    return;
                }
                float first = 0, second = 0;
                try {
                     first = Float.parseFloat(tfNumber1.getText());
                     second = Float.parseFloat(tfNumber2.getText());
                }catch(Exception a){
                    JOptionPane.showMessageDialog(null,"Invalid Input");
                    return;
                }
                float result;
                if(cbOperations.getSelectedIndex() == 0)result = first + second;
                else if(cbOperations.getSelectedIndex() == 1) result = first - second;
                else if(cbOperations.getSelectedIndex() == 2) result = first * second;
                else {
                    if (second == 0){
                        JOptionPane.showMessageDialog(null, "Divisor cannot be 0");
                    return;
                }
                    result =  first /  second;
                }
                lblResult.setText(String.valueOf(result));
            }
        });

    }

    public static void main(String[] args) {
        Calc app = new Calc();

        app.setContentPane(app.JPanel);
        app.setSize(1000, 400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Simple Calculator");
        app.setVisible(true);
    }
}
