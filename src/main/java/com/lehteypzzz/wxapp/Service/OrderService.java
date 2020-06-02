package com.lehteypzzz.wxapp.Service;

import com.lehteypzzz.wxapp.DAO.OrderDAO;
import com.lehteypzzz.wxapp.Entity.DO.OrderDO;
import com.lehteypzzz.wxapp.Enum.OrderStateEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class OrderService {
    final
    OrderDAO orderDAO;

    public OrderService(OrderDAO orderDAO) {
        this.orderDAO = orderDAO;
    }

    public OrderDO saveOrder(OrderDO orderDO){
        return orderDAO.save(orderDO);
    }

    public List<OrderDO> queryOrderByUserIdAndState(String userId, Integer type){
        List<OrderDO> result = new ArrayList<>();
        switch (type){
            case 1:
                result = orderDAO.findByUserId(userId);
                break;
            case 2:
                result = orderDAO.findByUserIdAndState(userId, OrderStateEnum.NOT_PAY.type);
                break;
            case 3:
                result = orderDAO.findByUserIdAndState(userId, OrderStateEnum.NOT_SEND.type);
                break;
            case 4:
                result = orderDAO.findByUserIdAndState(userId, OrderStateEnum.NOT_SIGN.type);
                break;
        }
        Collections.reverse(result);
        return result;
    }
}
