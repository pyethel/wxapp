package com.lehteypzzz.wxapp.Controller;

import com.lehteypzzz.wxapp.Entity.DO.OrderDO;
import com.lehteypzzz.wxapp.Entity.DO.UserDO;
import com.lehteypzzz.wxapp.Service.OrderService;
import com.lehteypzzz.wxapp.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("order")
public class OrderController {
    final
    UserService userService;
    final
    OrderService orderService;

    public OrderController(UserService userService,
                           OrderService orderService) {
        this.userService = userService;
        this.orderService = orderService;
    }

    /**
     *
     * @param type 订单状态
     * @param token 令牌
     * @return 订单列表
     */
    @RequestMapping("getOrder")
    @ResponseBody
    public List<OrderDO> GetOrder(int type, String token){
        UserDO user = userService.findOneByToken(token);
        String userId = user.getOpenID();
        return orderService.queryOrderByUserIdAndState(userId, type);
    }
}
