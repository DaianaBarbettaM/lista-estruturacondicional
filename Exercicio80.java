import javax.swing.JOptionPane; 
public class Exercicio80{
   public static void main(String[] arg){

      String primeiroPedido = JOptionPane.showInputDialog(null,   "NOME                                                         VALOR"+
                                                                "\nBolo Brigadeiro...............................................R$ 29.50"+
                                                                "\nBolo Floresta Negra...........................................R$  2.00"+
                                                                "\nBolo Leite com nutella........................................R$ 29.23"+
                                                                "\nBolo Mousse de Chocolate......................................R$  7.10"+
                                                                "\nBolo Nega Maluca..............................................R$ 19.33"+
                                                                "\nBomba de Creme................................................R$ 17.71"+
                                                                "\nBomba de Morango..............................................R$  4.82"+
                                                                "\nSanduiche File-Mignon com fritas e cheddar....................R$ 21.16"+
                                                                "\nSanduiche Hamburger com queijos champignon e rucula...........R$ 12.70"+
                                                                "\nSanduiche Provolone com Salame................................R$ 19.70"+
                                                                "\nSanduiche Vegetariano de Berinjela............................R$ 28.22"+
                                                                "\nPizza Calabresa...............................................R$  8.98"+
                                                                "\nPizza Napolitana..............................................R$  0,42"+
                                                                "\nPizza Peruana.................................................R$ 18.36"+
                                                                "\nPizza Potuguesa...............................................R$ 27.50"+
                                                                "\nInforme seu primeiro pedido:   ");


   String segundoPedido = JOptionPane.showInputDialog(null,   "NOME                                                         VALOR"+
                                                                "\nBolo Brigadeiro...............................................R$ 29.50"+
                                                                "\nBolo Floresta Negra...........................................R$  2.00"+
                                                                "\nBolo Leite com nutella........................................R$ 29.23"+
                                                                "\nBolo Mousse de Chocolate......................................R$  7.10"+
                                                                "\nBolo Nega Maluca..............................................R$ 19.33"+
                                                                "\nBomba de Creme................................................R$ 17.71"+
                                                                "\nBomba de Morango..............................................R$  4.82"+
                                                                "\nSanduiche File-Mignon com fritas e cheddar....................R$ 21.16"+
                                                                "\nSanduiche Hamburger com queijos champignon e rucula...........R$ 12.70"+
                                                                "\nSanduiche Provolone com Salame................................R$ 19.70"+
                                                                "\nSanduiche Vegetariano de Berinjela............................R$ 28.22"+
                                                                "\nPizza Calabresa...............................................R$  8.98"+
                                                                "\nPizza Napolitana..............................................R$  0,42"+
                                                                "\nPizza Peruana.................................................R$ 18.36"+
                                                                "\nPizza Potuguesa...............................................R$ 27.50"+
                                                                "\nInforme seu segundo pedido:   ");


String terceiroPedido = JOptionPane.showInputDialog(null,   "NOME                                                         VALOR"+
                                                                "\nBolo Brigadeiro...............................................R$ 29.50"+
                                                                "\nBolo Floresta Negra...........................................R$  2.00"+
                                                                "\nBolo Leite com nutella........................................R$ 29.23"+
                                                                "\nBolo Mousse de Chocolate......................................R$  7.10"+
                                                                "\nBolo Nega Maluca..............................................R$ 19.33"+
                                                                "\nBomba de Creme................................................R$ 17.71"+
                                                                "\nBomba de Morango..............................................R$  4.82"+
                                                                "\nSanduiche File-Mignon com fritas e cheddar....................R$ 21.16"+
                                                                "\nSanduiche Hamburger com queijos champignon e rucula...........R$ 12.70"+
                                                                "\nSanduiche Provolone com Salame................................R$ 19.70"+
                                                                "\nSanduiche Vegetariano de Berinjela............................R$ 28.22"+
                                                                "\nPizza Calabresa...............................................R$  8.98"+
                                                                "\nPizza Napolitana..............................................R$  0,42"+
                                                                "\nPizza Peruana.................................................R$ 18.36"+
                                                                "\nPizza Potuguesa...............................................R$ 27.50"+
                                                                "\nInforme seu terceiro pedido:   ");

  String pedidoCliente = "";
  double total = 0;

         if (primeiroPedido.equalsIgnoreCase("Bolo Brigadeiro")){
      pedidoCliente = pedidoCliente + "Bolo Brigadeiro.....R$29.50 \n";
      total = total + 29.50;
      } 
         if (primeiroPedido.equalsIgnoreCase("Bolo Floresta Negra")){
      pedidoCliente = pedidoCliente + "Bolo Floresta Negra.....R$2.00 \n";
      total = total + 2.00;
      }
         if (primeiroPedido.equalsIgnoreCase("Bolo Leite com Nutella")){
      pedidoCliente = pedidoCliente + "Bolo Leite com Nutella.....R$29.23 \n";
      total = total + 29.23;
       }
         if (primeiroPedido.equalsIgnoreCase("Bolo Mouse de Chocolate")){
      pedidoCliente = pedidoCliente + "Bolo Mouse de Chocolate.....R$7.10 \n";
      total = total + 7.10;
       }
         if (primeiroPedido.equalsIgnoreCase("Bolo Nega Maluca")){
      pedidoCliente = pedidoCliente + "Bolo Nega Maluca.....R$19.33\n";
      total = total + 19.33;
      }                          
         if (primeiroPedido.equalsIgnoreCase("Bolo Leite com Nutella")){
      pedidoCliente = pedidoCliente + "Bolo Leite com Nutella.....R$29.23 \n";
      total = total + 29.23;                                                                                                                         
      }
          if (primeiroPedido.equalsIgnoreCase("Bomba de Creme")){
      pedidoCliente = pedidoCliente + "Bomba de Creme.....R$17.71 \n";
      total = total + 17.71;                                                                                   
      }     
          if (primeiroPedido.equalsIgnoreCase("Bomba de Morango")){
      pedidoCliente = pedidoCliente + "Bomba de Morango.....R$4.82 \n";
      total = total + 4.82;  
      }
          if (primeiroPedido.equalsIgnoreCase("Filé-Mignon com fritas e cheddar")){
      pedidoCliente = pedidoCliente + "Filé-Mignon com fritas e cheddar.....R$21.16 \n";
      total = total + 21.16;
      }
          if (primeiroPedido.equalsIgnoreCase("Hambúrguer com Queijos, Champignon e Rúcula")){
      pedidoCliente = pedidoCliente + "Hambuúrger com Queijos, Champignon e Rúcula.....R$12.70 \n";
      total = total + 12.70;
      }
          if (primeiroPedido.equalsIgnoreCase("Sanduiche Provolone com Salame")){
      pedidoCliente = pedidoCliente + "Sanduiche Provolone com Salame.....R$19.70 \n";
      total = total + 19.70 ;
           }
           if (primeiroPedido.equalsIgnoreCase("Sanduiche Vegetariano de Berinjela")){
      pedidoCliente = pedidoCliente + "Sanduiche Vegetariano de Berinjela.....R$28.22 \n";
      total = total + 28.22;
           }
           if (primeiroPedido.equalsIgnoreCase("Pizza Calabresa")){
      pedidoCliente = pedidoCliente + "Pizza Calabresa.....R$8.98 \n";
      total = total + 8.98;
           }
           if (primeiroPedido.equalsIgnoreCase("Pizza Napolitana")){
      pedidoCliente = pedidoCliente + "Pizza Npolitana.....R$0.42 \n";
      total = total + 0.42;
           }
           if (primeiroPedido.equalsIgnoreCase("Pizza Peruana")){
      pedidoCliente = pedidoCliente + "Pizza Peruana.....R$18.36 \n";
      total = total + 18.36;
           }
           if (primeiroPedido.equalsIgnoreCase("Pizza Portuguesa")){
      pedidoCliente = pedidoCliente + "Pizza Portuguesa.....R$27.50 \n";
      total = total + 27.50;
           }

         if (segundoPedido.equalsIgnoreCase("Bolo Brigadeiro")){
      pedidoCliente = pedidoCliente + "Bolo Brigadeiro.....R$29.50 \n";
      total = total + 29.50;
      } 
         if (segundoPedido.equalsIgnoreCase("Bolo Floresta Negra")){
      pedidoCliente = pedidoCliente + "Bolo Floresta Negra.....R$2.00 \n";
      total = total + 2.00;
      }
         if (segundoPedido.equalsIgnoreCase("Bolo Leite com Nutella")){
      pedidoCliente = pedidoCliente + "Bolo Leite com Nutella.....R$29.23 \n";
      total = total + 29.23;
       }
         if (segundoPedido.equalsIgnoreCase("Bolo Mouse de Chocolate")){
      pedidoCliente = pedidoCliente + "Bolo Mouse de Chocolate.....R$7.10 \n";
      total = total + 7.10;
       }
         if (segundoPedido.equalsIgnoreCase("Bolo Nega Maluca")){
      pedidoCliente = pedidoCliente + "Bolo Nega Maluca.....R$19.33\n";
      total = total + 19.33;
      }                          
         if (segundoPedido.equalsIgnoreCase("Bolo Leite com Nutella")){
      pedidoCliente = pedidoCliente + "Bolo Leite com Nutella.....R$29.23 \n";
      total = total + 29.23;                                                                                                                         
      }
          if (segundoPedido.equalsIgnoreCase("Bomba de Creme")){
      pedidoCliente = pedidoCliente + "Bomba de Creme.....R$17.71 \n";
      total = total + 17.71;                                                                                   
      }     
          if (segundoPedido.equalsIgnoreCase("Bomba de Morango")){
      pedidoCliente = pedidoCliente + "Bomba de Morango.....R$4.82 \n";
      total = total + 4.82;  
      }
          if (segundoPedido.equalsIgnoreCase("Filé-Mignon com fritas e cheddar")){
      pedidoCliente = pedidoCliente + "Filé-Mignon com fritas e cheddar.....R$21.16 \n";
      total = total + 21.16;
      }
          if (segundoPedido.equalsIgnoreCase("Hambúrguer com Queijos, Champignon e Rúcula")){
      pedidoCliente = pedidoCliente + "Hambuúrger com Queijos, Champignon e Rúcula.....R$12.70 \n";
      total = total + 12.70;
      }
          if (segundoPedido.equalsIgnoreCase("Sanduiche Provolone com Salame")){
      pedidoCliente = pedidoCliente + "Sanduiche Provolone com Salame.....R$19.70 \n";
      total = total + 19.70 ;
           }
           if (segundoPedido.equalsIgnoreCase("Sanduiche Vegetariano de Berinjela")){
      pedidoCliente = pedidoCliente + "Sanduiche Vegetariano de Berinjela.....R$28.22 \n";
      total = total + 28.22;
           }
           if (segundoPedido.equalsIgnoreCase("Pizza Calabresa")){
      pedidoCliente = pedidoCliente + "Pizza Calabresa.....R$8.98 \n";
      total = total + 8.98;
           }
           if (segundoPedido.equalsIgnoreCase("Pizza Napolitana")){
      pedidoCliente = pedidoCliente + "Pizza Npolitana.....R$0.42 \n";
      total = total + 0.42;
           }
           if (segundoPedido.equalsIgnoreCase("Pizza Peruana")){
      pedidoCliente = pedidoCliente + "Pizza Peruana.....R$18.36 \n";
      total = total + 18.36;
           }
           if (segundoPedido.equalsIgnoreCase("Pizza Portuguesa")){
      pedidoCliente = pedidoCliente + "Pizza Portuguesa.....R$27.50 \n";
      total = total + 27.50;
           }
              if (terceiroPedido.equalsIgnoreCase("Bolo Brigadeiro")){
      pedidoCliente = pedidoCliente + "Bolo Brigadeiro.....R$29.50 \n";
      total = total + 29.50;
      } 
         if (terceiroPedido.equalsIgnoreCase("Bolo Floresta Negra")){
      pedidoCliente = pedidoCliente + "Bolo Floresta Negra.....R$2.00 \n";
      total = total + 2.00;
      }
         if (terceiroPedido.equalsIgnoreCase("Bolo Leite com Nutella")){
      pedidoCliente = pedidoCliente + "Bolo Leite com Nutella.....R$29.23 \n";
      total = total + 29.23;
       }
         if (terceiroPedido.equalsIgnoreCase("Bolo Mouse de Chocolate")){
      pedidoCliente = pedidoCliente + "Bolo Mouse de Chocolate.....R$7.10 \n";
      total = total + 7.10;
       }
         if (terceiroPedido.equalsIgnoreCase("Bolo Nega Maluca")){
      pedidoCliente = pedidoCliente + "Bolo Nega Maluca.....R$19.33\n";
      total = total + 19.33;
      }                          
         if (terceiroPedido.equalsIgnoreCase("Bolo Leite com Nutella")){
      pedidoCliente = pedidoCliente + "Bolo Leite com Nutella.....R$29.23 \n";
      total = total + 29.23;                                                                                                                         
      }
          if (terceiroPedido.equalsIgnoreCase("Bomba de Creme")){
      pedidoCliente = pedidoCliente + "Bomba de Creme.....R$17.71 \n";
      total = total + 17.71;                                                                                   
      }     
          if (terceiroPedido.equalsIgnoreCase("Bomba de Morango")){
      pedidoCliente = pedidoCliente + "Bomba de Morango.....R$4.82 \n";
      total = total + 4.82;  
      }
          if (terceiroPedido.equalsIgnoreCase("Filé-Mignon com fritas e cheddar")){
      pedidoCliente = pedidoCliente + "Filé-Mignon com fritas e cheddar.....R$21.16 \n";
      total = total + 21.16;
      }
          if (terceiroPedido.equalsIgnoreCase("Hambúrguer com Queijos, Champignon e Rúcula")){
      pedidoCliente = pedidoCliente + "Hambuúrger com Queijos, Champignon e Rúcula.....R$12.70 \n";
      total = total + 12.70;
      }
          if (terceiroPedido.equalsIgnoreCase("Sanduiche Provolone com Salame")){
      pedidoCliente = pedidoCliente + "Sanduiche Provolone com Salame.....R$19.70 \n";
      total = total + 19.70 ;
           }
           if (terceiroPedido.equalsIgnoreCase("Sanduiche Vegetariano de Berinjela")){
      pedidoCliente = pedidoCliente + "Sanduiche Vegetariano de Berinjela.....R$28.22 \n";
      total = total + 28.22;
           }
           if (terceiroPedido.equalsIgnoreCase("Pizza Calabresa")){
      pedidoCliente = pedidoCliente + "Pizza Calabresa.....R$8.98 \n";
      total = total + 8.98;
           }
           if (terceiroPedido.equalsIgnoreCase("Pizza Napolitana")){
      pedidoCliente = pedidoCliente + "Pizza Npolitana.....R$0.42 \n";
      total = total + 0.42;
           }
           if (terceiroPedido.equalsIgnoreCase("Pizza Peruana")){
      pedidoCliente = pedidoCliente + "Pizza Peruana.....R$18.36 \n";
      total = total + 18.36;
           }
           if (terceiroPedido.equalsIgnoreCase("Pizza Portuguesa")){
      pedidoCliente = pedidoCliente + "Pizza Portuguesa.....R$27.50 \n";
      total = total + 27.50;
           }
   }