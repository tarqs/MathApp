package mathapp;

/**
 * Created by Gebruiker on 14-11-2015.
 */
import javax.swing.*;

public class MenuChapter extends JMenu {
    public MenuChapter(String menuname) {
        super(menuname);
        makeChapters();
    }

    private void makeChapters() {
        String listChapters = "Hoofdstuk 1,Hoofdstuk 2,Hoofdstuk 3,Hoofdstuk 4,Hoofdstuk 5,Hoofdstuk 6,Hoofdstuk 7,Hoofdstuk 8,Hoofdstuk 9,Hoofdstuk 10";
        String[] menuItemChapters = listChapters.split(",");

        String listPars = "Paragraaf 1,Paragraaf 2,Paragraaf 3,Paragraaf 4,Paragraaf 5";
        String[] menuItemPars = listPars.split(",");

        for(int i = 0; i < menuItemChapters.length; i += 1){
            JMenu menu = new JMenu(menuItemChapters[i]);
            for(int j = 0; j < menuItemPars.length; j += 1){
                JMenuItem item = new JMenuItem(menuItemPars[j]);
                menu.add(item);
                //item.addActionListener(this);
            }
            this.add(menu);
            if(i == 4){
                this.addSeparator();
            }
        }
    }
}
