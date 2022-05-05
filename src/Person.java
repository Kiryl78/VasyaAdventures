import java.util.Random;

public abstract class Person implements Agressive {
    private int hp,str, dex, xp, gold;

    public Person(int hp, int str, int dex, int xp, int gold ) {
        this.hp = hp;
        this.str = str;
        this.dex = dex;
        this.xp = xp;
        this.gold = gold;
    }

    @Override
    public int slash() {
        if (dex * 3 > (int) Math.random() * 100) return str; else return 0;
    }

    @Override
    public String toString() {
        return String.format("Vasya stats HP %d, XP %d, Gold %d", hp, xp, gold);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
