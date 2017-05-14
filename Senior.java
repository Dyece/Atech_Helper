import javax.swing.*;

/**
 * Contains information to help seniors with their senior year
 * this may include:
 * 
 * -Scholarship information
 * -College Application
 * -Due dates
 * -Helpful tips
 * -What to avoid
 */
public class Senior extends JPanel
{
    private JLabel tester;
    /**
     * Constructor for objects of class Seniors
     */
    public Senior()
    {
        setVisible(false);
        setLayout(null);
        setSize(900, 500);
        
        tester = new JLabel("Senior Panel");
        tester.setBounds(200, 150, 150, 40);

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
