package model;

import javax.swing.*;

public class Voo_DAO {
    public static int[] numvoo = {111, 222, 333, 444};
    public static String[] origemvoo = {"Minas", "Paraiba", "Bahia", "Acre"};
    public static String[] destivoo = {"Pernambuco", "São Paulo", "Rio", "Recife"};


    public static String[] assentosvoo1 = {"1[ ]", "2[ ]", "3[ ]", "4[ ]"};
    public static String assentovoo1 = assentosvoo1[0]+assentosvoo1[1]+assentosvoo1[2]+assentosvoo1[3];
    public static String[] assentosvoo2 = {"1[ ]", "2[ ]", "3[ ]", "4[ ]"};
    public static String assentovoo2 = assentosvoo2[0]+assentosvoo2[1]+assentosvoo2[2]+assentosvoo2[3];
    public static String[] assentosvoo3 = {"1[ ]", "2[ ]", "3[ ]", "4[ ]"};
    public static String assentovoo3 = assentosvoo3[0]+assentosvoo3[1]+assentosvoo3[2]+assentosvoo3[3];
    public static String[] assentosvoo4 = {"1[ ]", "2[ ]", "3[ ]", "4[ ]"};
    public static String assentovoo4 = assentosvoo4[0]+assentosvoo4[1]+assentosvoo4[2]+assentosvoo4[3];


