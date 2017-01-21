package com.panhainan.dao;

import com.panhainan.entity.Seckill;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by FirePan on 2017/1/20.
 */
public interface SeckillDao {

    /**
     * 减库存
     * @param seckillId
     * @param killTime
     * @return 如果受影响的行数>=1，表示更新成功
     */
    int reduceNumber(@Param("seckillId")long seckillId,@Param("killTime")Date killTime);

    /**
     * 根据ID查询秒杀对象
     * @param seckillId
     * @return Seckill
     */
    Seckill queryById(long seckillId);

    /**
     * 根据偏移量查询秒杀商品列表
     * @param offset
     * @param limit
     * @return List<Seckill>
     */
    List<Seckill> queryAll(@Param("offset")int offset,@Param("limit")int limit);

}
