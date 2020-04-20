package pl.zimny.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class UsersService {


    public HttpStatus registerUser(){
        //validate user data
        // save user to the database
        //send an activation link
        return HttpStatus.OK;
    }

    public HttpStatus reportUser(){
        // validate report data
        // send email to the admin?
        return HttpStatus.OK;
    }

    public HttpStatus confirmMischief(){
        // validate mischief data
        // save mischief to the database
        // validate if qualifies for a ban if yes ban the user - send to Auth service not to let him enter
        // send email to the mischievous user
        return HttpStatus.OK;
    }
}
