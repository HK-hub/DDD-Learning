package ddd.learn.to.domain.order.entity.factory;

import ddd.learn.to.domain.order.entity.Order;
import ddd.learn.to.domain.product.entity.Product;
import ddd.learn.to.domain.user.entity.User;

/**
 * @ClassName : OrderFactory
 * @author : HK意境
 * @date : 2023/10/7 19:52
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class OrderFactory {
    public static Order createOrder(Product product, User user, int itemCount) {
        Order order = new Order();
        order.createOrder(product, user, itemCount);
        return order;
    }
}
