package com.panhainan.dao;

import com.panhainan.entity.SuccessKilled;
import org.apache.ibatis.annotations.Param;

/**
 * Created by FirePan on 2017/1/20.
 */
public interface SuccessKillDao {

    /**
     * @param seckillId
     * @param userPhone
     * @return 插入成功的行数
     */
    int insertSuccessKilled(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

    /**
     * 根据id查询SuccessKilled并携带Seckill实体
     *
     * @param seckillId
     * @return 携带Seckill实体的SuccessKilled实体
     */
    SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);
}
