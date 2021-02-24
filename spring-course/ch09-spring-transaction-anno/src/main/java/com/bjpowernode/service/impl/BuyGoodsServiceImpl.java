package com.bjpowernode.service.impl;

import com.bjpowernode.dao.GoodsDao;
import com.bjpowernode.dao.SaleDao;
import com.bjpowernode.domain.Goods;
import com.bjpowernode.domain.Sale;
import com.bjpowernode.excep.NotEnoughException;
import com.bjpowernode.service.BuyGoodsService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class BuyGoodsServiceImpl implements BuyGoodsService {

    private SaleDao saleDao;
    private GoodsDao goodsDao;

    /*
        rollBFBackFor:表示发生指定的异常一定回滚
        处理逻辑：
            1）spring框架首先检查方法抛出的异常是不是在rollbackFor的属性值中，
                如果异常存在，不管什么类型的异常，一定回滚；
               2）如果抛出的异常不在rollbackFor属性值中，spring会判断异常是不是RuntimeException，
                如果是一定回滚
     */
//    @Transactional(
//          propagation = Propagation.REQUIRED,
//          isolation = Isolation.DEFAULT,
//          readOnly = false,
//          rollbackFor = {
//                  NullPointerException.class, NotEnoughException.class
//          }
//    )
    @Transactional
    @Override
    public void buy(Integer goodsId, Integer nums) {
        System.out.println("buy方法的开始");
        //记录销售信息，向销售表添加记录
        Sale sale = new Sale();
        sale.setGid(goodsId);
        sale.setNums(nums);
        saleDao.insertSale(sale);
        //更新库存
        Goods goods = goodsDao.selectGoods(goodsId);
        if(goods ==null){
            //商品不存在
            throw new NullPointerException(goodsId+",商品不存在");
        }else if (goods.getAmount()<nums){
            //商品库存不足
            throw new NotEnoughException(goodsId+",商品库存不足");
        }
        //修改库存
        Goods buyGoods = new Goods();
        buyGoods.setId(goodsId);
        buyGoods.setAmount(nums);
        goodsDao.updateGoods(buyGoods);
        System.out.println("buy方法的完成");

    }

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }

}
