import javax.swing.JOptionPane; 
public class Exercicio08{
public static void main(String[] arg){
   double agua = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da água:"));
   double luz = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da luz:"));
   double oi = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da oi:"));
   double net = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da net:"));
   double vivo = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da vivo:"));
   double iptu = Double.parseDouble(JOptionPane.showInputDialog("Informeo valor do iptu:"));
   double ipva = Double.parseDouble(JOptionPane.showInputDialog("Informeo valor do ipva:"));
   double seguroDoCarro = Double.parseDouble(JOptionPane.showInputDialog("Informe o seguro do carro:"));
   double contasTelefonicas = (net+vivo+oi);
   JOptionPane.showInputDialog("Valor total das contas telefonicas "+ contasTelefonicas );
   double impostos = (iptu+ipva);
   JOptionPane.showInputDialog("Valor total dos impostos é " + impostos);
   double contasRestantes = (agua+luz);
   JOptionPane.showInputDialog("Valor das contas restantes é "  +contasRestantes);
   double total = (agua+luz+oi+net+vivo+iptu+ipva);
   JOptionPane.showInputDialog = ("Valor total das contas é " + total);
 }
}