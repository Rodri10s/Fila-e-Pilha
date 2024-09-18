package br.com.ramon.basico;

import java.util.Arrays;

public class base<T> {
    protected T[] elementos;
    protected int tamanho;

    public base(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public base() {
        this.elementos = (T[]) new Object[10];
        this.tamanho = 0;
    }

    public void adicionarCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] novaConta = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                novaConta[i] = this.elementos[i];
            }
            this.elementos = novaConta;
        }
    }

    public void adicionar(T elemento) {
        this.adicionarCapacidade();

        this.elementos[tamanho] = elemento;
        tamanho++;
    }

    public void remover() {
        this.tamanho--;
        this.elementos[tamanho] = null;
    }

    public boolean estaVazio() {
        return this.tamanho == 0;
    }

    @Override
    public String toString() {
        return "base [elementos=" + Arrays.toString(elementos) + "]";
    }

}
