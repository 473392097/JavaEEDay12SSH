package com.lanou.bean;

/**
 * Created by lanouhn on 17/8/15.
 */
public class SuperHero {
    private int id;
    private String name;
    private String sex;
    private Integer price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SuperHero superHero = (SuperHero) o;

        if (id != superHero.id) return false;
        if (name != null ? !name.equals(superHero.name) : superHero.name != null) return false;
        if (sex != null ? !sex.equals(superHero.sex) : superHero.sex != null) return false;
        if (price != null ? !price.equals(superHero.price) : superHero.price != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SuperHero{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", price=" + price +
                '}';
    }
}
