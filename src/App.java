import javax.swing.JOptionPane;

public class App{
    public static void main (String args []){
        String nome;
        
        nome = JOptionPane.showInputDialog("Entre com o nome");
        
        JOptionPane.showMessageDialog(null, "O seu nome é " + nome);
        
    }
}