import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args)
    {
        // LaunchPage launchPage = new LaunchPage();

        // JOptionPane = pop up a standard dialog box that prompts users for a value
        //               or informs them of something

        //JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
       // JOptionPane.showMessageDialog(null, "Here is more useless info :D", "title", JOptionPane.INFORMATION_MESSAGE);
       // JOptionPane.showMessageDialog(null, "really ?", "title", JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "You're computer has A VIRUS!!!", "title", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Call tech support NOW OR ELSE!!!", "title", JOptionPane.ERROR_MESSAGE);


        // System.out.println(JOptionPane.showConfirmDialog(null, "bro, do you even code ?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION));

        //int answer = JOptionPane.showConfirmDialog(null, "bro, do you even code ?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
        //String name = JOptionPane.showInputDialog("What is your name?: ");
        //System.out.println("Hello" +" "+ name);

        ImageIcon icon = new ImageIcon(Main.class.getResource("/smile.png"));

        // Redimensionne l'îcone
        Image image = icon.getImage(); // transformation de l'icône en image
        Image newing = image.getScaledInstance(40,40, Image.SCALE_SMOOTH);
        icon = new ImageIcon(newing); // image est redimensionné en imageIcon pour être utilisé dans un label

        String[] responses = {"No, you're awesome!", "thank you!","*blush*"};


        JOptionPane.showOptionDialog(
                null,
                "You are awesome!",
                "secret message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                responses,
                0);

    }
}