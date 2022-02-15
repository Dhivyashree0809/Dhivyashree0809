import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class windowlist{

    JFrame mainFrame,aboutFrame;
    JLabel headerLabel;
    JLabel statusLabel;
    JPanel controlPanel;

public windowlist(){
 prepareGUI();
                   }
public static void main(String[] args)
{
 windowlist windowDemo=new windowlist();
 windowDemo.showWindowListenerDemo();
}

private void prepareGUI()
{
 mainFrame=new JFrame("Java SWING Examples");
 mainFrame.setSize(400,400);
 mainFrame.setLayout(new GridLayout(3,1));

headerLabel = new JLabel("",JLabel.CENTER);
statusLabel = new JLabel("",JLabel.CENTER);

statusLabel.setSize(350,100);

mainFrame.addWindowListener(new WindowAdapter()
{
 public void windowClosing(WindowEvent windowEvent)
{System.exit(0);}
});

controlPanel = new JPanel();
controlPanel.setLayout(new FlowLayout());

mainFrame.add(headerLabel);
mainFrame.add(controlPanel);
mainFrame.add(statusLabel);
mainFrame.setVisible(true);
}

private void showWindowListenerDemo(){
 headerLabel.setText("Listener in action:WindowListener");
 JButton okButton = new JButton("ok");

 aboutFrame = new JFrame();
 aboutFrame.setSize(300,200);
 aboutFrame.setTitle("WindowListener Demo");
 aboutFrame.addWindowListener(new customWindowListener());

 JPanel panel = new JPanel();
 panel.setBackground(Color.WHITE);
 JLabel msglabel = new JLabel("Welcome",JLabel.CENTER);
 panel.add(msglabel);
 aboutFrame.add(panel);
 aboutFrame.setVisible(true);
}

class customWindowListener implements WindowListener{
 public void windowOpened(WindowEvent e){
System.out.println("Window Open");

}
 public void windowClosing(WindowEvent e){
System.out.println("Window Closing");
aboutFrame.dispose();
}
 public void windowClosed(WindowEvent e){
System.out.println("Window Closed");
}
 public void windowIconified(WindowEvent e){
System.out.println("Window Iconified");
}

 public void windowDeiconified(WindowEvent e){
System.out.println("Window Deiconified");
}
 public void windowActivated(WindowEvent e){
System.out.println("Window Activated");
}
 public void windowDeactivated(WindowEvent e){
System.out.println("Window Deactivated");
}
}
}

 




















