package br.com.wsdl.server.service.impl;

import com.example.cotacaoveiculo.ObterCotacaoByCurrencyQueryImp;
import org.apache.log4j.Logger;

import java.util.Random;

public class DefaultObterCotacaoByCurrencyQueryImpl implements ObterCotacaoByCurrencyQueryImp {
    private static final Logger LOG = Logger.getLogger(ObterCotacaoWebService.class.getName());

    @Override
    public double obterCotacaoInternacional(String marcaVeiculo, String currency) {
        LOG.info(String.format("obterCotacaoInternacional invoked marcaVeiculo {} with Currency {}", marcaVeiculo,
                currency));

        double basePrice;
        switch (marcaVeiculo) {
            case "VOLKS" : basePrice = 12000; break;
            case "FIAT" : basePrice = 9000; break;
            case "FORD" : basePrice = 22000; break;
            case "AUDI" : basePrice = 90000; break;
            default: basePrice = new Random().nextInt(Integer.MAX_VALUE) + 1; break;
        }

        return returnValueInNewCurrency(basePrice, currency);
    }

    private double returnValueInNewCurrency(double value, String currency) {
        if("BRL".equalsIgnoreCase(currency)) {
            return value * 10000;
        } else {
            return value/2;
        }

    }
}
