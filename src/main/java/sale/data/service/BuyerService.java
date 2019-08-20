package sale.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sale.data.model.Buyer;
import sale.data.repository.BuyerRepository;

@Service
public class BuyerService {
    @Autowired
    private BuyerRepository buyerRepository;

    public Buyer createBuyRequest(Buyer buyer) {
        return buyerRepository.save(buyer);
    }
}
