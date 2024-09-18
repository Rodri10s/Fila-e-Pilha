package br.com.ramon.fila.comqueue.main;

import br.com.ramon.fila.comqueue.basica.Processo;
import br.com.ramon.fila.comqueue.estrutura.Fila;

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

        Fila fila = new Fila<>();

        fila.enfileira(pr1);
        fila.enfileira(pr2);
        fila.enfileira(pr3);

        fila.mostrar();

        fila.removerUltimo();
        fila.mostrar();

        System.out.println(fila.verificar());
    }
}
