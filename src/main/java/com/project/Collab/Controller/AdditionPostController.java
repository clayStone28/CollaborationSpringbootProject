package com.project.Collab.Controller;


import com.project.Collab.DTO.AddRequest;
import com.project.Collab.DTO.AddResponse;
import com.project.Collab.Exception.InvalidNumberException;
import com.project.Collab.Service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping("api/additionpost")
public class AdditionPostController {

    @Autowired
    private final AddService addService;

    public AdditionPostController(AddService addService) {
        this.addService = addService;
    }

    @PostMapping("/add")
    public ResponseEntity<AddResponse> add(@RequestBody AddRequest request) {
        System.out.println("The request to add the numbers are:" + request.num1() +
                "and" + request.num2());

        if (request.num1() < 3 || request.num2() < 3) {
            AddResponse addResponse = new AddResponse(-1, 400, 0D, "both the numbers should be more than 3.");
            return new ResponseEntity<>(addResponse, HttpStatusCode.valueOf(400));
        }
        AddResponse response = addService.add(request);

        return ResponseEntity.ok(response);
    }
}
