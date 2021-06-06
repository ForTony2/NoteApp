package Asset;
import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window implements ActionListener{ 
    Font font = new Font("Arial",Font.BOLD,18); 
    JTextArea textarea = new JTextArea(); 
    Function_File f = new Function_File(this); 
    JFrame window = new JFrame(); 
Window() { 
    createWindow();
    createTextArea();
    createMenuBar();
    
}

public void createTextArea() { 
   
    textarea.setFont(font);
    JScrollPane ScrollPane = new JScrollPane(textarea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED); 
    ScrollPane.setBorder(BorderFactory.createEmptyBorder());
    window.add(ScrollPane);

}


public void createMenuBar() {

    JMenuBar Menu = new JMenuBar(); 
    window.setJMenuBar(Menu);

    JMenu file = new JMenu("File"); 
    JMenuItem iSave = new JMenuItem("Save");
    JMenuItem iOpen = new JMenuItem("Open");
    JMenuItem iExit = new JMenuItem("Exit");
    JMenuItem iNew = new JMenuItem("New");
    file.add(iNew); 
    iNew.addActionListener(this);
    iNew.setActionCommand("New");
    file.add(iSave);
    file.add(iOpen);
    file.add(iExit);
    Menu.add(file);
    

    JMenu Format = new JMenu("Set Format"); 
    JMenuItem iFont = new JMenuItem("Change Font");
    JMenuItem iSize = new JMenuItem("Change Size");
    Format.add(iFont);
    Format.add(iSize);
    Menu.add(Format);
    

    JMenu Info = new JMenu("?"); 
    JMenuItem iPersonalInformation = new JMenuItem("?");
    Info.add(iPersonalInformation);
    Menu.add(Info);
    

}

public void createWindow() { 
    
    window.setBounds(1,1,600, 600);
    window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    window.setVisible(true);
}

@Override
public void actionPerformed(ActionEvent e) {
   
    String commandex = e.getActionCommand(); 

    switch(commandex) {

        case "New":
        f.newFile();
        break;

    } 
}






}