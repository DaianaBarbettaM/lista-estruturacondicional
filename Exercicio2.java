import javax.swing.JOptionPane; 
public class Exercicio2{
   public static void main(String[] arg){
      int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número "));
      if(numero<=-1){
         JOptionPane.showMessageDialog(null,"Esse numero é negativo");
      }else  {
         JOptionPane.showMessageDialog(null,"Esse número não é negativo");
    }
}
}
