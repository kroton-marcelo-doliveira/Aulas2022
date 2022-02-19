package testando_eunm;

import entitie.Order;
import entities.enums.OrderStatus;
import java.util.Date;

public class TestandoEnum {

    public static void main(String[] args){
        Order order = new Order(1010, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);

    }
}