    public static void consulta() {


        int op = 0;

        while (op != 4) {
            String x = JOptionPane.showInputDialog(null, "Consultar:\n1-Número do voo\n2-Origem do voo\n3-Destino do voo\n4-Sair");
            op = Integer.parseInt(x);
            switch (op) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Numeração dos voos:\n" + numvoo[0] + " " + numvoo[1] + " " + numvoo[2] + " " + numvoo[3]);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Origem dos voos:\n" + origemvoo[0] + " " + origemvoo[1] + " " + origemvoo[2] + " " + origemvoo[3]);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Destino dos voos:\n" + destivoo[0] + " " + destivoo[1] + " " + destivoo[2] + " " + destivoo[3]);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Obrigado, até a próxima");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }

        }

    }
    public static void reserva() {
        String voo = JOptionPane.showInputDialog(null,"Digite o número do seu voo");
        int opvoo = Integer.parseInt(voo);

        switch (opvoo){
            case 111:
                String voo1 = JOptionPane.showInputDialog(null,"Escolha o assento:\n"+ assentovoo1);
                int opvoo1 = Integer.parseInt(voo1);
                if(opvoo1 == 1){
                    assentosvoo1[0] = "1[X]";
                    assentovoo1 = assentosvoo1[0]+assentosvoo1[1]+assentosvoo1[2]+assentosvoo1[3];
                    JOptionPane.showMessageDialog(null,"Reservado com sucesso");
                } else if (opvoo1 == 2) {
                    assentosvoo1[1] = "2[X]";
                    assentovoo1 = assentosvoo1[0]+assentosvoo1[1]+assentosvoo1[2]+assentosvoo1[3];
                    JOptionPane.showMessageDialog(null,"Reservado com sucesso");
                }else if (opvoo1 == 3){
                    assentosvoo1[2] = "3[X]";
                    assentovoo1 = assentosvoo1[0]+assentosvoo1[1]+assentosvoo1[2]+assentosvoo1[3];
                    JOptionPane.showMessageDialog(null,"Reservado com sucesso");
                }else if (opvoo1 == 4){
                    assentosvoo1[3] = "4[X]";
                    assentovoo1 = assentosvoo1[0]+assentosvoo1[1]+assentosvoo1[2]+assentosvoo1[3];
                    JOptionPane.showMessageDialog(null,"Reservado com sucesso");
                }
                if(assentosvoo1[0].equals("1[X]") && assentosvoo1[1].equals("2[X]") && assentosvoo1[2].equals("3[X]") && assentosvoo1[3].equals("4[X]")){
                    JOptionPane.showMessageDialog(null,"Voo está lotado");
                }
                break;
            case 222:
                String voo2 = JOptionPane.showInputDialog(null,"Escolha o assento:\n"+ assentovoo2);
                int opvoo2 = Integer.parseInt(voo2);
                if(opvoo2 == 1){
                    assentosvoo2[0] = "1[X]";
                    assentovoo2 = assentosvoo2[0]+assentosvoo2[1]+assentosvoo2[2]+assentosvoo2[3];
                    JOptionPane.showMessageDialog(null,"Reservado com sucesso");
                } else if (opvoo2 == 2) {
                    assentosvoo2[1] = "2[X]";
                    assentovoo2 = assentosvoo2[0]+assentosvoo2[1]+assentosvoo2[2]+assentosvoo2[3];
                    JOptionPane.showMessageDialog(null,"Reservado com sucesso");
                }else if (opvoo2 == 3){
                    assentosvoo2[2] = "3[X]";
                    assentovoo2 = assentosvoo2[0]+assentosvoo2[1]+assentosvoo2[2]+assentosvoo2[3];
                    JOptionPane.showMessageDialog(null,"Reservado com sucesso");
                }else if (opvoo2 == 4){
                    assentosvoo2[3] = "4[X]";
                    assentovoo2 = assentosvoo2[0]+assentosvoo2[1]+assentosvoo2[2]+assentosvoo2[3];
                    JOptionPane.showMessageDialog(null,"Reservado com sucesso");
                }
                if(assentosvoo2[0].equals("1[X]") && assentosvoo2[1].equals("2[X]") && assentosvoo2[2].equals("3[X]") && assentosvoo2[3].equals("4[X]")){
                    JOptionPane.showMessageDialog(null,"Voo está lotado");
                }
                break;
            case 333:
                String voo3 = JOptionPane.showInputDialog(null,"Escolha o assento:\n"+ assentovoo3);
                int opvoo3 = Integer.parseInt(voo3);
                if(opvoo3 == 1){
                    assentosvoo3[0] = "1[X]";
                    assentovoo3 = assentosvoo3[0]+assentosvoo3[1]+assentosvoo3[2]+assentosvoo3[3];
                    JOptionPane.showMessageDialog(null,"Reservado com sucesso");
                } else if (opvoo3 == 2) {
                    assentosvoo3[1] = "2[X]";
                    assentovoo3 = assentosvoo3[0]+assentosvoo3[1]+assentosvoo3[2]+assentosvoo3[3];
                    JOptionPane.showMessageDialog(null,"Reservado com sucesso");
                }else if (opvoo3 == 3){
                    assentosvoo3[2] = "3[X]";
                    assentovoo3 = assentosvoo3[0]+assentosvoo3[1]+assentosvoo3[2]+assentosvoo3[3];
                    JOptionPane.showMessageDialog(null,"Reservado com sucesso");
                }else if (opvoo3 == 4){
                    assentosvoo3[3] = "4[X]";
                    assentovoo3 = assentosvoo3[0]+assentosvoo3[1]+assentosvoo3[2]+assentosvoo3[3];
                    JOptionPane.showMessageDialog(null,"Reservado com sucesso");
                }
                if(assentosvoo3[0].equals("1[X]") && assentosvoo3[1].equals("2[X]") && assentosvoo3[2].equals("3[X]") && assentosvoo3[3].equals("4[X]")){
                    JOptionPane.showMessageDialog(null,"Voo está lotado");
                }
                break;
            case 444:
                String voo4 = JOptionPane.showInputDialog(null,"Escolha o assento:\n"+ assentovoo4);
                int opvoo4 = Integer.parseInt(voo4);
                if(opvoo4 == 1){
                    assentosvoo4[0] = "1[X]";
                    assentovoo4 = assentosvoo4[0]+assentosvoo4[1]+assentosvoo4[2]+assentosvoo4[3];
                    JOptionPane.showMessageDialog(null,"Reservado com sucesso");
                } else if (opvoo4 == 2) {
                    assentosvoo4[1] = "2[X]";
                    assentovoo4 = assentosvoo4[0]+assentosvoo4[1]+assentosvoo4[2]+assentosvoo4[3];
                    JOptionPane.showMessageDialog(null,"Reservado com sucesso");
                }else if (opvoo4 == 3){
                    assentosvoo4[2] = "3[X]";
                    assentovoo4 = assentosvoo4[0]+assentosvoo4[1]+assentosvoo4[2]+assentosvoo4[3];
                    JOptionPane.showMessageDialog(null,"Reservado com sucesso");
                }else if (opvoo4 == 4){
                    assentosvoo4[3] = "4[X]";
                    assentovoo4 = assentosvoo4[0]+assentosvoo4[1]+assentosvoo4[2]+assentosvoo4[3];
                    JOptionPane.showMessageDialog(null,"Reservado com sucesso");
                }
                if(assentosvoo4[0].equals("1[X]") && assentosvoo4[1].equals("2[X]") && assentosvoo4[2].equals("3[X]") && assentosvoo4[3].equals("4[X]")){
                    JOptionPane.showMessageDialog(null,"Voo está lotado");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null,"Voo não encontrado");
                break;
        }

    }

}
