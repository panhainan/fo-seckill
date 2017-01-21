package com.panhainan.dao;

import com.panhainan.entity.SuccessKilled;
import org.junit.Test;

import javax.annotation.Resource;

public class SuccessKillDaoDaoTest extends BasicDaoTest {
    @Resource
    SuccessKillDao successKillDao;

    @org.junit.Test
    public void testInsertSuccessKilled() throws Exception {
        long seckillId = 1000L;
        long userPhone = 13827985634L;
        int insertCount = successKillDao.insertSuccessKilled(seckillId,userPhone);
        System.out.println(insertCount);
    }

    @Test
    public void testQueryByIdWithSeckill() throws Exception {
        long seckillId = 1000L;
        long userPhone = 13827985634L;
        SuccessKilled successKilled = successKillDao.queryByIdWithSeckill(seckillId,userPhone);
        System.out.println(successKilled);
    }
}