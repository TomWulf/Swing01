import javax.swing.*;

public class SimpleJFrame
{

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        JButton helloBtn = new JButton("Hello from Swing!");
        HelloClicker clicker = new HelloClicker();

        helloBtn.addActionListener(clicker);

        frame.setTitle("My Little JFrame");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(helloBtn);
    }
}
