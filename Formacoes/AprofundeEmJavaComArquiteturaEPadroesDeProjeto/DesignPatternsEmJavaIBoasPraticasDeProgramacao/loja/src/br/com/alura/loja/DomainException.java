package br.com.alura.loja;

public class DomainException extends RuntimeException{
    private static final long serialVersionUID = 1l;

    public DomainException(String message) {
        super(message);
    }
}
