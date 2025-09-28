package ie.atu.week2sem1.microservices;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping
public class Calculator {

    @GetMapping("/calculate")
    public String calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation)
    {
        int result = 0;
        if (operation.equals("add")){
            result = num1 + num2;
        } else if (operation.equals("subtract")){
            result = num1 - num2;
        } else if (operation.equals("multiply")){
            result = num1 * num2;
        } else if (operation.equals("divide")){
            if (num2 == 0){
                return "Error: Cannot divide by zero";
            } else {
                result = num1 / num2;
            }
        }
        return String.valueOf(result);
    }
}
