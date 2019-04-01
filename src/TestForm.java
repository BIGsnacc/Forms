import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class TestForm implements ActionListener {
    private JFrame frame;
    private JMenu menu;
    private JMenuItem option1, option2;
    private JCheckBox checkBox;
    private String text;
    private JButton button;



    private TestForm(){
        frame = new JFrame();
        JMenuBar menuBar = new JMenuBar();
        menu = new JMenu("Menu");
        option1 = new JMenuItem("Surprise Word");
        option2 = new JMenuItem("Surprise Phrase");



        button = new JButton(("click"));
        button.setBounds(100,100,100,40);

        JTextField textField = new JTextField("Hi there");
        textField.setBounds(100,50,200,20);

        checkBox = new JCheckBox("Check Me.");
        checkBox.setBounds(175, 1, 170, 10 );

        menu.add(option1);
        menu.add(option2);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        text = textField.getText();

        button.addActionListener(this);

        option1.addActionListener(this);

        option2.addActionListener(this);

        frame.add(button);
        frame.add(textField);
        frame.add(checkBox);
        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        String message;

        if (e.getSource() == option1){
            message = "Menu Clicked";
            showMessage(message);
        }

        if (e.getSource() == option2){
            message = "Menu 2 Clicked";
            showMessage(message);
        }

        if (e.getSource() == button){

            if (checkBox.isSelected()) {
                message = text + " has a length of " + text.length();
                showMessage(message);
            } else {
                message = "The letter e is the " + text.indexOf("e") + " letter of your word or phrase.";
                showMessage(message);
            }
        }
    }

    private static void showMessage(String message){
        JOptionPane.showMessageDialog(null, message);
    }


    public static void main(String[] args) {

    new TestForm();


    }







}
