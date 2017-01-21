package com.panhainan.dao;

import com.panhainan.entity.Seckill;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


public class SeckillDaoDaoTest extends BasicDaoTest {
    @Resource
    private SeckillDao seckillDao;


    @Test
    public void testReduceNumber() throws Exception {
        long id = 1000L;
        int updateCount = seckillDao.reduceNumber(id, new Date());
        System.out.println(updateCount);
    }

    @Test
    public void testQueryById() throws Exception {
        long id = 1000L;
        Seckill seckill = seckillDao.queryById(id);
        System.out.println(seckill);
    }

    @Test
    public void testQueryAll() throws Exception {
        int offset = 0;
        int limit = 100;
        List<Seckill> seckillList = seckillDao.queryAll(offset, limit);
        for (Seckill seckill : seckillList) {
            System.out.println(seckill);
        }
    }
}