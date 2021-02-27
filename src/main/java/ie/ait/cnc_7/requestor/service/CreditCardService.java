package ie.ait.cnc_7.requestor.service;

import ie.ait.cnc_7.requestor.Domain.CreditCard;
import ie.ait.cnc_7.requestor.Repros.CreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditCardService {

    @Autowired
    private CreditCardRepository creditCardRepository;

    public CreditCard upTimestampRequest(CreditCard request, Long id) {
        return creditCardRepository.findById(id)
                .map(creditCard -> {
                    creditCard.setName(request.getName());
                    creditCard.setAuthcode(request.getAuthcode());
                    creditCard.setAuthtime(request.getAuthtime());
                    creditCard.setComptime(request.getComptime());
                    creditCard.setCsv(request.getCsv());
                    creditCard.setExpmonth(request.getExpmonth());
                    creditCard.setExpyear(request.getExpyear());
                    creditCard.setTranid(request.getTranid());

                    creditCard.setInitime(request.getInitime());
                    creditCard.setMerchid(request.getMerchid());
                    return creditCardRepository.save(creditCard);
                })
                .orElseGet(() -> {
                    request.setPan(request.getPan());
                    return creditCardRepository.save(request);
                });
    }

    public CreditCard createRequest(CreditCard request){
        return creditCardRepository.save(request);
    }

    public CreditCard getRequest(Long id) { return creditCardRepository.getOne(id); }
}
