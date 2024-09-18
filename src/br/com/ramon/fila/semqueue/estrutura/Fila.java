package br.com.ramon.fila.semqueue.estrutura;

import br.com.ramon.basico.base;

public class Fila<T> extends base {
    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void enfileira(T elemento) {
        this.adicionar(elemento);
    }

    public void removerUltimo() {
        for (int i = 0; i < tamanho; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }

        this.tamanho--;
    }

    public void inverter() {
        T[] Temporario = (T[]) new Object[this.tamanho];
        int n = 1;
        for (int i = 0; i < this.tamanho; i++) {
            Temporario[i] = (T) this.elementos[this.tamanho - (n++)];

        }

        for (int i = 0; i < this.tamanho; i++) {
            System.out.println(Temporario[i]);
        }
    }

    public T verificar() {

        if (this.estaVazio()) {
            return null;
        }
        return (T) this.elementos[0];
    }

    public void mostrar() {
        System.out.println(this.toString());
    }

}
