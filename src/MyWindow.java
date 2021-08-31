import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class MyWindow extends JFrame {
    public MyWindow() {

        setLocation(500, 200);
        setSize(600,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton myButton = new JButton("Exit");
        ActionListener button = new Close();
        myButton.addActionListener(button);
        JButton myTwoButton = new JButton("Hi");
        JPanel myPanel = new JPanel(new GridLayout(2, 1));
        myPanel.add(myButton);
        myPanel.add(myTwoButton);
        add(myPanel, BorderLayout.SOUTH);
        setVisible(true);



    }
}
