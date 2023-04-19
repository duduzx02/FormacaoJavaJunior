package br.com.alura.screenmatch.excecoes;

public class ErroNaConversaoDeAnoException extends RuntimeException {
    private String mensagem;

    public ErroNaConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
