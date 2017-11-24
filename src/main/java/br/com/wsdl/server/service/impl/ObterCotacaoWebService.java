package br.com.wsdl.server.service.impl;

import com.example.cotacaoveiculo.ObterCotacaoQueryImpImpl;
import org.apache.log4j.Logger;

import java.util.Random;

/**
 * Created by ringaramo on 24/11/17.
 */
public class ObterCotacaoWebService extends ObterCotacaoQueryImpImpl {
    private static final Logger LOG = Logger.getLogger(ObterCotacaoWebService.class.getName());

    @Override
    public double obterCotacao(String marcaVeiculo) {
        LOG.info("obterCotacao invoked marcaVeiculo " + marcaVeiculo);

        if ("VOLKS".equals(marcaVeiculo)) {
            return 20000.00;
        } else if ("FIAT".equals(marcaVeiculo)) {
            return 30000.00;
        } else if ("FORD".equals(marcaVeiculo)) {
            return 40000.00;
        } else if ("AUDI".equals(marcaVeiculo)) {
            return 100000.00;
        } else {
            return new Random().nextInt(Integer.MAX_VALUE) + 1;
        }
    }
}
