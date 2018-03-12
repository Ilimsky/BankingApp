import javax.swing.*;

public class TextFields extends JFrame {
    JTextField sumField;
    JLabel sumLabel;

    public TextFields(){
        super("График погашения");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        sumLabel = new JLabel("Введите сумму кредита");

        sumField = new JTextField(10);
        sumField.setToolTipText("Введите сумму кредита");

        JPanel contents = new JPanel();
        contents.add(sumLabel);
        contents.add(sumField);
        setContentPane(contents);
        setSize(400,400);
        setVisible(true);

    }
}
