import javax.swing.*;
/**
 * Contains information to help current mavericks of highschool
 * this may include:
 * 
 * -Helpful tips
 * -What to expect
 * -Classes
 * -Teachers
 * -Tips
 * 
 */
public class Freshmen extends JPanel
{
    private JLabel tester;
    /**
     * Constructor for objects of class Freshmen
     */
    public Freshmen()
    {
        setVisible(false);
        setLayout(null);
        setSize(900, 500);
        tester = new JLabel("Freshmen Panel");
        tester.setBounds(200, 50, 150, 40);
        
        add(tester);
    }
    
    
    public void setPanelVisible(boolean vis)
    {
        if(vis)
        {
            setVisible(true);
        }
        else
        {
            setVisible(false);
        }
    }
}
