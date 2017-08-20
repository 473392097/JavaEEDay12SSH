package com.lanou.action;

import com.lanou.bean.SuperHero;
import com.lanou.service.HeroService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by lanouhn on 17/8/15.
 */
public class HeroAction extends ActionSupport  {
    //用于处理业务逻辑的数据
    private HeroService heroService;
    //用于接收JSP页面传过来的数据
      private SuperHero superHero;


    /**
     * 添加方法
     * @return
     */
    public String addHero(){
          //调用对应的service方法
          heroService.addHero(superHero);
          return SUCCESS;
      }

    public SuperHero getSuperHero() {
        return superHero;
    }

    public void setSuperHero(SuperHero superHero) {
        this.superHero = superHero;
    }

    public HeroService getHeroService() {
        return heroService;
    }

    public void setHeroService(HeroService heroService) {
        this.heroService = heroService;
    }
}
