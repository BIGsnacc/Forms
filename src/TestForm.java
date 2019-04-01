import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;



public class TestForm implements ActionListener {
    //Declaration of all of the private variables
    private JFrame frame;
    private JMenu menu;
    private JMenuItem option1, option2;
    private JCheckBox checkBox;
    private String text;
    private JButton button;
    private JTextField textField;
    public static void main(String[] args) {

        new TestForm();
    }

    private TestForm(){
        //Creating the frame and the menus
        frame = new JFrame("Word/Phrase Analysis");
        JMenuBar menuBar = new JMenuBar();
        menu = new JMenu("Menu");
        option1 = new JMenuItem("Directions");
        option2 = new JMenuItem("Surprise Phrase");


        //Creating the button
        button = new JButton(("Test Checkbox"));
        button.setBounds(100,100,150,40);
        //Creating the textfield
        textField = new JTextField("Hi there");
        textField.setFont(new Font("Comic Sans", Font.ITALIC, 14));
        textField.setBounds(100,50,200,20);
        //Creating the checkbox
        checkBox = new JCheckBox("Check Length of text");
        checkBox.setBounds(100, 10, 250, 25 );
        //Adding the menu itself to the frame
        menu.add(option1);
        menu.add(option2);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);


        //Adding of the action listeners to see when something is clicked
        button.addActionListener(this);

        option1.addActionListener(this);

        option2.addActionListener(this);
        //Adding everything to the frame and setting the frame's attributes
        frame.add(button);
        frame.add(textField);
        frame.add(checkBox);
        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    //If statements to display messages if certain things are selected and clicked
    public void actionPerformed(ActionEvent e) {
        String message;

        if (e.getSource() == option1){
            message = "Write a phrase in the text field. To check the length of the phrase, select the checkbox and click the button. To check to see where the letter 'e' is (if it is in your phrase), deselect the checkbox and simply click the button.";
            showMessage(message);
        }

        if (e.getSource() == option2){
            message = "Menu 2 Clicked";
            showMessage(message);
        }

        if (e.getSource() == button){
            text = textField.getText();
            if (checkBox.isSelected()) {
                message = text + " has a length of " + text.length();
                showMessage(message);
            } else {

                if (!text.contains("e")){
                    message = "You did not have the letter 'e' in your word/phrase.";
                    showMessage(message);
                } else{
                    message = "The first letter e is number " + text.indexOf("e") + " on the index of your word/phrase.";
                    showMessage(message);
                }

            }

        }
    }

    //The show message method
    private static void showMessage(String message){
        JOptionPane.showMessageDialog(null, message);
    }










}
