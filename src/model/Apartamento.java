package model;

public class Apartamento extends Imovel{
    private String nomeDoCondominio;

    public Apartamento(){

    }

    public Apartamento(String tipoDeLogradouro, String logradouro, int numero, String complemento, String bairro, String cep, String cidade, double areaUtil, double precoDeCotacao, double precoDeVenda, double getITBI, String nomeDoCondominio) {
        super(tipoDeLogradouro, logradouro, numero, complemento, bairro, cep, cidade, areaUtil, precoDeCotacao, precoDeVenda, getITBI);
        this.nomeDoCondominio = nomeDoCondominio;
    }

    public String getNomeDoCondominio() {
        return nomeDoCondominio;
    }

    public void setNomeDoCondominio(String nomeDoCondominio) {
        this.nomeDoCondominio = nomeDoCondominio;
    }

    @Override
    public String toString() {
        return "\nApartamento{" +
                "nomeDoCondominio='" + nomeDoCondominio + '\'' +
                ", tipoDeLogradouro='" + tipoDeLogradouro + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", numero=" + numero +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cep='" + cep + '\'' +
                ", cidade='" + cidade + '\'' +
                ", areaUtil=" + areaUtil +
                ", precoDeCotacao=" + precoDeCotacao +
                ", precoDeVenda=" + precoDeVenda +
                '}';
    }
}
