package br.com.ramon.pilha.basica;

public class Processo {
    private int pid;
    private Object conteudo;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public Object getConteudo() {
        return conteudo;
    }

    public void setConteudo(Object conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "Processo [pid=" + pid + ", conteudo=" + conteudo + "]";
    }

}
