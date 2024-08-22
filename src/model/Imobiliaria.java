package model;

public abstract class Imobiliaria implements Portfolio {
    protected String razaoSocial;
    protected String cnpj;
    protected double previsaoDeFaturamento;
    private double getITBI;

    public Imobiliaria(String razaoSocial, String cnpj, double previsaoDeFaturamento, double getITBI) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.previsaoDeFaturamento = previsaoDeFaturamento;
        this.getITBI = getITBI;
    }

    public Imobiliaria() {

    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getPrevisaoDeFaturamento() {
        return previsaoDeFaturamento;
    }

    public void setPrevisaoDeFaturamento(double previsaoDeFaturamento) {
        this.previsaoDeFaturamento = previsaoDeFaturamento;
    }

    @Override
    public double getITBI() {
        return getITBI;
    }

}
