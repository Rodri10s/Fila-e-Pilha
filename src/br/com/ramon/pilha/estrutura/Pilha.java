package br.com.ramon.pilha.estrutura;

import br.com.ramon.basico.base;

public class Pilha<T> extends base {
    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilhar(T elemento) {
        this.adicionar(elemento);
    }

    public void desempilhar() {
        this.remover();
    }

    public T verificarTopo() {

        if (this.estaVazio()) {
            return null;
        }
        return (T) this.elementos[this.tamanho - 1];
    }

    public void mostrar() {
        System.out.println(this.toString());
    }
}
