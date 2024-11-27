package com.project.ecommerce.service.order;

import com.project.ecommerce.dto.OrderDto;
import com.project.ecommerce.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);

    OrderDto convertToDto(Order order);
}
