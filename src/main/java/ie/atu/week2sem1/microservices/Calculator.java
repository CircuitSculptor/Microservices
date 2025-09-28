package ie.atu.week2sem1.microservices;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Calculator {

    @GetMapping("/calculate")
    // Collect 3 pieces of data from the user via the swagger UI
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
            // Check if num2 is 0 and print an error message to the user
            if (num2 == 0){
                return "Error: Cannot divide by zero";
            } else {
                result = num1 / num2;
            }
        }
        // Print results to the user via swagger HTTP
        return String.valueOf(result);
    }
}
