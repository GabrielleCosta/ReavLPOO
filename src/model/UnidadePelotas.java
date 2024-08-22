package model;

public class UnidadePelotas extends Imobiliaria {
    private double taxaDeComissao;

    public UnidadePelotas(){

    }

    public UnidadePelotas(String razaoSocial, String cnpj, double previsaoDeFaturamento, double getITBI, double taxaDeComissao) {
        super(razaoSocial, cnpj, previsaoDeFaturamento, getITBI);
        this.taxaDeComissao = taxaDeComissao;
    }


    public double getTaxaDeComissao() {
        return taxaDeComissao;
    }

    public void setTaxaDeComissao(double taxaDeComissao) {
        this.taxaDeComissao = taxaDeComissao;
    }

    @Override
    public String toString() {
        return "\nUnidadePelotas{" +
                "taxaDeComissao=" + taxaDeComissao +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", previsaoDeFaturamento=" + previsaoDeFaturamento +
                '}';
    }
}
