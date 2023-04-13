package ExemploDeInterfaces;

public class Servico implements Tributavel{
    private String descricao;
    private double valorDoServico;
    private double aliquotaISS;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorDoServico() {
        return valorDoServico;
    }

    public void setValorDoServico(double valorDoServico) {
        this.valorDoServico = valorDoServico;
    }

    public double getAliquotaISS() {
        return aliquotaISS;
    }

    public void setAliquotaISS(double aliquotaISS) {
        this.aliquotaISS = aliquotaISS;
    }

    @Override
    public double getValorImposto() {
        return this.valorDoServico * this.aliquotaISS / 100;
    }
}
