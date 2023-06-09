package br.com.alura.loja.orcamento;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.http.HttpAdapter;

import java.util.Map;

public class RegistroDeOrcamento {
    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento){
        if(!orcamento.isFinalizado()){
            throw new DomainException("Orcamento nao finalziado!");
        }
        String url = "http//api.extermar/orcamento";
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "Quantidade", orcamento.getQuantidadeDeItens()
        );
        http.post(url, dados);
    }

}

