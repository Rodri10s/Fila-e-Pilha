package br.com.ramon.fila.comqueue.estrutura;

import java.util.LinkedList;
import java.util.Queue;

public class Fila<T> {
    Queue<T> fila = new LinkedList<T>();

    public void enfileira(T elemento) {
        fila.add(elemento);
    }

    public void removerUltimo() {
        fila.remove();
    }

    public boolean verificar() {
        return fila.isEmpty();
    }

    public void mostrar() {
        System.out.println(fila.toString());
    }
}
