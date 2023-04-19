package br.com.alura.screenmatch.modelos;

public record TituloOmdb(String title, String year, String runtime) {
    @Override
    public String toString() {
        return "TituloOmdb{" +
                "title: '" + title + '\'' +
                ", year: '" + year + '\'' +
                ", runtime: '" + runtime + '\'' +
                '}';
    }
}
