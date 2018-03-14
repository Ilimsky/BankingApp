package Calc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldExample implements ActionListener {

    JLabel sumLabel,periodLabel, percentLabel;
    JTextField sumTextField, periodTextField, percentTextField, paymentTextField;
    JButton paymentButton;

    TextFieldExample(){
        JFrame f = new JFrame();
        sumLabel = new JLabel("Введите сумму кредита: ");
        sumLabel.setBounds(10,10,120,20);
        sumTextField = new JTextField();
        sumTextField.setBounds(130,10,120,20);

        periodLabel = new JLabel("Введите срок кредита: ");
        periodLabel.setBounds(10,30,120,20);
        periodTextField = new JTextField();
        periodTextField.setBounds(130,30,120,20);

        percentLabel = new JLabel("Введите %-ую ставку кредита: ");
        percentLabel.setBounds(10,50,120,20);
        percentTextField = new JTextField();
        percentTextField.setBounds(130,50,120,20);

        paymentTextField = new JTextField();
        paymentTextField.setBounds(130,70,120,20);
        paymentButton = new JButton("Рассчитать");
        paymentButton.setBounds(10,70,110,18);
        paymentButton.addActionListener(this);

        f.add(sumLabel);
        f.add(sumTextField);
        f.add(periodLabel);
        f.add(periodTextField);
        f.add(percentLabel);
        f.add(percentTextField);
        f.add(paymentTextField);
        f.add(paymentButton);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String sumString = sumTextField.getText();
        int sum = Integer.parseInt(sumString);

        String periodString = periodTextField.getText();
        int period = Integer.parseInt(periodString);

        String percentString = percentTextField.getText();
        int percent = Integer.parseInt(percentString);

        //double payment = (((percent / 1200 * (Math.pow((1 + percent / 1200), period)))/(Math.pow((1 + percent / 1200), period) - 1)) * sum);
        //String paymentString = String.valueOf(payment);
        //paymentTextField.setText(paymentString);
    }

    public static void main(String[] args) {
        new TextFieldExample();
    }
}
