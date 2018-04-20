import javax.swing.JOptionPane; 
public class ExemploJOptionPaneshowOptionDialog{
   public static void main(String[] arg){
      int opao = JOptionPane.showOptionDialog(null,"Selecione o menu desejado!", 
       "MENU DO SISTEMA",
        0,
       JOptionPane.QUESTION_MESSAGE, 
       null, 
       new Object[]{ 
           "Cadastro","Edição","Lista"
         },
       "Lista");

       if(opcao == 1){
          JOptionPane.showMessageDialog(null"Edição selecionada");
       }else if(opcao == 0){
           ExemploJOptionPane.showMessageDialog(null,"Cadastro selecionado");
       }else if(opcao == 2){
           JOptionPane.showMessageDialog(null,"Lista selecionada");
       }

        System.out.println(opcao);
   }
}