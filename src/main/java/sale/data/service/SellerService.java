package sale.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sale.data.model.Seller;
import sale.data.repository.SellerRepository;

@Service
public class SellerService {
    @Autowired
    private SellerRepository sellerRepository;

    public Seller createSellRequest(Seller seller) {
        return sellerRepository.save(seller);
    }
}
