import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;
import java.lang.Exception;
/**
 * Main menu of the aplication
 *
 */
public class MainFrame extends JDialog
{
    private Toolkit tk = Toolkit.getDefaultToolkit();
    private int screenDim_X = ((int)tk.getScreenSize().getWidth());
    private int screenDim_Y = ((int)tk.getScreenSize().getHeight());
    private final int SCREEN_X = 900;
    private final int SCREEN_Y = 500;
    //Panels
    private JPanel basePanel = new JPanel();
    private Freshmen feshPanel = new Freshmen();
    private Senior seniorPanel = new Senior();
    //J features
    private Icon splashPic;
    private Icon bannerPic;
    private Icon exitPic;
    
    private JLabel splash_lbl;
    private JLabel banner_lbl;
    private JLabel exit_lbl;
    /**
     * Constructor for objects of class MainFrame
     */
    public MainFrame()
    {
        //Frame defaults
        setTitle("Atech Helper");
        setSize(SCREEN_X, SCREEN_Y);
        setLocation(screenDim_X/2 - 450, screenDim_Y/2-250);

        //Create Base panel
        basePanel.setSize(SCREEN_X, SCREEN_Y);
        basePanel.setLayout(null);

        
        //Creating splashScreen
        makeSplash();

        //remove splash after delay
        delay(3);
        splash_lbl.setVisible(false);

        //
        bannerPic = new ImageIcon(getClass().getResource("Images/banner.png"));
        banner_lbl = new JLabel(bannerPic);
        banner_lbl.setBounds(0, 0, 900, 40);
        
        exitPic = new ImageIcon(getClass().getResource("Images/exit.png"));
        exit_lbl = new JLabel(exitPic);
        exit_lbl.setBounds(860, 0, 40, 40);
        
        basePanel.add(exit_lbl);
        basePanel.add(banner_lbl);
        
        //end
        add(basePanel);
        repaint();

        setVisible(true);
        setLocationRelativeTo(null);
    }//end of MainFrame contructor

    /*
     * Delay
     * 
     * 
     */
    public void delay(int sec)
    {
        try
        {
            TimeUnit.SECONDS.sleep(sec);
        }
        catch(Exception e)
        {
            splash_lbl.setVisible(false);
        }
    }//end of delay method
    
    public void makeSplash()
    {
        splashPic = new ImageIcon(getClass().getResource("Images/maverick_main.png"));
        splash_lbl = new JLabel(splashPic);
        splash_lbl.setBounds(0, 0, SCREEN_X, SCREEN_Y);
        add(splash_lbl);
        setVisible(true);
    }
}
