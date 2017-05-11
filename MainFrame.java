import javax.swing.*;
/**
 * Write a description of class MainFrame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainFrame extends JFrame
{
    private Icon splashPic;
    private JLabel splash;
    /**
     * Constructor for objects of class MainFrame
     */
    public MainFrame()
    {
        setTitle("Atech Helper");
        setSize(900, 500);
        
        splashPic = new ImageIcon(getClass().getResource("maverick.jpg"));
        splash = new JLabel(splashPic);
        splash.setBounds(500, 500, 500, 500);
        
        
        
        add(splash);
        
        setVisible(true);
    }

}
