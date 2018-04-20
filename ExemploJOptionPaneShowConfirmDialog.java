import javax.swing.JOptionPane; 
public class ExemploJOptionPaneShowConfirmDialog{
   public static void main(String[] arg){
       
       int opcao = JOptionPane.showConfirmDialog(null,"Deseja cadastrar","AVISO", JOptionPane.YES_NO_OPTION);

       if (opcao == JOptionPane.OK_OPTION){
           JOptionPane.showMessageDialog(null,"Registrado com sucesso!");
       } else if (opcao == JOptionPane.NO_OPTION) {
           JOptionPane.showMessageDialog(null, "Não registrado");
       } else if (opcao == JOptionPane.CANCEL_OPTION){
           JOptionPane.showMessageDialog(null,"Cancelado com sucesso!");
       } else {
           JOptionPane.showMessageDialog(null,"Fechado");

       }
   }
}