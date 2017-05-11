import javax.swing.*;
import java.awt.Toolkit;
import java.util.concurrent.TimeUnit;
import java.lang.Exception;
/**
 * Write a description of class MainFrame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainFrame extends JDialog
{
    private Toolkit tk = Toolkit.getDefaultToolkit();
    private int screenDim_X = ((int)tk.getScreenSize().getWidth());
    private int screenDim_Y = ((int)tk.getScreenSize().getHeight());

    private Icon splashPic;
    private JLabel splash;
    /**
     * Constructor for objects of class MainFrame
     */
    public MainFrame()
    {
        //Frame defaults
        setTitle("Atech Helper");
        setSize(900, 500);
        setUndecorated(true);
        setLocation(screenDim_X/2 - 450, screenDim_Y/2-250);

        //Creating splashScreen
        makeSplash();
        add(splash);
        
        setVisible(true);
        System.out.println("CHECKING1");
        
        delay(3);
        
        splash.setVisible(false);
        setVisible(true);
        
        
        
        System.out.println("CHECKING3");
    }
    
    public void delay(int sec)
    {
        try
        {
            TimeUnit.SECONDS.sleep(sec);
        }
        catch(Exception e)
        {
        }
        
    }
    
    public void makeSplash()
    {
        splashPic = new ImageIcon(getClass().getResource("maverick_main.png"));
        splash = new JLabel(splashPic);
        splash.setBounds(500, 500, 500, 500);
    }
}
