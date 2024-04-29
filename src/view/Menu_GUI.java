package view;

import javax.swing.*;

public class Menu_GUI {
    public static void menu(){
        int op=0;

        while(op != 3){
            String x = JOptionPane.showInputDialog(null,"1-Consultar voo \n2-Efetuar reserva (assento) \n3-Sair");
            op = Integer.parseInt(x);
            switch (op){
                case 1:
                    model.Voo_DAO.consulta();
                    break;
                case 2:
                    model.Voo_DAO.reserva();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Obrigado, até a próxima");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida");
                    break;
            }
        }
    }
}
