package model;

public class Casa extends Imovel {
    private double tamanhoDoTerreno;

    public Casa() {

    }

    public Casa(String tipoDeLogradouro, String logradouro, int numero, String complemento, String bairro, String cep, String cidade, double areaUtil, double precoDeCotacao, double precoDeVenda, double getITBI, double tamanhoDoTerreno) {
        super(tipoDeLogradouro, logradouro, numero, complemento, bairro, cep, cidade, areaUtil, precoDeCotacao, precoDeVenda, getITBI);
        this.tamanhoDoTerreno = tamanhoDoTerreno;
    }

    public double getTamanhoDoTerreno() {
        return tamanhoDoTerreno;
    }

    public void setTamanhoDoTerreno(double tamanhoDoTerreno) {
        this.tamanhoDoTerreno = tamanhoDoTerreno;
    }


    @Override
    public String toString() {
        return "\nCasa{" +
                "tamanhoDoTerreno=" + tamanhoDoTerreno +
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