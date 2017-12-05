package com.wenzl.abilityview;

public class AbilityBean {
    public static final String[] ABILITY
            = {"击杀", "生存", "助攻", "物理",
            "魔法", "防御", "金钱"};
    //每个能力的值，范围0~100，单位%

    private int kill;
    private int survival;
    private int assist;
    private int ad;
    private int ap;
    private int defense;
    private int money;

    public AbilityBean(){}

    public AbilityBean(int kill, int survival,
                       int assist, int ad, int ap,
                       int defense, int money) {
        this.kill = kill;
        this.survival = survival;
        this.assist = assist;
        this.ad = ad;
        this.ap = ap;
        this.defense = defense;
        this.money = money;
    }
    public static String[] getAbility() {
        return ABILITY;
    }
    public int[] getAbilityDataArray() {
        int[] allAbility = {kill, survival,
                assist, ad, ap, defense, money};
        return allAbility;
    }

    public boolean equalsAbility(AbilityBean data) {
        if (data == null) {
            return false;
        }
        boolean flag = true;
        flag = flag & data.getKill()==this.kill;
        flag = flag & data.getAssist()==this.assist;
        flag = flag & data.getAd()==this.ad;
        flag = flag & data.getAp()==this.ap;
        flag = flag & data.getMoney()==this.money;
        flag = flag & data.getDefense()==this.defense;
        flag = flag & data.getSurvival()==this.survival;
        return flag;
    }

    public static String[] getABILITY() {
        return ABILITY;
    }

    public int getKill() {
        return kill;
    }

    public int getSurvival() {
        return survival;
    }

    public int getAssist() {
        return assist;
    }

    public int getAd() {
        return ad;
    }

    public int getAp() {
        return ap;
    }

    public int getDefense() {
        return defense;
    }

    public int getMoney() {
        return money;
    }

    public void setKill(int kill) {
        this.kill = kill;
    }

    public void setSurvival(int survival) {
        this.survival = survival;
    }

    public void setAssist(int assist) {
        this.assist = assist;
    }

    public void setAd(int ad) {
        this.ad = ad;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
