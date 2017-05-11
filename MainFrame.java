import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;
import java.lang.Exception;
/**
 * Main menu of the aplication
 *
 */
public class MainFrame extends JFrame
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
    private JLabel splash_lbl;
    private JLabel banner_lbl;
    /**
     * Constructor for objects of class MainFrame
     */
    public MainFrame()
    {
        //Frame defaults
        setTitle("Atech Helper");
        setSize(SCREEN_X, SCREEN_Y);
        setUndecorated(true);
        setLocation(screenDim_X/2 - 450, screenDim_Y/2-250);

        //Creating splashScreen
        makeSplash();
        add(splash_lbl);
        setVisible(true);
        
        //remove splash after delay
        delay(3);
        splash_lbl.setVisible(false);
        setVisible(true);
        
        //Create Base panel
        basePanel.setSize(SCREEN_X, SCREEN_Y);
        basePanel.setLayout(null);
        basePanel.setBackground(Color.BLUE);
        
        bannerPic = new ImageIcon(getClass().getResource("Images/banner.png"));
        banner_lbl = new JLabel(bannerPic);
        banner_lbl.setBounds(900, 40, 200, 200);
        
        
        basePanel.add(banner_lbl);
       
        //end
        add(basePanel);
        
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
    
    /*
     * makeSplash
     * 
     * 
     */
    public void makeSplash()
    {
        splashPic = new ImageIcon(getClass().getResource("Images/maverick_main.png"));
        splash_lbl = new JLabel(splashPic);
        splash_lbl.setBounds(500, 500, 500, 500);
    }//end of makeSplash method
}
