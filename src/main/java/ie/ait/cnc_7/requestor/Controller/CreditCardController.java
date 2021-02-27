package ie.ait.cnc_7.requestor.Controller;

import ie.ait.cnc_7.requestor.Domain.CreditCard;
import ie.ait.cnc_7.requestor.service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class CreditCardController {

    @Autowired
    private CreditCardService creditCardService;

    @GetMapping(value="/request/{id}")
    public CreditCard GetRequest(@PathVariable Long id){
        return creditCardService.getRequest(id);
    }

    @PostMapping(value = "/request")
    public CreditCard CreateRequest(@Valid @RequestBody CreditCard request){
        return creditCardService.createRequest(request);
    }

    @PutMapping(value = "/request/{id}")
    public CreditCard UpTimestampRequest(@Valid @RequestBody CreditCard request, @PathVariable Long id){
        return creditCardService.upTimestampRequest(request, id);
    }
}
