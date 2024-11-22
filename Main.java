package org.example;
import javax.swing.JOptionPane;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        String nome = JOptionPane.showInputDialog("Exercício 1: Digite o seu primeiro nome!");
        JOptionPane.showMessageDialog(null,"Olá " + nome + " Moto-Moto adora um nome de " + nome.length() + " letras.");
        */

        //Ex 1
        /*
        String x1 = JOptionPane.showInputDialog(null, "Coordenadas x do primeiro ponto:");
        String y1 = JOptionPane.showInputDialog(null, "Coordenadas y do primeiro ponto:");
        String x2 = JOptionPane.showInputDialog(null, "Coordenadas x do segundo ponto:");
        String y2 = JOptionPane.showInputDialog(null, "Coordenadas y do segundo ponto:");
        Double px1 = Double.parseDouble(x1);
        Double py1 = Double.parseDouble(y1);
        Double px2 = Double.parseDouble(x2);
        Double py2 = Double.parseDouble(y2);
        Double sacanagem = Math.sqrt(Math.pow(px1 - px2,2) + Math.pow(py1 - py2,2));
        JOptionPane.showMessageDialog(null, "A distancia é: " + sacanagem);
         */

        //Ex 2
        Boolean operar = true;
        while (operar == true){
            String[] operacaoNome = {"Soma", "Subtração", "Multiplicação", "Divisão"};
            int operacaoEscolhida = JOptionPane.showOptionDialog(null, "Qual operação você quer realizar?", "Calculadora Poggers", 0, 3, null, operacaoNome, operacaoNome[0]);
            operar = false;
        }

        String[] opcoes = {"Sim", "Claro"};
        JOptionPane.showOptionDialog(null, "Você quer ver a letra de Dentro do Mar de Henrique Mendonça?", "Pergunta importante", 0, 1, null, opcoes, opcoes[0]);
        JOptionPane.showMessageDialog(null,"Herdei um passado\n" +
                  "Que agora me atormenta\n" +
                  "Mil devaneios\n" +
                  "Vindos do fundo do mar\n" +
                  "\n" +
                  "Veio do fundo do mar\n" +
                  "Veio do fundo do mar\n" +
                  "\n" +
                  "Acho que tudo que eu acreditei a vida toda\n" +
                  "Nunca passou do que eu poderia ver por de trás dessas lentes\n" +
                  "Em minha mente, só consigo visualizar o que vi na minha frente\n" +
                  "Diferente, um horror desenhado em argila\n" +
                  "\n" +
                  "Todos esses riscos, talvez sejam escritos antigos\n" +
                  "Projetando um clima sombrio\n" +
                  "No centro acima, algo pior ainda\n" +
                  "Talvez seja obra dе alguém doentio\n" +
                  "\n" +
                  "Cabeça de polvo, asas dе demônio\n" +
                  "Um corpo humanoide, obscuro, obscuro\n" +
                  "Acima do ser, uma frase dizia\n" +
                  "Que esse era O Culto a Cthulhu\n" +
                  "\n" +
                  "Seguindo os rastros desses relatos\n" +
                  "Até achar de fato a raiz do problema\n" +
                  "1925, 23 de Março\n" +
                  "E são múltiplos casos de loucura extrema\n" +
                  "\n" +
                  "Sonhos macabros em todo o planeta\n" +
                  "Que quando adormecem, contemplam uma besta\n" +
                  "Que em sua língua, seu nome, seu nome, seu nome, seu nome\n" +
                  "Seu nome revela\n" +
                  "\n" +
                  "E esse mesmo nome tem sido adorado\n" +
                  "Em cultos macabros e rituais\n" +
                  "A sua imagem é glorificada\n" +
                  "Em meio à chamas tão infernais\n" +
                  "\n" +
                  "E seus fiéis cantam que ele jaz sonhando\n" +
                  "Mas virá o dia em que acordará\n" +
                  "Cthulhu irá reinar\n" +
                  "\n" +
                  "Não está morto, não está morto\n" +
                  "Ele apenas dorme dorme dorme\n" +
                  "Dorme, dorme\n" +
                  "Em sua cidade, em sua cidade\n" +
                  "Dentro do mar, mar, mar\n" +
                  "Um horror cósmico\n" +
                  "Chamado Antigo Cthulhu, Cthulhu\n" +
                  "Em nossos sonhos, seus olhos se abriram\n" +
                  "No mar, no mar\n" +
                  "\n" +
                  "Pessoalmente, penso que pessoas mentem\n" +
                  "E eu sou o tipo de gente que gosta de se ater aos fatos\n" +
                  "Meu ceticismo diz que é impossível\n" +
                  "E que o jovem escultor ficou sabendo de algo\n" +
                  "\n" +
                  "Nada é normal, isso é, não é normal\n" +
                  "Artistas do mundo inteiro sonhando com o nome da besta\n" +
                  "Enquanto o mesmo nome nefasto e sua imagem\n" +
                  "Estão sendo adorados do outro lado do planeta\n" +
                  "\n" +
                  "Conheci um homem que disse, me disse\n" +
                  "Que antes dos humanos, outra criaturas vieram do espaço\n" +
                  "Caíram na Terra, abriram suas asas gigantes\n" +
                  "E aqui, construíram nas pedras, seu lar, seu reinado\n" +
                  "\n" +
                  "Milênios pa-pa-pa-pa-pa-passaram\n" +
                  "A Terra mudou, o mar se elevou\n" +
                  "Então eles afunda-da-da-da-daram\n" +
                  "Então do abismo, ouça o chamado\n" +
                  "\n" +
                  "No meio do mar\n" +
                  "Quando a cidade levantar\n" +
                  "Eles vão se libertar\n" +
                  "Para o mundo, pa-para o mundo governar\n" +
                  "\n" +
                  "No meio do mar\n" +
                  "Quando a cidade levantar\n" +
                  "O mundo inteiro vai gritar\n" +
                  "E túmulos vão festejar, e vão cantar\n" +
                  "\n" +
                  "Não está morto\n" +
                  "Ele apenas dorme dorme dorme dorme\n" +
                  "Em sua cidade\n" +
                  "Dentro do mar\n" +
                  "\n" +
                  "Não está morto, não está morto\n" +
                  "Ele apenas dorme dorme dorme\n" +
                  "Dorme, dorme\n" +
                  "Em sua cidade, em sua cidade\n" +
                  "Dentro do mar, mar, mar\n" +
                  "Um horror cósmico\n" +
                  "Chamado Antigo Cthulhu, Cthulhu\n" +
                  "Em nossos sonhos, seus olhos se abriram\n" +
                  "No mar, no mar\n");
      }
    }
