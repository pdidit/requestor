package ie.ait.cnc_7.requestor.service;

import ie.ait.cnc_7.requestor.Domain.Requestor;
import ie.ait.cnc_7.requestor.Repros.RequestorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RequestorService {

    @Autowired
    private RequestorRepository requestorRepository;

    public Requestor updateRequest(Requestor request, Integer id) {
        Optional<Requestor> existingRequest = Optional.of(requestorRepository.getOne(id));
        if(existingRequest.isPresent()) {
            return requestorRepository.saveAndFlush(request);
        } else {
            return null;
        }
    }

    public Requestor createRequest(Requestor request){
        return requestorRepository.saveAndFlush(request);
    }
}
