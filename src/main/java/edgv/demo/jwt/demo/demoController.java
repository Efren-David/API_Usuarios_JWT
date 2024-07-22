package edgv.demo.jwt.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class demoController {
    
    @PostMapping(value = "demo")
    public String welcome()
    {
        return "welcome from secure endponid";
    }
}
