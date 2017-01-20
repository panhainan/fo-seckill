package com.panhainan.dao;

import com.panhainan.entity.SuccessKilled;

/**
 * Created by FirePan on 2017/1/20.
 */
public interface SuccessKillDao {

    /**
     *
     * @param seckillId
     * @param userPhone
     * @return 插入成功的行数
     */
    int insertSuccessKilled(long seckillId,long userPhone);

    /**
     * 根据id查询SuccessKilled并携带Seckill实体
     * @param seckillId
     * @return 携带Seckill实体的SuccessKilled实体
     */
    SuccessKilled queryByIdWithSeckill(long seckillId);
}
