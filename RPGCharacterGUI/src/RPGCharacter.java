public class RPGCharacter {

    /*
    Make a GUI for your RPG Character builder you made in the last Unit. The user should enter primary stats in input box and the GUI
    should display the character's battle stats. The GUI should have at least 4 label, 4 inputs and a button to click which calculates and displays
    the battle stats.
     */
}  public void ChangingColorsGUI(){

    JFrame window;
    JPanel panel;
    JButton colorClicker;
   }
}
 public static ChangingColorGUI(){
        window=new JFrame("Color Changer");
        window.setDefaultCloseOperations(JFrame.EXIT_ON_ClOSE);
        window.setSize(340,127);
        window.setLocationRelativeTo(null);

        panel=new JPanel();
        colorClicker=new JButton("Change the Colors");

        Color panelBackground=new Color(255,212,124);
        Color buttonForeground=new Color(85,43,0);
        Color buttonBackground=new Color(0,117,82);

        panel.setBackground(panelBackground);
        colorClicker.setForeground(buttonForeground);
        colorClicker.setBackground(buttonBackground);




