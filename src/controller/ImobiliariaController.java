package controller;

import model.*;
import java.text.NumberFormat;
import java.util.*;

public class ImobiliariaController {
    public static void main(String[] args) {
        //B
        Casa casa1 = new Casa("Rua", "Epitacio Pessoa", 256,
                "Sem Complemento", "Fragata", "96045-630", "Pelotas", 45.40,
                300000.00, 400000.00, 5.0, 60.00);

        Casa casa2 = new Casa("Rua", "Matheus Gomes Viana", 356,
                "Próximo ao Parque", "Moinhos", "92000-000", "Porto Alegre", 65.60,
                500000.00, 800000.00, 5.5, 50.00);

        Apartamento ap1 = new Apartamento("Avenida", "Bento Gonçalves", 386,
                "Próximo ao Parque", "Moinhos", "92010-000", "Porto Alegre", 80.20,
                600000.00, 990000.00, 6.5, "Villa Portuguesa");

        Apartamento ap2 = new Apartamento("Rua", "Flor do Jardim", 586,
                "Sem Complemento", "Jardim", "92090-000", "Pelotas", 38.00,
                500000.00, 800000.00, 6.0, "Villa Portuguesa");

        UnidadePortoAlegre POA1 = new UnidadePortoAlegre("casaspoa.com", "10.000.000/0001-00",
                500000.00, 3000.00, 5.0);

        UnidadePortoAlegre POA2 = new UnidadePortoAlegre("Aluguel POA", "11.111.111/1111-11",
                750000.00, 4500.00, 4.5);

        UnidadePelotas PEL1 = new UnidadePelotas("Casa PEL", "22.222.222/2222-22",
                600000.00, 3500.00, 6.0);

        UnidadePelotas PEL2 = new UnidadePelotas("Moradas PEL", "33.333.333/3333-33",
                800000.00, 5000.00, 4.0);

        //C
        System.out.println("*********** Exercicio C *************");
        System.out.println(casa1);
        System.out.println(casa2);
        System.out.println(ap1);
        System.out.println(ap2);
        System.out.println(POA1);
        System.out.println(POA2);
        System.out.println(PEL1);
        System.out.println(PEL2);

        //D
        System.out.println("******** Exercicio D ********");
        List<Portfolio> Portfolio = new ArrayList<>();
        Portfolio.add(ap1);
        Portfolio.add(ap2);
        Portfolio.add(casa1);
        Portfolio.add(casa2);
        Portfolio.add(PEL1);
        Portfolio.add(PEL2);
        Portfolio.add(POA1);
        Portfolio.add(POA2);
        System.out.println("Lista criada:");
        System.out.println(Portfolio);

        //E - foi feito no exercicio b;

        //F
        System.out.println(" \n ******** Exercicio F ******** \n ");
        double estimativa = 0.0;
        for (Portfolio item : Portfolio) {
            if (item instanceof Imovel) {
                Imovel imovel = (Imovel) item;
                estimativa = (imovel.getPrecoDeCotacao() * imovel.getITBI()) / 100;
                System.out.println("Cotação " + imovel.getPrecoDeCotacao() + "  e taxa de porcentagem do ITBI: "
                        + imovel.getITBI() + " tem estimativa de ITBI total: " + estimativa);
            }
        }

    }
}