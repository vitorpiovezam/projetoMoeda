import java.util.Scanner;
import java.util.Random;

public class moeda {

    public static void main (String[]args) throws InterruptedException {

        double faceDaMoeda=0;
        double numeroLanc;
        double numeroJogos;
        double dinheiroPerdido;
        double dinheiroGanho=
        double saldo;
        boolean cara = false;
        boolean coroa =false;
        double saida=239821321;
        double quantCoroa=0;

        Random face = new Random();
        Scanner in = new Scanner(System.in);

        while(saida!=2) {
            faceDaMoeda=0;
            numeroLanc=0;
            numeroJogos=0;
            dinheiroPerdido=0;
            dinheiroGanho=0;
            quantCoroa =0;
            saldo=0;
            cara = false;
            coroa =false;
            saida=0;


            System.out.print("Digite quantas vezes repetir lançamento de moeda -> ");
            numeroLanc = in.nextDouble();

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

                System.out.println("FIM DE UM JOGO -> Quantidade de Coroas " + quantCoroa);


                if (quantCoroa >= 1) {
                    dinheiroGanho += (double) Math.pow(2, quantCoroa);
                    System.out.println("Dinheiro ganho -> " + dinheiroGanho);
                    if (quantCoroa>30){
                        System.out.println("********** DEU GRANA PACARAI");
                        Thread.sleep(10000);
                    }
                } else {
                    System.out.println("Dinheiro ganho -> " + dinheiroGanho);
                }

                quantCoroa = 0;


            }//Fim numero de Jogos
            saldo = dinheiroGanho - dinheiroPerdido;
            System.out.println("Fim dos jogos, você ficou saldo " + saldo);
        System.out.println("Deseja jogar novamente ? \n1.Sim \n2.Não");
        saida = in.nextInt();
        }
    }
}
