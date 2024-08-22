package model;

public class UnidadePortoAlegre extends Imobiliaria{
    private double taxaDeComissao;


    public UnidadePortoAlegre(String razaoSocial, String cnpj, double previsaoDeFaturamento, double getITBI, double taxaDeComissao) {
        super(razaoSocial, cnpj, previsaoDeFaturamento, getITBI);
        this.taxaDeComissao = taxaDeComissao;
    }

    public UnidadePortoAlegre() {
    }

    public double getTaxaDeComissao() {
        return taxaDeComissao;
    }

    public void setTaxaDeComissao(double taxaDeComissao) {
        this.taxaDeComissao = taxaDeComissao;
    }

    @Override
    public String toString() {
        return "\nUnidadePortoAlegre{" +
                "taxaDeComissao=" + taxaDeComissao +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", previsaoDeFaturamento=" + previsaoDeFaturamento +
                '}';
    }
}
