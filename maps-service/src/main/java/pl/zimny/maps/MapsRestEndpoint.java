package pl.zimny.maps;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.zimny.service.MapsService;

@RestController
@RequiredArgsConstructor
public class MapsRestEndpoint {

    private final MapsService mapsService;

    @GetMapping(path = "/hello")
    public String hello() {
        return "Hello from maps service";
    }

    @GetMapping(path = "/closest")
    public HttpStatus getClosestUsers(){
       return mapsService.getClosestUsers();
    }
}
