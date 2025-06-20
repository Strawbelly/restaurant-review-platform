package com.hmdp.service;

import com.hmdp.dto.Result;
import com.hmdp.entity.ShopType;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Hewen Shen
 * @since 2025-04-12
 */
public interface IShopTypeService extends IService<ShopType> {

    Result queryTypeList();
}
