import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import javax.swing.*;
/*
 * NOT associated with the project
 * class is mainly uses for testing
 */
public class LabelHoverTest extends JFrame {

    Icon pic1;
    Icon pic2;
    JLabel label;

    public LabelHoverTest(String title) {
        super(title);
        pic1 = UIManager.getIcon("OptionPane.informationIcon");
        pic2 = UIManager.getIcon("OptionPane.questionIcon");
        createAndShowUI();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new LabelHoverTest("Label Hover Test").setVisible(true);
            }
        });
    }

    private void createAndShowUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        addComponentsToPane(getContentPane());
        setSize(300, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void addComponentsToPane(Container contentPane) {
        label = new JLabel(pic1);

        contentPane.add(label, BorderLayout.CENTER);

        label.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label.setIcon(pic2);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label.setIcon(pic1);
            }
        });
    }
}