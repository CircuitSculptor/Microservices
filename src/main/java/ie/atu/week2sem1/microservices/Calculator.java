package ie.atu.week2sem1.microservices;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Calculator {

    @GetMapping("/calculate")
    public String calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation)
    {
        int result = 0;
        if (operation.equals("add")){
            result = num1 + num2;
        }
        return String.valueOf(result);
    }

}
