package Temporary;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldTest extends JFrame {
    JTextField smallField;
    JLabel label;

    public TextFieldTest(){
        super("Текстовые поля");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        label = new JLabel("Input");
        //label.setBounds(20,10,80,30);

        smallField = new JTextField(15);
        smallField.setToolTipText("Короткое поле");
        smallField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(TextFieldTest.this, "Ваше слово: " + smallField.getText());
            }
        });

        JPanel contents = new JPanel(new FlowLayout(FlowLayout.LEFT));
        contents.add(label);
        contents.add(smallField);
        setContentPane(contents);

        setSize(400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextFieldTest();
    }
}
