package com.ejemplo.soapweb.endpoint;

import org.example.soapweb.generated.GetCountryRequest;
import org.example.soapweb.generated.GetCountryResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;

@Endpoint
@Service
public class CountryEndpoint {

    private static final String NAMESPACE_URI = "http://example.org/soapweb/generated";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    public GetCountryResponse getCountry(@RequestBody GetCountryRequest request) {
        GetCountryResponse response = new GetCountryResponse();
        // Lógica para obtener información del país según la solicitud
        response.setCountryName("United States");
        response.setPopulation(331002651);
        return response;
    }
}
