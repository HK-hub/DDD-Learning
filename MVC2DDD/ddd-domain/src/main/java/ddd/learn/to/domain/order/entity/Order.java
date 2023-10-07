package ddd.learn.to.domain.order.entity;

import ddd.learn.to.domain.common.util.IdUtils;
import ddd.learn.to.domain.order.constant.OrderEnum;
import ddd.learn.to.domain.product.entity.Product;
import ddd.learn.to.domain.user.entity.User;

public class Order {
    private String orderId;
    private int count;
    private double totalPrice;
    private String address;
    private int status;

    public void createOrder(Product product, User user, int  count) {
        this.address = user.getAddress();
        this.status = OrderEnum.OrderSuccess;
        this.generateOrderId();
        this.calculateTotalPrice(product.getPrice(), count);
    }

    private void generateOrderId() {
        this.orderId = IdUtils.generateId();
    }

    private void calculateTotalPrice(double price, int count) {
        this.count = count;
        this.totalPrice = price * count;
    }

    // ...其他属性和方法
}



