package pl.zimny.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class MapsService {

    public HttpStatus getClosestUsers(){
        // connect to Google Maps
        return HttpStatus.OK;
    }
}
