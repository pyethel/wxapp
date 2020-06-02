package com.lehteypzzz.wxapp.DAO;

import com.lehteypzzz.wxapp.Entity.DO.OrderDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderDAO extends JpaRepository<OrderDO, Integer> {
    @Query(value="select * from order1 o where o.user_id=?1 and o.order_state=?2", nativeQuery = true)
    List<OrderDO> findByUserIdAndState(String userId, Integer state);

    List<OrderDO> findByUserId(String userId);
}
