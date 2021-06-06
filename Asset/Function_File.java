package Asset;

public class Function_File {
    
    Window gui = new Window(); 

   public Function_File(Window gui) { 
        this.gui = gui; 
    }

    public void newFile() { 

        gui.textarea.setText("");
        gui.window.setTitle("New Blank");
    }
}
