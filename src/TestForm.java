import javax.swing.*;

public class TestForm {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b = new JButton(("click"));
        b.setBounds(130,100,100,40);

        JTextField t = new JTextField("Hi there");
        t.setBounds(100,50,200,20);



        f.add(b);
        f.add(t);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);



    }

}
