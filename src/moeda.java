import java.util.Scanner;
import java.util.Random;

public class moeda {

    public static void main (String[]args) throws InterruptedException {

        double faceDaMoeda=0;
        double numeroLanc;
        double numeroJogos;
        double dinheiroPerdido;
        double dinheiroGanho=0;
        double saldo=0;
        boolean cara = false;
        boolean coroa =false;
        double saida=239821321;
        double quantCoroa=0;
        double numeroJogosTotal;
        int getMenu;
        int tui;

        Random face = new Random();
        Scanner in = new Scanner(System.in);

        /*
        System.out.println("Deseja ter resposta gráfica ? ");
        System.out.println("1. Sim");
        System.out.println("2. Não");
        System.out.print("Escolha -> ");
        tui = in.nextInt();
        */

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Selecione o metodo");
        System.out.println("1. Definindo o numero de jogos");
        System.out.println("2. Até ter o saldo positivo");
        System.out.print("Escolha ---> ");
        getMenu = in.nextInt();

        if(getMenu==1) {
            //Defina o numero de jogos

            while (saida != 2) {
                faceDaMoeda = 0;
                numeroLanc = 0;
                numeroJogos = 0;
                dinheiroPerdido = 0;
                dinheiroGanho = 0;
                quantCoroa = 0;
                saldo = 0;
                cara = false;
                coroa = false;
                saida = 0;

                System.out.println(" ");
                System.out.println(" ");
                System.out.print("Digite quantas vezes repetir lançamento de moeda -> ");
                numeroLanc = in.nextDouble();

                System.out.println(" ");
                System.out.println(" ");
                System.out.println("Quantos jogos deseja fazer ? -> ");
                numeroJogos = in.nextDouble();

                dinheiroPerdido = 13 * numeroJogos;
                System.out.println("Você gastou R$" + dinheiroPerdido);
                Thread.sleep(2500);
                for (int j = 0; j <= numeroJogos; j++) {


                    //Lançamento de moeda
                    loopCoin:
                    for (int i = 0; i <= numeroLanc; i++) {

                        faceDaMoeda = face.nextInt(2);

                        //Cara
                        if (faceDaMoeda == 0) {
                            cara = true;
                            coroa = false;
                            break loopCoin;
                        }

                        //Coroa
                        if (faceDaMoeda == 1) {
                            cara = false;
                            coroa = true;
                            quantCoroa++;
                        }


                    }
                    //Fim lançamento de moeda
                    //if(tui==1) {
                        System.out.println("FIM DE UM JOGO -> Quantidade de Coroas " + quantCoroa);
                    //}

                    if (quantCoroa >= 1) {
                        dinheiroGanho += (double) Math.pow(2, quantCoroa);
                        //if(tui==1) {
                            System.out.println("Dinheiro ganho -> " + dinheiroGanho);
                        //}
                        if (quantCoroa > 30) {
                            //if(tui==1) {
                                System.out.println("********** DEU GRANA PACARAI");
                            //}
                            Thread.sleep(10000);
                        }
                    } else {
                        //if(tui==1) {
                            System.out.println("Dinheiro ganho -> " + dinheiroGanho);
                        //}
                    }

                    quantCoroa = 0;


                }//Fim numero de Jogos
                saldo = dinheiroGanho - dinheiroPerdido;

                    numeroJogosTotal = dinheiroPerdido / 13;
                    System.out.println("\n" + "Numero de Jogos -> " + numeroJogosTotal);
                    System.out.println("Fim dos jogos, você ficou saldo " + saldo);
                    System.out.println("Deseja jogar novamente ? \n1.Sim \n2.Não");

                saida = in.nextInt();
            }


        }



        //Roda até o saldo for positivo *****************************************************************

        if(getMenu==2) {

            while (saida != 2) {

                faceDaMoeda = 0;
                numeroLanc = 0;
                numeroJogos = 0;
                dinheiroPerdido = 0;
                dinheiroGanho = 0;
                quantCoroa = 0;
                saldo = 0;
                cara = false;
                coroa = false;
                saida = 0;
                int precoJogo;

                //Capturando numeros

                System.out.println("Quanto deseja cobrar por jogo ?");
                precoJogo = in.nextInt();
                //

                loopJogos:
                for (double j = 0; j <= 2100000000; j++) {
                    dinheiroPerdido += precoJogo;

                    //Lançamento de moeda
                    loopCoin:
                    for (double i = 0; i <= 900000009; i++) {

                        faceDaMoeda = face.nextInt(2);

                        //Cara
                        if (faceDaMoeda == 0) {
                            cara = true;
                            coroa = false;
                            break loopCoin;
                        }

                        //Coroa
                        if (faceDaMoeda == 1) {
                            cara = false;
                            coroa = true;
                            quantCoroa++;
                        }


                    }
                    //Fim lançamento de moeda

                    //System.out.println("\n " + "Moeda lançada -> Quantidade de Coroas " + quantCoroa + "\n");


                    if (quantCoroa >= 1) {
                        dinheiroGanho += (double) Math.pow(2, quantCoroa);

                        //Deu grana bagarai element
                        if (quantCoroa > 25) {
                            System.out.println(quantCoroa);
                            System.out.println("********** DEU GRANA PACARAI");
                            //2
                            // Thread.sleep(6000);
                        }


                    }

                    saldo = dinheiroGanho - dinheiroPerdido;

                    //System.out.println("Saldo -> " + saldo);
                    //System.out.println("Dinheiro ganho  total -> " + dinheiroGanho);
                    //System.out.println("Dinheiro perdido total -> " + dinheiroPerdido);

                    quantCoroa = 0;


                    if (saldo > 100) {
                        System.out.println(" ");
                        numeroJogosTotal = dinheiroPerdido / precoJogo;
                        System.out.println("\n" + "Numero de Jogos -> " + numeroJogosTotal);
                        System.out.println("Dinheiro ganho  total -> " + dinheiroGanho);
                        System.out.println("Dinheiro perdido total -> " + dinheiroPerdido);
                        System.out.println("Saldo -> " + saldo);
                        break loopJogos;
                    }

                    //System.out.println("Fim de um jogo");
                }//Fim numero de Jogos

                System.out.println("Deseja jogar novamente ?");
                System.out.println("1. Sim");
                System.out.println("2. Não");
                saida = in.nextInt();
            }
        }

        }
    }
