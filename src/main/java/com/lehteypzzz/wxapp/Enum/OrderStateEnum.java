package com.lehteypzzz.wxapp.Enum;

public enum OrderStateEnum {
    NOT_PAY(2, "待支付"),
    NOT_SEND(3, "待发货"),
    NOT_SIGN(4, "退款/退货");

    public final Integer type;
    public final String content;
    OrderStateEnum(Integer type, String content){
        this.type = type;
        this.content = content;
    }
}
