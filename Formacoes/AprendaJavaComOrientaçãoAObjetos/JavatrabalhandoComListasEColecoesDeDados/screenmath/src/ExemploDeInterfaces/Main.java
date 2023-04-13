package ExemploDeInterfaces;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        CalculadoraImposto calculadoraImpostoCelular = new CalculadoraImposto();
        CalculadoraImposto calculadoraImpostoServico = new CalculadoraImposto();
        Servico servico = new Servico();

        produto1.setNome("Celular bgt1");
        produto1.setValor(1000.0);
        System.out.println("Valor do imposto do " + produto1.getNome() + " " + produto1.getValorImposto());

        servico.setDescricao("Freela");
        servico.setValorDoServico(1200.0);
        servico.setAliquotaISS(0.05);
        System.out.println("O valor do serviço: " + servico.getDescricao() + " " + servico.getValorDoServico());
        System.out.println("Valor do imposto do " + servico.getDescricao() + " " + servico.getValorImposto());


        calculadoraImpostoCelular.calcularImposto(produto1);
        calculadoraImpostoServico.calcularImposto(servico);
        System.out.println("Calculo do total do imposto do " + produto1.getNome() + " " + calculadoraImpostoCelular.getTotalImposto());
        System.out.println("Calculo do total do imposto do " + servico.getDescricao() + " " + calculadoraImpostoServico.getTotalImposto());

    }
}
