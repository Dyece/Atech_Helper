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
    private JTextArea info_txt;
    private JScrollPane scroller;
    /**
     * Constructor for objects of class Freshmen
     */
    public Freshmen()
    {
        setVisible(false);
        setLayout(null);
        setSize(900, 500);
        tester = new JLabel("Freshmen Panel");
        tester.setBounds(200, 150, 150, 40);
       
        info_txt = new JTextArea();
        info_txt.setText("Info goes here");
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
