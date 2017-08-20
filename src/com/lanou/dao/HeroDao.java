package com.lanou.dao;

import com.lanou.bean.SuperHero;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

/**
 * Created by lanouhn on 17/8/15.
 */
public class HeroDao extends HibernateDaoSupport{
    public void addHero(SuperHero hero){
        /**
         * dao层的保存方法
         */
        System.out.println("Dao层的保存方法");
        //保存数据
        System.out.println(hero);
        this.getHibernateTemplate().save(hero);

    }
}
