package k8sjavamicroservice.serviceorder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class OrderController {
    @GetMapping("/test")
    public String Test() {
        return "Here is order-services";
    }
}
