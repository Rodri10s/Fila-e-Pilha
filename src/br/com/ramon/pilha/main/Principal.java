package br.com.ramon.pilha.main;

import br.com.ramon.fila.comqueue.basica.Processo;
import br.com.ramon.pilha.estrutura.Pilha;

public class Principal {
    public static void main(String[] args) {
        Processo pr1 = new Processo();
        pr1.setPid(0);
        pr1.setConteudo("Ramon");
        Processo pr2 = new Processo();
        pr2.setPid(1);
        pr2.setConteudo("Rodrigues");
        Processo pr3 = new Processo();
        pr3.setPid(3);
        pr3.setConteudo("Silva");

        Pilha pilha = new Pilha<>();

        pilha.empilhar(pr1);
        pilha.empilhar(pr2);
        pilha.empilhar(pr3);

        pilha.mostrar();

        pilha.desempilhar();
        pilha.mostrar();

        System.out.println(pilha.verificarTopo());
    }
}
