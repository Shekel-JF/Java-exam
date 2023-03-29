import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtons
{
    public static void main(String[] args)
    {
            JFrame frame = new JFrame("Frame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 280);

            JPanel panel = new JPanel();
            frame.add(panel);

            JLabel label = new JLabel("Label");
            panel.add(label);

            JTextArea field = new JTextArea(10, 30);
            panel.add(field);
            JScrollPane pane = new JScrollPane(field);
            panel.add(pane);

            JButton button = new JButton("write_out");
            panel.add(button);
            button.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    String text = field.getText();
                    System.out.println(text);
                }
            });
            frame.setVisible(true);
    }
}

