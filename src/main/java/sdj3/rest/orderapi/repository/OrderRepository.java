package sdj3.rest.orderapi.repository;


import org.springframework.stereotype.Repository;
import sdj3.rest.orderapi.model.Order0;

import java.util.*;

@Repository  // notify the spring framework , that this is a JAVA bean
public class OrderRepository {
    private static final Map<Long, Order0> orderMap = new HashMap<>();

    // assuming dat arfe  persisted to the database
    static {
        initDataSource();
    }

    private static void initDataSource() {
            Order0 o1 = new Order0(1L, "Exotic Sandwich for lunch", 55.00, true);
            Order0 o2 = new Order0(2L, "Regular pizza", 23.00, false);
            Order0 o3 = new Order0(3L, "Chicken curry", 23.00, false);
            orderMap.put(o1.getId(), o1);
            orderMap.put(o2.getId(), o2);
            orderMap.put(o3.getId(), o3);
    }

    //CRUD R-GET
    public Order0 findById(Long id) {
        return orderMap.get(id);
    }

    //find all
    public List<Order0> findAll() {
//        return orderMap.values().stream().toList();
        Collection<Order0> c = orderMap.values();
        List<Order0> oList = new ArrayList<>();
        oList.addAll(c);
        return oList;

    }

    //PUT -ting U --- Update
    public Order0 update(Order0 order0){
        orderMap.put(order0.getId(),order0);
        return order0;
    }

    //POST/ing C --Create
    public Order0 save(Order0 order0){
       orderMap.put(order0.getId(),order0);
       return order0;
    }
}
