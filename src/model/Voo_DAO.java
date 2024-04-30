package model;

import javax.swing.*;

public class Voo_DAO {
    public static int[] numvoo = {111, 222};
    public static String[] origemvoo = {"Minas", "Paraiba"};
    public static String[] destivoo = {"Pernambuco", "Recife"};


    public static String[] assentosvoo1 = {"1[ ]", "2[ ]", "3[ ]", "4[ ]", "5[ ]", "6[ ]"};
    public static String assentovoo1 = assentosvoo1[0]+assentosvoo1[1]+"\n"+assentosvoo1[2]+assentosvoo1[3]+"\n"+assentosvoo1[4]+assentosvoo1[5];
    public static String[] assentosvoo2 = {"1[ ]", "2[ ]", "3[ ]", "4[ ]", "5[ ]", "6[ ]"};
    public static String assentovoo2 = assentosvoo2[0]+assentosvoo2[1]+"\n"+assentosvoo2[2]+assentosvoo2[3]+"\n"+assentosvoo2[4]+assentosvoo2[5];



    public static void consulta() {


        int op = 0;

        while (op != 4) {
            String x = JOptionPane.showInputDialog(null, "Consultar:\n1-Número do voo\n2-Origem do voo\n3-Destino do voo\n4-Sair");
            op = Integer.parseInt(x);
            switch (op) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Numeração dos voos:\n" + numvoo[0] + " " + numvoo[1]);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Origem dos voos:\n" + origemvoo[0] + " " + origemvoo[1] );
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Destino dos voos:\n" + destivoo[0] + " " + destivoo[1] );
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
                if(opvoo1 == 1 && assentosvoo1[0].equals("1[X]") ){
                    JOptionPane.showMessageDialog(null,"Este assento está bloqueado, já foi alocado");
                }if(opvoo1 == 2 && assentosvoo1[1].equals("2[X]") ){
                JOptionPane.showMessageDialog(null,"Este assento está bloqueado, já foi alocado");
                }if(opvoo1 == 3 && assentosvoo1[2].equals("3[X]") ){
                JOptionPane.showMessageDialog(null,"Este assento está bloqueado, já foi alocado");
                }if(opvoo1 == 4 && assentosvoo1[3].equals("4[X]") ){
                JOptionPane.showMessageDialog(null,"Este assento está bloqueado, já foi alocado");
                }if(opvoo1 == 5 && assentosvoo1[4].equals("5[X]") ){
                JOptionPane.showMessageDialog(null,"Este assento está bloqueado, já foi alocado");
                }if(opvoo1 == 6 && assentosvoo1[5].equals("6[X]") ){
                JOptionPane.showMessageDialog(null,"Este assento está bloqueado, já foi alocado");
                }if(opvoo1 == 1 && assentosvoo1[0].equals("1[ ]")){
                    assentosvoo1[0] = "1[X]";
                    assentovoo1 = assentosvoo1[0]+assentosvoo1[1]+"\n"+assentosvoo1[2]+assentosvoo1[3]+"\n"+assentosvoo1[4]+assentosvoo1[5];;
                    JOptionPane.showMessageDialog(null,"Reservado com sucesso");
                }if (opvoo1 == 2 && assentosvoo1[1].equals("2[ ]")) {
                    assentosvoo1[1] = "2[X]";
                    assentovoo1 = assentosvoo1[0]+assentosvoo1[1]+"\n"+assentosvoo1[2]+assentosvoo1[3]+"\n"+assentosvoo1[4]+assentosvoo1[5];;
                    JOptionPane.showMessageDialog(null,"Reservado com sucesso");
                }if (opvoo1 == 3 && assentosvoo1[2].equals("3[ ]") ){
                    assentosvoo1[2] = "3[X]";
                    assentovoo1 = assentosvoo1[0]+assentosvoo1[1]+"\n"+assentosvoo1[2]+assentosvoo1[3]+"\n"+assentosvoo1[4]+assentosvoo1[5];;
                    JOptionPane.showMessageDialog(null,"Reservado com sucesso");
                }if (opvoo1 == 4 && assentosvoo1[3].equals("4[ ]") ){
                    assentosvoo1[3] = "4[X]";
                    assentovoo1 = assentosvoo1[0]+assentosvoo1[1]+"\n"+assentosvoo1[2]+assentosvoo1[3]+"\n"+assentosvoo1[4]+assentosvoo1[5];;
                    JOptionPane.showMessageDialog(null,"Reservado com sucesso");
                }if (opvoo1 == 5 && assentosvoo1[4].equals("5[ ]") ) {
                    assentosvoo1[4] = "5[X]";
                    assentovoo1 = assentosvoo1[0]+assentosvoo1[1]+"\n"+assentosvoo1[2]+assentosvoo1[3]+"\n"+assentosvoo1[4]+assentosvoo1[5];
                    JOptionPane.showMessageDialog(null,"Reservado com sucesso");
                }if (opvoo1 == 6 && assentosvoo1[5].equals("6[ ]") ) {
                    assentosvoo1[5] = "6[X]";
                    assentovoo1 = assentosvoo1[0] + assentosvoo1[1] +"\n"+ assentosvoo1[2] + assentosvoo1[3] +"\n"+ assentosvoo1[4] + assentosvoo1[5];
                    JOptionPane.showMessageDialog(null, "Reservado com sucesso");
                }
                if(assentosvoo1[0].equals("1[X]") && assentosvoo1[1].equals("2[X]") && assentosvoo1[2].equals("3[X]") && assentosvoo1[3].equals("4[X]")&& assentosvoo1[4].equals("5[X]")&& assentosvoo1[5].equals("6[X]")){
                    JOptionPane.showMessageDialog(null,"Voo está lotado");
                }
                break;
            case 222:
                String voo2 = JOptionPane.showInputDialog(null,"Escolha o assento:\n"+ assentovoo2);
                int opvoo2 = Integer.parseInt(voo2);
                if(opvoo2 == 1 && assentosvoo2[0].equals("1[X]") ){
                    JOptionPane.showMessageDialog(null,"Este assento está bloqueado, já foi alocado");
                }if(opvoo2 == 2 && assentosvoo2[1].equals("2[X]") ){
                JOptionPane.showMessageDialog(null,"Este assento está bloqueado, já foi alocado");
                }if(opvoo2 == 3 && assentosvoo2[2].equals("3[X]") ){
                JOptionPane.showMessageDialog(null,"Este assento está bloqueado, já foi alocado");
                }if(opvoo2 == 4 && assentosvoo2[3].equals("4[X]") ){
                JOptionPane.showMessageDialog(null,"Este assento está bloqueado, já foi alocado");
                }if(opvoo2 == 5 && assentosvoo2[4].equals("5[X]") ){
                JOptionPane.showMessageDialog(null,"Este assento está bloqueado, já foi alocado");
                }if(opvoo2 == 6 && assentosvoo2[5].equals("6[X]") ){
                JOptionPane.showMessageDialog(null,"Este assento está bloqueado, já foi alocado");
                }if(opvoo2 == 1 && assentosvoo2[0].equals("1[ ]")){
                    assentosvoo2[0] = "1[X]";
                    assentovoo2 = assentosvoo2[0]+assentosvoo2[1]+"\n"+assentosvoo2[2]+assentosvoo2[3]+"\n"+assentosvoo2[4]+assentosvoo2[5];
                    JOptionPane.showMessageDialog(null,"Reservado com sucesso");
                }if (opvoo2 == 2 && assentosvoo2[1].equals("2[ ]")) {
                    assentosvoo2[1] = "2[X]";
                    assentovoo2 = assentosvoo2[0]+assentosvoo2[1]+"\n"+assentosvoo2[2]+assentosvoo2[3]+"\n"+assentosvoo2[4]+assentosvoo2[5];
                    JOptionPane.showMessageDialog(null,"Reservado com sucesso");
                }if (opvoo2 == 3 && assentosvoo2[2].equals("3[ ]")){
                    assentosvoo2[2] = "3[X]";
                    assentovoo2 = assentosvoo2[0]+assentosvoo2[1]+"\n"+assentosvoo2[2]+assentosvoo2[3]+"\n"+assentosvoo2[4]+assentosvoo2[5];
                    JOptionPane.showMessageDialog(null,"Reservado com sucesso");
                }if (opvoo2 == 4 && assentosvoo2[3].equals("4[ ]")){
                    assentosvoo2[3] = "4[X]";
                    assentovoo2 = assentosvoo2[0]+assentosvoo2[1]+"\n"+assentosvoo2[2]+assentosvoo2[3]+"\n"+assentosvoo2[4]+assentosvoo2[5];
                    JOptionPane.showMessageDialog(null,"Reservado com sucesso");
                }if (opvoo2 == 5 && assentosvoo2[4].equals("5[ ]")) {
                    assentosvoo2[4] = "5[X]";
                    assentovoo2 = assentosvoo2[0]+assentosvoo2[1]+"\n"+assentosvoo2[2]+assentosvoo2[3]+"\n"+assentosvoo2[4]+assentosvoo2[5];
                    JOptionPane.showMessageDialog(null,"Reservado com sucesso");
                }if (opvoo2 == 6 && assentosvoo2[5].equals("6[ ]")) {
                    assentosvoo2[5] = "6[X]";
                    assentovoo2 = assentosvoo2[0] + assentosvoo2[1] +"\n"+ assentosvoo2[2] + assentosvoo2[3] +"\n"+ assentosvoo2[4] + assentosvoo2[5];
                    JOptionPane.showMessageDialog(null, "Reservado com sucesso");
                }
                if(assentosvoo2[0].equals("1[X]") && assentosvoo2[1].equals("2[X]") && assentosvoo2[2].equals("3[X]") && assentosvoo2[3].equals("4[X]")&& assentosvoo2[4].equals("5[X]")&& assentosvoo2[5].equals("6[X]")){
                    JOptionPane.showMessageDialog(null,"Voo está lotado");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null,"Voo não encontrado");
                break;
        }

    }

}
