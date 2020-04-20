package pl.zimny.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CardsService {

    public HttpStatus createUserCard(){
        //validate card data
        // save card to the database
        return  HttpStatus.OK;
    }

    public HttpStatus getAllMatches(){
        // retrieve all matches from the database
        return  HttpStatus.OK;
    }

    public HttpStatus getClosestUsers(){
        // ask maps service for the users
        // retrieve from the database the users that I didnt like?
        // filter users that i didnt like?
        return  HttpStatus.OK;
    }

    public HttpStatus saveLike(){
        //validate like data
        //save like to the database
        // varify if match if yes save to the database
        return HttpStatus.OK;
    }
}

