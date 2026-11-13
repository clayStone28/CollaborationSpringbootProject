package com.project.Collab.Service;

import com.project.Collab.DTO.AddRequest;
import com.project.Collab.DTO.AddResponse;
import com.project.Collab.Exception.InvalidNumberException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AddService {
    public AddResponse add(AddRequest request)
    {
        if (request.num1() <= 3 || request.num2() <= 3) {
            throw new InvalidNumberException(500, "Failure",0D,"Both numbers should be greater than 3");
        }
        double sum =request.num1() + request.num2();

        return new AddResponse(200,0,sum, "Added Successfullly");
    }

}
