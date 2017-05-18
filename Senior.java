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

    private JTextArea info_txt;
    private JScrollPane scroller;
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

        info_txt = new JTextArea();
        info_txt.setText("");
        info_txt.setEditable(false);
        scroller = new JScrollPane(info_txt);
        scroller.setBounds(440, 20, 408, 410);

        add(scroller);
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
