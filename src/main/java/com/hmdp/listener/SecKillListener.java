package com.hmdp.listener;

import com.hmdp.entity.VoucherOrder;
import com.hmdp.service.IVoucherOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class SecKillListener {

    private final IVoucherOrderService voucherOrderService;

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(name = "seckill.queue", durable = "true"),
            exchange = @Exchange(name = "seckill.direct"),
            key = "seckill.order"
    ))
    public void ListenSecKillOrder(VoucherOrder voucherOrder) {
        voucherOrderService.handleVoucherOrder(voucherOrder);
    }
}
