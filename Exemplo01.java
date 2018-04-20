mport javax.swing.JOptionPane;

public class Exemplo01
{

 public static void main (String[] args) {

   String nome = JOptionPane.showInputDialog("Informe seu nome: ");
   String corPreferida = JOptionPane.showInputDialog("Informe sua cor preferida: ");
   int idade = Integer.parseint("Informe sua idade: ");
   double peso = Double.parseDouble("Informe seu peso: ");
   double altura = Double.parseDouble("Informe sua altura: ");
   String bairro = JOptionPane.showInputDialog("Informe seu bairro: ");
   String numero = JOptionPane.showInputDialog("Informe número da casa: ");
   String cidade = JOptionPane.showInputDialog("Informe sua cidade: ");
   String estado = JOptionPane.showInputDialog("Informe seu estado: ");
   String cpf = JOptionPane.showInputDialog("Informe seu cpf: ");
   String pis = JOptionPane.showInputDialog("Informe numero do pis: ");
   
   JOptionPane.showMessageDialog(null,"nome: \n"+"cor preferida: \n" + "idade: \n"+"peso \n"+"altura: \n"+
  "bairro: \n"+"numero: \n"+"cidade: \n"+"estado: \n"+"cpf: \n"+"pis: \n");
     
 }
}