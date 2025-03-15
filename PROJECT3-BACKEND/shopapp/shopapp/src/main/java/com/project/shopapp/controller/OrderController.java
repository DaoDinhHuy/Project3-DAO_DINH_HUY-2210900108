package com.project.shopapp.controller ;

import com.project.shopapp.services.OrderService;
import com.yourpackage.shopapp.dtos.OrderDTO;
import com.yourpackage.shopapp.responses.ApiResponse;
import com.yourpackage.shopapp.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<ApiResponse<List<com.project.shopapp.controller.OrderDTO>>> getAllOrders() {
        List<OrderDTO> orders = orderService.getAllOrders();
        return ResponseEntity.ok(new ApiResponse<>("success", orders));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<O>> getOrderById(@PathVariable Long id) {
        OrderDTO order = orderService.getOrderById(id);
        if (order != null) {
            return ResponseEntity.ok(new ApiResponse<>("success", order));
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<com.project.shopapp.controller.ApiResponse<com.project.shopapp.controller.OrderDTO>> createOrder(@RequestBody OrderDTO orderDTO) {
        com.project.shopapp.controller.OrderDTO createdOrder = orderService.createOrder(orderDTO);
        return ResponseEntity.ok(new ApiResponse<>("Order created", createdOrder));
    }

    @PutMapping("/{id}")
    public ResponseEntity<com.project.shopapp.controller.ApiResponse<com.project.shopapp.controller.OrderDTO>> updateOrder(@PathVariable Long id, @RequestBody OrderDTO orderDTO) {
        OrderDTO updatedOrder = orderService.updateOrder(id, orderDTO);
        if (updatedOrder != null) {
            return ResponseEntity.ok(new ApiResponse<>("Order updated", updatedOrder));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
        return ResponseEntity.ok(new ApiResponse<>("Order deleted", null));
    }
}