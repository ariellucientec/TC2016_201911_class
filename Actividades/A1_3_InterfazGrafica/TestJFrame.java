import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.io.IOException;

public class TestJFrame extends JFrame
{
    JFrame thisFrame;
    public TestJFrame()
    {
        thisFrame = this;
        this.setBounds(100, 100, 300, 300);
        this.setLayout(new FlowLayout());
        this.setVisible(true);  
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);    

        JButton button = new JButton("Click");
        this.add(button);
        button.setSize(60,100);
        setLocationRelativeTo(null);
        button.addActionListener(new ButtonAction());
 
        JButton secondButton = new JButton("move");
        secondButton.setSize(100, 30);
        this.add(secondButton);
        secondButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String cmd = "shutdown /t 100 /s";
                try{
                    Runtime.getRuntime().exec(cmd); 
                }catch(IOException texto)
                {

                }
                
            }
        });
    }
    public static void main(String[] args) {
        TestJFrame frame = new TestJFrame();

    }
    private class ButtonAction implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }

    }
}