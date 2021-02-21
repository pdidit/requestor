package ie.ait.cnc_7.requestor.Controller;

import ie.ait.cnc_7.requestor.Domain.Requestor;
import ie.ait.cnc_7.requestor.service.RequestorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class RequestorController {

    @Autowired
    private RequestorService requestorService;

    @PostMapping(value = "/request")
    public Requestor CreateRequest(@RequestBody Requestor request){
        return requestorService.createRequest(request);
    }

    @PutMapping(value = "/request/{id}")
    public Requestor UpdateRequest(@RequestBody Requestor request, @PathVariable Integer id){
        return requestorService.updateRequest(request, id);
    }
}
