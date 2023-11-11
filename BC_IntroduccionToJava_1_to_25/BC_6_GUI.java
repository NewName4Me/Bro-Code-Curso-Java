package brocodecourse;
import javax.swing.JOptionPane;

public class BC_6_GUI {
    public static void main(String[]args){
        
        String name=JOptionPane.showInputDialog("Cómo te llamas");
        JOptionPane.showMessageDialog(null,"Hola "+ name);
        
        int age=Integer.parseInt(JOptionPane.showInputDialog("Cuántos años tienes"));
        //como es un int y no string necesitamos el Interger.parseInt
        JOptionPane.showMessageDialog(null, "Tienes "+age+" años");
        //si cambias showMessageDialog por showConfirmDialog te pone una opcion de sí, no y cancelar
        
        double height=Double.parseDouble(JOptionPane.showInputDialog("Cuántos mides"));
        JOptionPane.showMessageDialog(null, "Mides "+height+" cm");
        
        
    }
}
