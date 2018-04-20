
import javax.swing.JOptionPane; 
import javax.swing.ImageIcon; 

public class ExemploJOptionPaneIncone{

   public static void main(String[] arg){

       JOptionPane.showMessageDialog(null, "Olá Mundo",
       "Sistema da vovó", JOptionPane.WARNING_MESSAGE,
          new ImageIcon(ExemploJOptionPaneIncone.class.getResource
           ("/imagens/imagens1.png")
       )
       
       );
   }
}