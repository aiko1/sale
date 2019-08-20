package sale.data.request;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import sale.data.model.Seller;
import sale.data.service.SellerService;
import sale.data.util.RabbitMQConnection;

import java.io.IOException;

public class SellRequest implements Runnable {
    public final static String SELL_QUEUE_NAME = "sell";
    private static int counter = 1;
    private SellerService sellerService;

    public SellRequest(SellerService sellerService) {
        this.sellerService = sellerService;
    }

    public SellRequest() {
    }

    public void sendSellRequest() {
        try {
            RabbitMQConnection.sendRequest(SELL_QUEUE_NAME, getTestSeller().getBytes("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getTestSeller() throws JsonProcessingException {
        Seller seller = sellerService
                .createSellRequest(new Seller(counter++, "smartphone", counter * 100, counter));

        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(seller);
    }

    @Override
    public void run() {
        sendSellRequest();
    }
}
