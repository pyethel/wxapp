package com.lehteypzzz.wxapp.Controller;

import com.lehteypzzz.wxapp.Entity.DO.OrderDO;
import com.lehteypzzz.wxapp.Entity.DO.UserDO;
import com.lehteypzzz.wxapp.Enum.OrderStateEnum;
import com.lehteypzzz.wxapp.Service.OrderService;
import com.lehteypzzz.wxapp.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller
@RequestMapping("pay")
public class PayController {
    final OrderService orderService;
    final UserService userService;

    public PayController(OrderService orderService,
                         UserService userService) {
        this.orderService = orderService;
        this.userService = userService;
    }

    @RequestMapping("orderCreate")
    @ResponseBody
    public OrderDO OrderCreate(@RequestParam("orderPrice") Integer price,
                               @RequestParam("consigneeAddr") String address,
                               @RequestParam("token") String token) {
        OrderDO order = new OrderDO();
        order.setAddress(address);
        LocalDateTime time = LocalDateTime.now();
        order.setCreateTime(time);
        UserDO user = userService.findOneByToken(token);
        String userId = user.getOpenID();
        order.setUserId(userId);
        order.setPrice(price);
        order.setState(OrderStateEnum.NOT_SEND.type);
        return orderService.saveOrder(order);
    }
}
