import com.example.menuchapter.MenuChapter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Gebruiker on 13-11-2015.
 */
public class DigitaleMethode extends JFrame {
    public DigitaleMethode(){
        initUI();
    }

    private void initUI(){
        createMenuBar();

        setTitle("Getal & Ruimte");
        setSize(300,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createMenuBar(){
        JMenuBar menubar = new JMenuBar();
        ImageIcon iconExit = new ImageIcon("exit.png");

        MenuChapter theorie = new MenuChapter();
        theorie.setMenuChapterName("Theorie");

        JMenuItem exitMen = new JMenuItem("Exit",iconExit);
        exitMen.setToolTipText("Exit application");

        exitMen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

        theorie.add(exitMen);
        menubar.add(theorie);
        setJMenuBar(menubar);

    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                DigitaleMethode ex = new DigitaleMethode();
                ex.setVisible(true);
            }
        });
    }
}
