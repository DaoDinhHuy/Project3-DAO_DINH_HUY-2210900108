package com.project.shopapp.services;

import com.yourpackage.shopapp.dtos.OrderDTO;
import com.yourpackage.shopapp.models.Order;
import com.yourpackage.shopapp.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<OrderDTO> getAllOrders() {
        return orderRepository.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public OrderDTO getOrderById(Long id) {
        Order order = orderRepository.findById(id).orElse(null);
        return order != null ? convertToDTO(order) : null;
    }

    public OrderDTO createOrder(OrderDTO orderDTO) {
        Order order = convertToEntity(orderDTO);
        order = orderRepository.save(order);
        return convertToDTO(order);
    }

    public OrderDTO updateOrder(Long id, OrderDTO orderDTO) {
        Order order = orderRepository.findById(id).orElse(null);
        if (order != null) {
            order.setFullName(orderDTO.getFullName());
            order.setEmail(orderDTO.getEmail());
            order.setPhoneNumber(orderDTO.getPhoneNumber());
            order.setAddress(orderDTO.getAddress());
            order.setStatus(Order.Status.valueOf(orderDTO.getStatus()));
            order.setTotalMoney(orderDTO.getTotalMoney());
            order = orderRepository.save(order);
            return convertToDTO(order);
        }
        return null;
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }

    private OrderDTO convertToDTO(Order order) {
        OrderDTO dto = new OrderDTO();
        dto.setId(order.getId());
        dto.setUserId(order.getUser() != null ? order.getUser().getId() : null);
        dto.setFullName(order.getFullName());
        dto.setEmail(order.getEmail());
        dto.setPhoneNumber(order.getPhoneNumber());
        dto.setAddress(order.getAddress());
        dto.setStatus(order.getStatus().name());
        dto.setTotalMoney(order.getTotalMoney());
        return dto;
    }

    private Order convertToEntity(OrderDTO dto) {
        Order order = new Order();
        order.setFullName(dto.getFullName());
        order.setEmail(dto.getEmail());
        order.setPhoneNumber(dto.getPhoneNumber());
        order.setAddress(dto.getAddress());
        order.setStatus(Order.Status.valueOf(dto.getStatus()));
        order.setTotalMoney(dto.getTotalMoney());
        return order;
    }
}