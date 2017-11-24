package br.com.wsdl.server;

import br.com.wsdl.server.service.impl.ObterCotacaoWebService;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * Created by ringaramo on 24/11/17.
 */
@Configuration
public class WebServiceConfiguration {
    @Autowired
    private Bus bus;

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new ObterCotacaoWebService());
        endpoint.publish("/obterCotacao");
        return endpoint;
    }
}
