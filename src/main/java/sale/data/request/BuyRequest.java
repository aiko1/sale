package sale.data.request;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import sale.data.model.Buyer;
import sale.data.service.BuyerService;
import sale.data.util.RabbitMQConnection;

import java.io.IOException;

public class BuyRequest implements Runnable {
    public final static String BUY_QUEUE_NAME = "buy";
    private static int count = 1;
    private BuyerService service;

    public BuyRequest(BuyerService service) {
        this.service = service;
    }

    public BuyRequest() {
    }

    public void sendBuyRequest() {
        try {
            RabbitMQConnection.sendRequest(BUY_QUEUE_NAME, getTestBuyer().getBytes("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getTestBuyer() throws JsonProcessingException {
        Buyer buyer = service
                .createBuyRequest(
                        new Buyer(count++, "KZ90893048203" + count, "smartphone", count * 100, count));

        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(buyer);
    }

    @Override
    public void run() {
        sendBuyRequest();
    }
}
