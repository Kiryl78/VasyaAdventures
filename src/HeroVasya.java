public class HeroVasya extends Person implements Agressive {

    public HeroVasya (int hp, int str, int dex, int xp, int gold, int buff) {
        super(hp,str, dex,xp, gold);
        if (buff == 1) {
            System.out.println("Vasya is a knight! ");
            this.setStr(str+2);
        }
        if (buff == 2) {
            System.out.println("Vasya is a rogue! ");
            this.setDex(dex+2);
        }
    }
}
