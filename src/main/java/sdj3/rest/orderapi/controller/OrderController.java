package sdj3.rest.orderapi.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sdj3.rest.orderapi.model.Order0;
import sdj3.rest.orderapi.repository.OrderRepository;

import java.util.List;

@RestController
@RequestMapping("/")
public class OrderController {
    private OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @RequestMapping("/home")
    @ResponseBody
    public String welcome() {
        return "Welcome to the world of RESTful APIs";
    }

    //GET/ing an order given an id
    @RequestMapping(value = "/orders/{id}",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public Order0 getOrderById(@PathVariable("id") Long id) {
        return orderRepository.findById(id);
    }

    @RequestMapping(value = "/orders",
            method = RequestMethod.GET)
    @ResponseBody
    public List<Order0> getAllOrders() {
        return orderRepository.findAll();
    }

    @RequestMapping(value = "/orders",
            method = RequestMethod.POST)
    @ResponseBody
    public Order0 createOrder(@RequestBody Order0 order0) {
        System.out.println("[Backend - Server ] Creating order : " + order0.getId());
        return orderRepository.save(order0);
    }


    @RequestMapping(value = "/orders/{id}",
            method = RequestMethod.PUT)
    @ResponseBody
    public Order0 updateOrder(@RequestBody Order0 order0) {
        System.out.println("[Backend - Server ] Editing order : " + order0.getId());
        return orderRepository.update(order0);
    }

}
