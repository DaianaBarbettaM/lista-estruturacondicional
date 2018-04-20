import javax.swing.JOptionPane; 
public class Exercicio50 {
   public static void main(String[] arg){
       int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
       if ( numero % 2 != 0 ) {
       JOptionPane.showMessageDialog(null,"Esse número é ímpar!");
       } else{
       JOptionPane.showMessageDialog(null,"Esse número não é ímpar!");
       }
   }
}