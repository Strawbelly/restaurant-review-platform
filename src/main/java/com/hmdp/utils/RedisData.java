package com.hmdp.utils;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RedisData {
    private LocalDateTime expireTime;//逻辑过期时间
    //装饰器模式：通过将对象放入包含行为的特殊包装类中来为原始对象动态地添加新行为
    //这种模式是继承的一种替代方案，可以灵活地扩展对象的功能
    private Object data;
}
