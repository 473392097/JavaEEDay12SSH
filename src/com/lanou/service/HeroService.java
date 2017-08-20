package com.lanou.service;

import com.lanou.bean.SuperHero;
import com.lanou.dao.HeroDao;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by lanouhn on 17/8/15.
 */
@Transactional
public class HeroService {
    private HeroDao heroDao;

    public HeroDao getHeroDao() {
        return heroDao;
    }

    public void setHeroDao(HeroDao heroDao) {
        this.heroDao = heroDao;
    }

    /**
     * Service层的添加方法的
     * @param hero
     */

    public  void  addHero(SuperHero hero){
        System.out.println("service层的处理方法");
        //调用dao层的方法
        heroDao.addHero(hero);
    }
}
