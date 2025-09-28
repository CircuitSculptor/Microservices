package ie.atu.week2sem1.microservices;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Calculator {

    @GetMapping("/calculate")
    public String calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation)
    {
        return "Num1: " + num1 + " Num2: " + num2 + " Operation: " + operation;
    }

}
