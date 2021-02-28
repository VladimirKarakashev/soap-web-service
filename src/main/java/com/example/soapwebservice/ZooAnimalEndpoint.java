package com.example.soapwebservice;

import com.animals.soap_zoo_ws.GetZooAnimalRequest;
import com.animals.soap_zoo_ws.GetZooAnimalResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ZooAnimalEndpoint {

    @Autowired
    public AnimalServiceRepo animalServiceRepo;

    @PayloadRoot(namespace = "http://animals.com/soap-zoo-ws",
                 localPart = "getZooAnimalRequest")
    @ResponsePayload
    public GetZooAnimalResponse getAnimalRequest (@RequestPayload GetZooAnimalRequest request) {
        GetZooAnimalResponse response = new GetZooAnimalResponse();
        response.setAnimal(animalServiceRepo.getAnimals(request.getName()));
        return response;
    }

}
