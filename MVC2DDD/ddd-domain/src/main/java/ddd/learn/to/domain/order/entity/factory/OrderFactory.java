package ddd.learn.to.domain.order.entity.factory;

import ddd.learn.to.domain.order.entity.Order;
import ddd.learn.to.domain.product.entity.Product;
import ddd.learn.to.domain.user.entity.User;

public class OrderFactory {
    public static Order createOrder(Product product, User user, int itemCount) {
        Order order = new Order();
        order.createOrder(product, user, itemCount);
        return order;
    }
}
