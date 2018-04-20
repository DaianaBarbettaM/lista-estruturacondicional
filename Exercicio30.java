import javax.swing.JOptionPane; 
public class Exercicio30{
   public static void main(String[] arg){
      int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número: "));
      int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro número: "));
      int operacao = Integer.parseInt(JOptionPane.showInputDialog(null,"Para calcular escolha uma opção: " + 
                                                                    "\n1 Somar: " +
                                                                     "\n2 Subtrair: " + 
                                                                     "\n3 Multiplicar: " + 
                                                                     "\n4 Dividir: "));
      if(operacao==1){
        int resultado = (numero1 + numero2);
        JOptionPane.showMessageDialog(null,"O resultado é: " + resultado);
       } else if(operacao==2){
         int resultado = (numero1 - numero2);
         JOptionPane.showMessageDialog(null,"O resultado é: " + resultado);
       } else if (operacao==3){
         int resultado = (numero1 * numero2);
         JOptionPane.showMessageDialog(null,"O resultado é: "+ resultado);
       } else if (operacao==4){
         int resultado = (numero1 / numero2);
         JOptionPane.showMessageDialog(null, "O resultado é: "+resultado);
       }
    
  
      
  
    }
} 