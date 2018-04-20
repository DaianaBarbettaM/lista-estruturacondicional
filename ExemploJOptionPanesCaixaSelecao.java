
import javax.swing.JOptionPane; 

public class ExemploJOptionPanesCaixaSelecao{

   public static void main(String[] arg){

      String opcaoSelecionada = JOptionPane.showInputDialog(null,
       "Selecione um estado",
       "Sistema - Da Vovó",
    JOptionPane.QUESTION_MESSAGE,
    null,
    new Object []{
        "", "PR","SC","RS"
    },
    ""
       ).toString();
       System.out.println(opcaoSelecionada);
       if(opcaoSelecionada.equals("SC")){
           System.out.println("Santa Catarina");
       }else if(opcaoSelecionada.equals("PR")){
           System.out.println("Paraná");
       }else if (opcaoSelecionada.equals("RS")){
           System.out.println("Rio Grande do Sul");
       }
     }
    
   }
