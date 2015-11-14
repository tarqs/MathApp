package com.example.menuchapter;

import javax.swing.*;

/**
 * Created by Gebruiker on 13-11-2015.
 */
public class MenuChapter extends JFrame {
    private String menuname;

    public void setMenuChapterName(String header){
        menuname = header;
    }

    private void makeChapters(){
        JMenu menuChap = new JMenu(menuname);

        String listChapters = "Hoofdstuk 1,Hoofdstuk 2,Hoofdstuk 3,Hoofdstuk 4,Hoofdstuk 5,Hoofdstuk 6,Hoofdstuk 7,Hoofdstuk 8,Hoofdstuk 9,Hoofdstuk 10,";
        String[] menuItemChapters = listChapters.split(",");

        String listPars = "Paragraaf 1,Paragraaf 2,Paragraaf 3,Paragraaf 4,Paragraaf 5,";
        String[] menuItemPars = listPars.split(",");

        for(int i=0; i<menuItemChapters.length; i++){
            JMenu menu = new JMenu(menuItemChapters[i]);
            for(int j=0; j<menuItemPars.length; j++){
                JMenuItem item = new JMenuItem(menuItemPars[j]);
                menu.add(item);
            }
            if(i==4){
                menu.addSeparator();
            }
            menuChap.add(menu);
        }
    }
}
