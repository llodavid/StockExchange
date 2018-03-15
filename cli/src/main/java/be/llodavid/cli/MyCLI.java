package be.llodavid.cli;

import be.llodavid.api.StockDTO;
import be.llodavid.api.StockExchangeController;
import be.llodavid.api.StockMapper;
import be.llodavid.service.StockService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"be.llodavid"})
public class MyCLI {
    public static void main(String[] args) {
        if (args.length==1) {
            try {
                getStockDTO(args[0]);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void getStockDTO(String arg) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyCLI.class);
        StockExchangeController stockExchangeController = StockExchangeController.getInstance(
                applicationContext.getBean(StockService.class),
                applicationContext.getBean(StockMapper.class));
        StockDTO stockDTO = stockExchangeController.getStock(arg);
        System.out.println(stockDTO);
    }
}
