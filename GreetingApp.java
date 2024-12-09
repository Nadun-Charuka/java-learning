import javax.swing.JOptionPane;

public class GreetingApp {
    public static void main(String args[]){
        String name = JOptionPane.showInputDialog("Hii..Whats your name: ");
        JOptionPane.showMessageDialog(null, "I Love You " + name );

    }
    
}
